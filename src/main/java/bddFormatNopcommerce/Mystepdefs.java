package bddFormatNopcommerce;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mystepdefs {
    RegistrationPage registrationPage = new  RegistrationPage();
    EmailFriend emailfriend = new EmailFriend();
    BuyProductSuccessfully buyproductsuccess = new BuyProductSuccessfully();
    GuestBuyProductSuccessfully guestcheckout = new GuestBuyProductSuccessfully();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()
    {
        registrationPage.clickOnRegisterbutton();

    }

    @When("^user enters all details$")
    public void user_enters_all_details()
    {
        registrationPage.userenterregistrationdetails();
    }

    @Then("^user should be able to register successfully$")
    public void user_should_be_able_to_register_successfully()
    {
        registrationPage.verifythatuserregisteredsuccessfully();
    }

    @When("^user clicks o login$")
    public void user_clicks_o_login()  {
        emailfriend.clickonlogin();

    }

    @When("^user enters registration details$")
    public void user_enters_registration_details()  {
        emailfriend.registrationdetails();
    }

    @When("^user clicks on logo$")
    public void user_clicks_on_logo() {
        emailfriend.clickonlogo();


    }

    @When("^user clicks on Product$")
    public void user_clicks_on_Product() {
        emailfriend.clickOnProduct();

    }

    @When("^user clickonemailfriendbuttton$")
    public void user_clickonemailfriendbuttton() {
        emailfriend.clickonemailfriendbutton();

    }

    @When("^user  fills in all details$")
    public void user_fills_in_all_details()  {
        emailfriend.registereduserfillingdetails();

    }

    @Then("^user should be able to see product referred to friend successfully$")
    public void user_should_be_able_to_see_product_referred_to_friend_successfully() {
        emailfriend.verifyemailfriendsuccessful();

    }


    @And("^un registered user  fills in all details$")
    public void unRegisteredUserFillsInAllDetails()
    {
        emailfriend.unregistereduserfillingdetails();
    }

    @Then("^user should not be able to see product referred to friend successfully$")
    public void userShouldNotBeAbleToSeeProductReferredToFriendSuccessfully()
    {
        emailfriend.verifyunregistereduseremailfriendunsuccessful();
    }

    @When("^user clicks on add to cart button\\.$")
    public void user_clicks_on_add_to_cart_button()
    {
        buyproductsuccess.clickonaddtocart();
    }

    @When("^user selects payment method\\.$")
    public void user_selects_payment_method()
    {
        buyproductsuccess.paymentmethod();
    }

    @Then("^user should see message product bought successfully\\.$")
    public void user_should_see_message_product_bought_successfully()
    {
        buyproductsuccess.verifyorderplacedsuccessfully();
    }

    @And("^clicks on checkout as a guest$")
    public void clicksOnCheckoutAsAGuest()
    {
        guestcheckout.clickoncheckoutasguest();
    }

    @And("^filling guest details$")
    public void fillingGuestDetails()
    {
        guestcheckout.fillingguestdetails();
    }

    @And("^user fills out payment details\\.$")
    public void userFillsOutPaymentDetails()
    {
        guestcheckout.guestpaymentdetails();
    }

    @Then("^guest user can see message product bought successfully\\.$")
    public void guestUserCanSeeMessageProductBoughtSuccessfully()
    {
        guestcheckout.verifyorderplacedsuccessfully();
    }
}