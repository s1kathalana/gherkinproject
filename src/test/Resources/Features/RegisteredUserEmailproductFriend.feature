Feature: Registered User should be able to refer a product to a friend via Email.
  @referproducttoafriend
  Scenario: registered user should be able to refer product to friend
    Given user is on homepage
    When user clicks o login
    And user enters registration details
    And user clicks on logo
    And user clicks on Product
    And user clickonemailfriendbuttton
    And user  fills in all details
    Then user should be able to see product referred to friend successfully
