@Ihtibar @wip
Feature: ihtibar

  Background: login steps
    Given user login as a manager

  Scenario:  Vendor bills page should be clickable and accessible
    When Click Vendor Bill link.
    Then Page title should contain "Vendor Bil"

  Scenario:Incoming products page should be clickable and accessible
    When Click the Incoming Products
    Then Page title should contain "Incoming Produc"

    Scenario: Products page should be clickable and accessible
      When Click the Products link
      Then the page title should contain "Produc"

  Scenario: when the manager tries delete an incoming product , system should ask to make sure again.
     When Click the Incoming Products
     Then Select the Random product
     Then Click the action button.
     And Select the delete
     Then confirmation window will pup up

   Scenario:When selecting" expecting "date check-box , all the items check box has to be Selected.
     When Click the Incoming Products
     Then click the expected date check box
     Then all check boxes will be selected.


