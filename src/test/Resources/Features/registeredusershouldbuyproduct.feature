Feature: Registered User should be able to buy a product successfully
  @reguserbuyproductsuccessfully
  Scenario: registered user should be able to buy product successfully
    Given user is on homepage
    When user clicks o login
    And user enters registration details
    And user clicks on logo
    And user clicks on add to cart button.
    And user selects payment method.
    Then user should see message product bought successfully.
















