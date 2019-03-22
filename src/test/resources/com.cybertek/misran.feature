@Misran @wip
Feature: misran

  Background: Common Steps
    Given user login as a manager

  Scenario: login as a manager
          When user click Requests for Quotation
          Then user should see create button
          And  when user click create button
          Then the order page should display

  Scenario: verify product info
    When user click product button
    Then user should see product page
    Then the product details should display


  Scenario: Product Should Match With Infos Shown On ProductPage
    When Click the Products link
    Then Click product box
    Then products info should match

  Scenario: Sales Price of the product Can Be Updated By TheManeger
    When Click the Products link
    Then Click product box
    Then Click Edit Button
    And Enter "700" to salex price box
    Then Click save button

  Scenario: Verify that vendor page should be cliakcable:
    When Click Vendor page.
    Then title of the page should contain "Vendors".

