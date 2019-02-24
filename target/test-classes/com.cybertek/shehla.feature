@Shehla @wip
Feature: shehla

  Background: login steps
    Given user login as a manager

  Scenario: User should not be able to create Request for Quotation without selecting the vendor
    When Click The Create Button
    Then click the save buttons
    Then the error message will be displayed.

  Scenario: User should be able to Add Item when creating Request for quotation
    When Click The Create Button
    Then Click the Add an Item
    Then new subtotal should be dispayed

  Scenario: The default unit price box should be empty when creating Request for quotation
    When Click The Create Button
    Then Click the Add an Item
    Then should be able to select item from Product Drop Down Box
    Then the Unit Price Box should be Empty

  Scenario: Should be able to delete the added item when creating Request for quotation
    When Click The Create Button
    Then Click the Add an Item
    Then should be able to select item from Product Drop Down Box
    Then Delete The item

  Scenario: should be able to save the Requast when creating Request for quotation
    When Click The Create Button
    Then Click the Add an Item
    Then should be able to select item from Product Drop Down Box
    Then Click The Vendor drop down box and select random vendor
    Then click the save buttons