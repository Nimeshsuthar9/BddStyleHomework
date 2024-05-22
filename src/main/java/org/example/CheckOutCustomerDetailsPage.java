package org.example;

import org.openqa.selenium.By;

public class CheckOutCustomerDetailsPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    //Create Method For Enter All Details Of Customer For Billing
    public void enterDetailsOfCustomer()
    {
        //Enter FirstName
        typeText(By.id("BillingNewAddress_FirstName"),loadProp.getProperty("firstName"));
        //Enter LastName
        typeText(By.id("BillingNewAddress_LastName"),loadProp.getProperty("lastName"));
        //Enter Email Id
        typeText(By.id("BillingNewAddress_Email"),loadProp.getProperty("email"));
        //select Country
        selectByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        //select State
        selectByVisibleText(By.id("BillingNewAddress_StateProvinceId"),"Other");
        //Enter City
        typeText(By.id("BillingNewAddress_City"),loadProp.getProperty("city"));
        //Enter Address1
        typeText(By.id("BillingNewAddress_Address1"),loadProp.getProperty("address1"));
        //Enter Address2
        typeText(By.id("BillingNewAddress_Address2"),loadProp.getProperty("address2"));
        //Enter PostCode
        typeText(By.id("BillingNewAddress_ZipPostalCode"),loadProp.getProperty("postcode"));
        //Enter PhoneNo
        typeText(By.id("BillingNewAddress_PhoneNumber"),loadProp.getProperty("phNo"));
    }
    //create Method For Click On Continue Button
    public void clickOnContinueButtonAfterCustomerBillingDetails()
    {
        clickOnElement(By.cssSelector("div#billing-buttons-container >button:nth-child(2)"));
    }
    //Create Method For Select Shipping Method
    public void selectShippingMethod()
    {
        clickOnElement(By.id("shippingoption_1"));
    }
    public void clickOnContinueButtonAfterShippingMethod()
    {
        clickOnElement(By.cssSelector("div#shipping-method-buttons-container >button"));
    }
    //Create Method For Select Payment Method
    public void selectPaymentMethod()
    {
        clickOnElement(By.id("paymentmethod_1"));
    }
    public void clickOnContinueButtonAfterPaymentMethod()
    {
        clickOnElement(By.cssSelector("div#payment-method-buttons-container > button "));
    }
    public void  enterPaymentCardDetails()
    {
        selectByVisibleText(By.id("CreditCardType"),"Visa");
        typeText(By.id("CardholderName"),loadProp.getProperty("cardHolderName"));
        typeText(By.id("CardNumber"),loadProp.getProperty("CardNumber"));
        selectByVisibleText(By.id("ExpireMonth"),"04");
        selectByVisibleText(By.id("ExpireYear"),"2029");
        typeText(By.id("CardCode"),loadProp.getProperty("CardCode"));
    }
    public void clickOnContinueButtonAfterPaymentCardDetails()
    {
        clickOnElement(By.cssSelector("div#payment-info-buttons-container >button "));
    }
    public void clickOnContinueButtonAfterConformOrderDetails()
    {
        clickOnElement(By.cssSelector("div#confirm-order-buttons-container >button "));
    }
}
