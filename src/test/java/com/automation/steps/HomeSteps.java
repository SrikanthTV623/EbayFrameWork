package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens website")
    public void userOpensWebsite() {
        homePage.openWebsite();
    }

    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        homePage.isHomePageDisplayed();
    }

    @When("user clicks on search bar")
    public void userClicksOnSearchBar() {
        homePage.clicksOnSearchBar();
    }

    @And("user search for laptop")
    public void userSearchForLaptop() {
        homePage.doSearchForLaptop();
    }

    @When("user search for mobile")
    public void userSearchForMobile() {
        homePage.closeDriver();
        homePage.doSearchForMobile();
    }
}
