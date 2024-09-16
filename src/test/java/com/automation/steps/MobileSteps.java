package com.automation.steps;

import com.automation.pages.MobilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MobileSteps {
    MobilePage mobilePage = new MobilePage();

    @Then("verify user is on mobile items page")
    public void verifyUserIsOnMobileItemsPage() {
        Assert.assertEquals("iphone 14 pro max",mobilePage.isMobilePageDisplayed());
    }

    @When("user click on first mobile item")
    public void userClickOnFirstMobileItem() {
        mobilePage.clickOnFirstIphoneItem();
    }
}
