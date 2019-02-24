@Zohra @wip
Feature: zohra

  Background: login steps
    Given user login as a manager


    Scenario: Verify that reference check-box should be able to select all products.
      When click the Reference check box
      Then All check boxes will be selected

     Scenario: Verify that reference check-box should be able to Deselect all products.
       When click the Reference check box
       And click the Reference check box again
       Then All check boxes will be deselected.


     Scenario: Verify that each products should be selectable separately.
       When click the each products check box.
       Then each products check box will be selected.

      Scenario: Verify that sum of Untaxed balances should equal to total balance shown at the blow.
        Then sum of all untexted amount equal to the total balance shown at the end.

       Scenario: Verify that each Vendors’ name on the table should be same with vendor’ name on the receipt.
        Then each vendor's name on table matches with thier name on recipe.



