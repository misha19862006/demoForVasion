
Feature: User should be able to login

  Background:
#    And user enter password "secret_sauce"

  Scenario: Positive login scenario
    When user enter username "standard_user"
    And user enter password "secret_sauce"
    And user clicks to login button
    Then user should see url contains "inventory"

  Scenario: Positive login scenario
    When user enter username
      |standard_user|
      |problem_user|
      |performance_glitch_user|
    And user enter password "secret_sauce"
    Then user clicks to login button


  Scenario: Negative login scenario
    When user enter username "locked_out_user"
    And user enter password "wrong_sauce"
    And user clicks to login button
    Then user should see Epic sadface massage