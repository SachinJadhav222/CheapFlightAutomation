Feature: Create user account with Cheapflights
  As a user
  I want  Sign Up with CheapFlight

  Background: user is on Home Page
    Given use is on Home Page user can see tag line message "Smart search. Made simple."


  Scenario Outline: To sign up and create user account
    Given user click sign up button
    When user enter "<Name>","<Email>","<Password>"
    And user click sign up button
    Then user see accoutn created
    Examples:
      | Name   | Email            | Password  |
      | Sachin | sac111@yahoo.com | sachin123 |