@Muhtar @wip
Feature: muhtar

  Background: login steps
    Given user login as a manager

  Scenario: Should be able to add multiple items in the creating purchase order.
   When click the purchaseOrder
    And Click The Create Button
    Then Click the Add an Item
    Then should be able to select item from Product Drop Down Box
    Then Click the Add an Item

  Scenario: Default tax should be 0 when creating purchase order
   When click the purchaseOrder
    And Click The Create Button
    Then Click the Add an Item
    Then The default teax should be 0

  Scenario: Quantity box should be Empty in creating purchase orders.
    When click the purchaseOrder
    And Click The Create Button
    Then Click the Add an Item
    Then should be able to select item from Product Drop Down Box
    Then Qunatity box should be empty.

  Scenario: Rcieved Quantity should be 0 in creating purchase orders
    When click the purchaseOrder
    And Click The Create Button
    Then Click the Add an Item
    Then should be able to select item from Product Drop Down Box
    Then Received Quantity should be equal to 0.


  Scenario: Billed Quantity should be 0 in creating purchase orders
    When click the purchaseOrder
    And Click The Create Button
    Then Click the Add an Item
    Then should be able to select item from Product Drop Down Box
    Then Billed Quantity should be equal to 0.

