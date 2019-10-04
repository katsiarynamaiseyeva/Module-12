Feature: Punching In

  Scenario: Punching In
    Given I open WFR
    When I log in
    And I punched in
    Then I click OK

