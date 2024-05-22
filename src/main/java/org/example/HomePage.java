package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils
{ LoadProp loadProp= new LoadProp();
    private By _currency =By.id("customerCurrency");
    private By _priceOfProduct = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div/div/div[2]/div//span[@class='price actual-price']");

    // Create Method For Click On Register Button From Home Page
    public  void clickOnRegisterButton()
    {
        // Click On Register Button
        clickOnElement(By.className("ico-register"));
    }
    //Click On Add To Cart Button Of Product HTC One M8 Android L 5.0 Lollipop
    public void clickOnAddToCartButton()
    {
        // Click On Electronics Menu
        clickOnElement(By.linkText("Electronics"));
        clickOnElement(By.xpath("//div[@class='page category-page']/div[2]/div[1]/div/div[2]"));
        clickOnElement(By.xpath("//div[@class='item-grid'] /div[1]/div/div[2]/div[3]/div[2]/button[1]"));
    }
    //Click On Shopping Cart Button
    public void clickOnShoppingCartButton()
    {
        clickOnElement(By.xpath("//div[@class='header-links']/ul/li[4]"));
    }
    //Create Method For Search Nike Product
    public void searchProduct(String name)
    {
        // Type Product Name In Search Box
        typeText(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"),name);
        //Click On Search Button
        clickOnElement(By.xpath("//button[@class='button-1 search-box-button']"));

    }
    public void clickOnGivenButtonName(String buttonName)
    {
        clickOnElement(By.linkText(buttonName));
    }

    public void clickOnDetailsButtonOnNewsNewRelease()
    {
        //click on details button at bottom in nop commerce new release
        clickOnElement(By.xpath("//div[@class='buttons']/a[@href=\"/nopcommerce-new-release\"]"));
    }
    public void changeCurrency()
    {
        selectByVisibleText((_currency),loadProp.getProperty("Currency"));
    }
    public void changeCurrencyAndVerifyPriceSymbol()
    {
        String actualCurrency = selectByVisibleText((_currency),loadProp.getProperty("Currency"));
        // elementSleep();
        List<WebElement> productPriceList = driver.findElements(_priceOfProduct);
        //System.out.println("Total Number Of Product In List : " +productPriceList.size());

        if (actualCurrency.equals("Euro"))
        {
            System.out.println("Products Price In £");
            for (WebElement productPrice : productPriceList)
            {
                String priceWithCurrency = productPrice.getText();
                Assert.assertTrue(priceWithCurrency.toLowerCase().contains("£"),"Products Price Not Contains £");
            }
        }
        else
        {
            System.out.println("Products Price In $");
            for (WebElement productPrice : productPriceList)
            {
                String priceWithCurrency = productPrice.getText();
                Assert.assertTrue(priceWithCurrency.contains("$"),"Products Price Not Contains $");
            }
        }
    }
}
