
Feature: Place Order
 
  Scenario: Search Single item
    Given user is on home page
    When user search an item "parry Hotter"
    Then item must be listed
   
  Scenario: Add Item to cart
    Given User should be on search result page
    When iuser add item to cart
    Then item must be added

    Scenario: Checkout Order
    When user do checkout
    Then should navigate to checkout page
    