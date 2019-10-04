Feature: Adding Note

  Background:
    Given I open WFR
    When I log in

  Scenario Outline: Adding Note to Form
    And I navigate to forms
    And I navigate to open tab
    And I count number os notes
    And I click on three dots
    And I open comment pop-up
    And I add <text>
    And I count notes
    Then I assert added note

    Examples:
      | text     |
      | comment1 |
      | comment2 |
