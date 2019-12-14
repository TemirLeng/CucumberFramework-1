@TEC-103
Feature: Authentication functionality

  Scenario:  Create an account verify it is created by signing in
    Given Navigate to the sign in page
    Then User clicks on sign in button
    And User types Email address
    Then User clicks on Create on account Button
    Then User types personal information
      | Title | First Name | Last Name | email address     | password | date of birth |day|month|year|
      | Mr    | Jan        | Ask       | askarov@gmail.com | 123      | 04/08/92      |4  |8    |1992|
    Then User types Address
      | first Name | last Name | company    | address    | apt | City    | Sate | zip    | Country | Phone Number |
      | Jan        | Ask       | Techtorial | 2200 Devon | 385 | Chicago | IL   | 600000 | USA     | 3125979088   |
    Then User clicks on Register Button





