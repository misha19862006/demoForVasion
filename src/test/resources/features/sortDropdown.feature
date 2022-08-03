@wip
Feature: Sort Dropdown

  Background:
    Given User is on home page

  Scenario: Dropdown text verification
    When user clicks to sort batten
    Then user should see
    |Name (A to Z)|
    |Name (Z to A)|
    |Price (low to high)|
    |Price (high to low)|