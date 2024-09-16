package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class MobilePage extends BasePage {

    @FindBy(xpath = "//h1/span/following-sibling::span")
    WebElement iphoneText;
    @FindBy(xpath = "//ul[@class='srp-results srp-list clearfix']/li[2]//following-sibling::div[@class='s-item__info clearfix']/a[@class='s-item__link']")
    WebElement iphoneItem1;

    public String isMobilePageDisplayed(){
        return iphoneText.getText();
    }
    public void clickOnFirstIphoneItem(){
        iphoneItem1.click();
        navigate();
    }
    public void navigate(){
        Set<String> windowHandles = driver.getWindowHandles();
        String currentWindow = driver.getWindowHandle();
        for(String url:windowHandles){
            if(!currentWindow.equals(url)){
                driver.switchTo().window(url);
            }
        }
    }

}
