Feature: Sample

  # everyone can reuse @BRIT-4214
  @BRIT-4214 @smoke
  Scenario Outline: login as a manager
    Given user login as a manager using "<username>" and "<password>"
    Then user should be able to login to the main page

    Examples:
      | username                 | password   |
      | in_pos_manager6@info.com | KjKtfgrs35 |
