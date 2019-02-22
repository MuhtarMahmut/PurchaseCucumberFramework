@BRIT-4214 @smoke @regression @wip
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





