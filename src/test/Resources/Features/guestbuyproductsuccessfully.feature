Feature: guest should be able to buy a product successfully
  @guestbuyproductsuccessfully
  Scenario: guest should be able to buy product successfully
    Given user is on homepage
    When user clicks on logo
    And user clicks on add to cart button.
    And clicks on checkout as a guest
    And filling guest details
    And user fills out payment details.
    Then guest user can see message product bought successfully.



