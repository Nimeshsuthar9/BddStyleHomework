package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils
{
    //Create Method For Click On Check Box Button For Accept Terms And Condition
    public void clickOnCheckBoxToAcceptTermsAndCondition()
    {
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
    }
    //Create Method For Click On CheckOut Button
    public void clickOnCheckOutButton()
    {
        clickOnElement(By.id("checkout"));
    }
}
