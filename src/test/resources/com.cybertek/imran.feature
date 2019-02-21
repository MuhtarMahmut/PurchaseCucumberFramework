Feature: imran

  Scenario Outline: login as a manager
    Given user login as a manager using "<username>" and "<password>"

    Examples:
      | username                 | password   |
      | in_pos_manager6@info.com | KjKtfgrs35 |


  Scenario Outline: login as a user
    Given user login as a user using "<username>" and "<password>"

    Examples:
      | username              | password   |
      | in_pos_user5@info.com | KjKtfgrs41 |