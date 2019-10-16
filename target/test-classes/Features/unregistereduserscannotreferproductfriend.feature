Feature: UnRegistered User should be able to refer a product to a friend via Email
  @cannotreferproducttofriend
  Scenario: unregistered user should not be able to refer product to friend
    Given user is on homepage
    When user clicks on logo
    And user clicks on Product
    And user clickonemailfriendbuttton
    And un registered user  fills in all details
    Then user should not be able to see product referred to friend successfully


