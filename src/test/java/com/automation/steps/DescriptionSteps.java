package com.automation.steps;

import com.automation.pages.DescriptionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class DescriptionSteps {

    DescriptionPage product = new DescriptionPage();
    static List<String> itemsOnCart = new ArrayList<>();

    @Then("verify user is on product description page")
    public void verifyUserIsOnProductDescriptionPage() {
        product.isProductDescriptionPageDisplayed();
    }
    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        itemsOnCart.add(product.laptopTextToVerify());
        product.clickOnAddToCart();
    }

    @When("user select color")
    public void userSelectColor() {
    }
}
