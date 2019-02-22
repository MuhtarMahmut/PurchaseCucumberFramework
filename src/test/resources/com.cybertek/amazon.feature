Feature: Amazon add to cart

  @amazon
  Scenario: add item to shopping cart
    When user on the home page and search "ps4"
    Then the item"ps4" should be displayed
    Then click the first option
    Then click add to cart

