package com.automation.steps;

import com.automation.pages.LaptopPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LaptopSteps {

    LaptopPage laptopPage = new LaptopPage();

    @Then("verify user is on laptop items page")
    public void verifyUserIsOnLaptopItemsPage() {
        Assert.assertEquals("laptop",laptopPage.isLaptopPageDisplayed());
    }

    @When("user click on first laptop item")
    public void userClickOnFirstLaptopItem() {
        laptopPage.clickOnFirstLaptopItem();
    }
}
