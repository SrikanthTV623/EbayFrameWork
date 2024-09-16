package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DescriptionPage extends BasePage {

    @FindBy(xpath = "//a[@id=\"binBtn_btn_1\"]")
    WebElement buyNowButton;
    @FindBy(xpath = "//h1[@class='x-item-title__mainTitle']/span")
    WebElement laptopItem1Text;

    @FindBy(xpath = "//a[@id='atcBtn_btn_1']")
    WebElement addToCartElement;

    public Boolean isProductDescriptionPageDisplayed(){
        return buyNowButton.isDisplayed();
    }

    public void clickOnAddToCart() {
        addToCartElement.click();
    }
    public String laptopTextToVerify(){
        return laptopItem1Text.getText();
    }
}
