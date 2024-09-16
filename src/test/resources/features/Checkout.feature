Feature: Verify CheckOut Functionality

  Scenario: Verify user can see correct cart value
    Given user opens website
    Then verify user is on home page
    When user clicks on search bar
    And user search for laptop
    Then verify user is on laptop items page
    When user click on first laptop item
    Then verify user is on product description page
    When user click on add to cart button
    Then verify user is on cart page
    And verify item is added into cart
    When user search for mobile
    Then verify user is on mobile items page
    When user click on first mobile item
    Then verify user is on product description page
    When user select color
    And user click on add to cart button
    Then verify user is on cart page
    And verify item is added into cart
    Then verify item prices display correctly in cart page






