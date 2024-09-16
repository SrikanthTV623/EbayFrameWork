package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage = new CartPage();
    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        Assert.assertEquals("Shopping cart",cartPage.isCartPageDisplayed());
    }

    @And("verify item is added into cart")
    public void verifyItemIsAddedIntoCart() {
        Assert.assertEquals(DescriptionSteps.itemsOnCart,
                cartPage.getItemsFromCart());
    }

    @Then("verify item prices display correctly in cart page")
    public void verifyItemPricesDisplayCorrectlyInCartPage() {
        Assert.assertTrue(cartPage.isFinalPriceIsMatchingWithItemTotalPrice());
    }
}
