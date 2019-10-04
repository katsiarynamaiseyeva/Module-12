Feature: Punching Out

  Scenario: Punching Out
    Given I open WFR
    When I log in
    And I punched out
    Then I click OK