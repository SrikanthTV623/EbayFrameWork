package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//h1[@class='main-title font-title-1']")
    WebElement verifyingCartPageText;

    @FindBy(xpath = "//a[@data-test-id='cart-item-link']")
    List<WebElement> itemsOnCart;

    @FindBy(xpath = "//div[@class='cart-summary-line-item']/div[@data-test-id='ITEM_TOTAL']/span/span/span")
    WebElement itemsSubTotalValue;
    @FindBy(xpath = "//div[@class='grid-item-price']/div/div/div/span/span/span")
    List<WebElement> itemsPricesInCart;
    @FindBy(xpath = "//div[@class='cart-summary-line-item']/div[@data-test-id='SHIPPING']/span/span/span")
    WebElement taxPrice;
    @FindBy(xpath = "//div[@class='cart-summary-line-item']/div[@data-test-id='SUBTOTAL']/span/span/span")
    WebElement totalPriceOfCart;



    public String isCartPageDisplayed(){
        return verifyingCartPageText.getText();
    }


    public List<String> getItemsFromCart(){

        List<String> itemNamesOnCart = new ArrayList<>();
        for(WebElement item : itemsOnCart){
            itemNamesOnCart.add(item.getText());
        }
        Collections.reverse(itemNamesOnCart);
        return itemNamesOnCart;

    }

    public Boolean isFinalPriceIsMatchingWithItemTotalPrice(){

        double totalItemPrice=0;
        for(WebElement price : itemsPricesInCart){
            totalItemPrice = totalItemPrice + Double.parseDouble(price.getText().split("\\$")[1]);
        }

        double totalPriceOnWeb = Double.parseDouble(totalPriceOfCart.getText().split("\\$")[1]);
        double totalPriceAfterTax = totalItemPrice + Double.parseDouble(taxPrice.getText().split("\\$")[1]);
        totalPriceAfterTax = Math.round(totalPriceAfterTax*100.0)/100.0;

        System.out.println("Price on Web===" + totalPriceOnWeb);
        System.out.println("Price after calculation===" + totalPriceAfterTax);

        return totalPriceOnWeb == totalPriceAfterTax;
    }
}
