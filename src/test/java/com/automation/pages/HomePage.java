package com.automation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "gh-ac")
    WebElement searchBar;


    public void openWebsite() {
        driver.get("https://www.ebay.com/");
    }

    public Boolean isHomePageDisplayed(){
        return searchBar.isDisplayed();
    }

    public void clicksOnSearchBar(){
        searchBar.click();
    }
    public void doSearchForLaptop(){
        searchBar.sendKeys("laptop");
        searchBar.sendKeys(Keys.ENTER);
    }
    public void closeDriver(){
        //to close or navigate back the driver to home page
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().stream().toList().get(0));
    }
    public void doSearchForMobile(){
        /*
        //here we will navigate from cart page of laptop to home page of laptop
        //then we will send key as iphone to search
        driver.navigate().back();
        driver.navigate().back();
         */
        //.clear() -> used to clear the search box because we get laptopiphone like that so
        searchBar.clear();
        searchBar.sendKeys("iphone 14 pro max");
        searchBar.sendKeys(Keys.ENTER);
    }

}
