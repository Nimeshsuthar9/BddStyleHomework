package org.example;

import static org.example.Utils.getTextFromElement;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderSuccessfullySubmittedVerificationPage
{
    // Create Object For Load Properties Class
    LoadProp loadProp = new LoadProp();
    String expectedResultMessage = loadProp.getProperty("CheckoutCompleteMessage");

    // Create Method To Verify That You Register or Not
    public void verifyRegisterMessage()
    {
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='section order-completed'] / div /strong")),expectedResultMessage,"Your Actual is Not Equals Expected");
    }
}
