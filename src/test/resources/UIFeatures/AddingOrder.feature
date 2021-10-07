@TEC-102 @ui @regressionTest
Feature: Adding Order


  Scenario: Verify create order functionality
    Given Navigate to log in page
    Then User logs in with valid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creates new order
      | Product Name | Quality | Customer Name | Street     | City    | State | Zip   | Card Nr    | Expire Date |
      | ScreenSaver  | 2       | Techtorial    | 123 N tech | Chicago | Il    | 60000 | 1234567890 | 12/21       |


    Then User verifies Order "is" created

  Scenario: Verify create order functionality with invalid data
    Given Navigate to log in page
    Then User logs in with invalid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creates new order
      | Product Name | Quality | Customer Name | Street     | City    | State | Zip     | Card Nr    | Expire Date |
      | ScreenSaver  | 2       | Techtorial    | 123 N tech | Chicago | Il    | zipCode | 1234567890 | 12/21       |
    Then User verifies Order "is NOT" created

  @TECTC-1015 @smokeTest
  Scenario Outline: Verify Delete functionality
    Given Navigate to log in page
    Then User logs in with valid credentials username "Tester" password "test"
    And User deletes "<Name>" from table
    Then Validate that "<Name>" is deleted
    Examples:
      | Name           |
      | Mark Smith     |
      | Samuel Clemens |
      | Paul Brown     |
      | James White    |


