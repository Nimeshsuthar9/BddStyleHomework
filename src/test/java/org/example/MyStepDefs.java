package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MyStepDefs extends Utils
{
  HomePage homePage = new HomePage();
  RegisterPage registerPage = new RegisterPage();
  RegisterResultPage registerResultPage = new RegisterResultPage();
  CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
  ProductPage productPage= new ProductPage();
  ProductReferPageToEnterDetailsOfFriend productReferPageToEnterDetailsOfFriend = new ProductReferPageToEnterDetailsOfFriend();
  ReferProductResultPage referProductResultPage = new ReferProductResultPage();
  ProductNameAndUrlVerification productNameAndUrlVerification = new ProductNameAndUrlVerification();
  NopCommerceNewsReleasePage nopCommerceNewsReleasePage = new NopCommerceNewsReleasePage();
  VerifyYourCommentIsLast verifyYourCommentIsLast = new VerifyYourCommentIsLast();
  ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
  CheckOutPage checkOutPage = new CheckOutPage();
  CheckOutCustomerDetailsPage checkOutCustomerDetailsPage = new CheckOutCustomerDetailsPage();
  OrderSuccessfullySubmittedVerificationPage orderSuccessfullySubmittedVerificationPage = new OrderSuccessfullySubmittedVerificationPage();


  @Given("I Am On Homepage")
  public void iAmOnHomepage()
  {

  }

  @And("I Click On {string} Button")
  public void iClickOnButton(String buttonName)
  {
    homePage.clickOnGivenButtonName(buttonName);
  }

  @When("I Enter Required Registration Details")
  public void iEnterRequiredRegistrationDetails()
  {
    registerPage.enterRegisterDetails();
  }

  @Then("I Should Able To Register Successfully")
  public void iShouldAbleToRegisterSuccessfully()
  {
    registerResultPage.verifyRegisterMessage();
  }
  @Then("I Should Able To See Products")
  public void iShouldAbleToSeeProducts()
  {

  }

  @When("I Click On Any Product")
  public void iClickOnAnyProduct()
  {
    cameraAndPhotoPage.clickOnProduct();
  }

  @Then("User Able To Redirect On That Product Page")
  public void userAbleToRedirectOnThatProductPage()
  {

  }

  @When("I Click On Product To Refer Friend")
  public void iClickOnProductToReferFriend()
  {
    productPage.clickOnProductToReferFriend();
  }

  @And("I Enter Required Details To Send A Product To Friend")
  public void iEnterRequiredDetailsToSendAProductToFriend()
  {
    productReferPageToEnterDetailsOfFriend.referAProduct();
  }

  @And("I Click On Send Button")
  public void iClickOnSendButton()
  {

  }

  @Then("I Should Able To Refer A Product To Friend")
  public void iShouldAbleToReferAProductToFriend()
  {
    referProductResultPage.verifyReferProductMessage();
  }

  @When("I Type Product Name In Search Bar")
  public void iTypeProductNameInSearchBar()
  {
    homePage.searchProduct("Nike");
  }

  @And("I Click On Search Button")
  public void iClickOnSearchButton()
  {

  }

  @Then("I Should Able To Redirect On That Product Page")
  public void iShouldAbleToRedirectOnThatProductPage()
  {

  }

  @And("I Should Verify Product Name And Url Contains That Searched Product Word")
  public void iShouldVerifyProductNameAndUrlContainsThatSearchedProductWord()
  {
    productNameAndUrlVerification.toVerifyProductNameContainsNike();
    productNameAndUrlVerification.toVerifyProductUrlContainNike();
  }

  @And("I Click On News Release Detail Button")
  public void iClickOnNewsReleaseDetailButton()
  {
    homePage.clickOnDetailsButtonOnNewsNewRelease();
  }

  @When("I Enter Required Comment Details")
  public void iEnterRequiredCommentDetails()
  {
    nopCommerceNewsReleasePage.enterDetailsOnNewsPage();
  }

  @And("Click On Comment Button")
  public void clickOnCommentButton()
  {
    nopCommerceNewsReleasePage.clickOnCommentButton();
  }

  @Then("I Should Able To See My Comment Is Last")
  public void iShouldAbleToSeeMyCommentIsLast()
  {
    verifyYourCommentIsLast.verifyCommentAddedAtLastPosition(By.xpath("//div[@class='comment-content']"));
  }

  @When("I Click On Add To Cart Button On Product")
  public void iClickOnAddToCartButtonOnProduct()
  {
    homePage.clickOnAddToCartButton();
  }

  @Then("I Should Able To Vew Shopping Cart Page")
  public void iShouldAbleToVewShoppingCartPage()
  {
    homePage.clickOnShoppingCartButton();
  }

  @When("I Click On Check Box To Accept Terms And Condition")
  public void iClickOnCheckBoxToAcceptTermsAndCondition()
  {
    shoppingCartPage.clickOnCheckBoxToAcceptTermsAndCondition();
  }

  @And("Click On Check Out Button")
  public void clickOnCheckOutButton()
  {
    shoppingCartPage.clickOnCheckOutButton();
  }

  @And("I Click On Check Out Guest Button")
  public void iClickOnCheckOutGuestButton()
  {
    checkOutPage.clickOnCheckoutAsGuestButton();
  }

  @Then("I Am Redirect On Customer Details Form Page")
  public void iAmRedirectOnCustomerDetailsFormPage()
  {

  }

  @When("I Enter Required Customer Billing Details")
  public void iEnterRequiredCustomerBillingDetails()
  {
    checkOutCustomerDetailsPage.enterDetailsOfCustomer();
  }

  @And("Click On Continue Button After Customer Details")
  public void clickOnContinueButtonAfterCustomerDetails()
  {
    checkOutCustomerDetailsPage.clickOnContinueButtonAfterCustomerBillingDetails();
  }

  @And("I Select Shipping Method")
  public void iSelectShippingMethod()
  {
    checkOutCustomerDetailsPage.selectShippingMethod();
  }

  @And("I Click On Continue Button After Shipping Method")
  public void iClickOnContinueButtonAfterShippingMethod()
  {
    checkOutCustomerDetailsPage.clickOnContinueButtonAfterShippingMethod();
  }

  @And("I Click on Select Payment Method")
  public void iClickOnSelectPaymentMethod()
  {
    checkOutCustomerDetailsPage.selectPaymentMethod();
  }

  @And("I Click On Continue Button After Payment Method")
  public void iClickOnContinueButtonAfterPaymentMethod()
  {
    checkOutCustomerDetailsPage.clickOnContinueButtonAfterPaymentMethod();
  }

  @And("I Enter Required Payment Card Details")
  public void iEnterRequiredPaymentCardDetails()
  {
    checkOutCustomerDetailsPage.enterPaymentCardDetails();
  }

  @And("I Click On Continue Button After Payment Card Details")
  public void iClickOnContinueButtonAfterPaymentCardDetails()
  {
    checkOutCustomerDetailsPage.clickOnContinueButtonAfterPaymentCardDetails();
  }

  @And("I Click On Continue Button To Conform Order Details")
  public void iClickOnContinueButtonToConformOrderDetails()
  {
    checkOutCustomerDetailsPage.clickOnContinueButtonAfterConformOrderDetails();
  }

  @Then("I Should Able To Verify Check Out Completed Message Page")
  public void iShouldAbleToVerifyCheckOutCompletedMessagePage()
  {
    orderSuccessfullySubmittedVerificationPage.verifyRegisterMessage();
  }

  @When("I Select Currency")
  public void iSelectCurrency()
  {
    homePage.changeCurrency();
  }

  @Then("I Should Able To See Product Price In That Particular Currency")
  public void iShouldAbleToSeeProductPriceInThatParticularCurrency()
  {
    homePage.changeCurrencyAndVerifyPriceSymbol();
  }

  @Then("I should able to verify that user navigated to {string} page")
  public void iShouldAbleToVerifyThatUserNavigatedToPage(String url_Contains)
  {
    verifyUrlContains(url_Contains);
  }
}