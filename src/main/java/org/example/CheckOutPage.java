package org.example;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils
{
    //Create Method For Click On CheckOut As Guest Button
    public void clickOnCheckoutAsGuestButton()
    {
        clickOnElement(By.cssSelector("div.customer-blocks >div >div:nth-child(3) >button:nth-child(1)"));
    }
}
