@TEC-104 @regressionTest
Feature: Etsy Search Functionality

  @TECTC-1011
  Scenario Outline: Validate Etsy Search message
    Given Navigate Etsy Homepage
    When User searches for "<item>"
    Then Validate search message have word "<item>"
    Examples:
      | item   |
      | carpet |
      | 123    |

@TECTC-1012
  Scenario Outline: Validate each department of Etsy has valid title
    Given Navigate Etsy Homepage
    When User clicks on "<department>"
    Then User validate title "<title>"
    Examples:
      | department            | title                         |
      | Jewelry & Accessories | Jewelry & Accessories \| Etsy |
      | Clothing & Shoes      | Clothing & Shoes \| Etsy      |
      | Home & Living         | Home & Living \| Etst         |
      | Wedding & Party       | Wedding & Party \| Etsy       |
      | Toys & Entertainment  | Toys & Entertainment \| Etsy  |

  @TECTC-1013

  Scenario: Validating free shipping label on result items
    Given Navigate Etsy Homepage
    When User searches for "Wireless Phone Charger"
    And User clicks on Free Shipping checkbox
    Then Verify all results have "FREE shipping" label

  @TECTC-1014

   Scenario: Validating over price functionality
    Given Navigate Etsy Homepage
    When User searches for "carpet"
    And User click on Over price checkbox
    Then User verifies all items prices are over that price








