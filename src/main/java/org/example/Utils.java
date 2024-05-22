package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage
{
    //Create New Click Element Method For Reusability
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //Create New Type Text Method For Reusability
    public static void typeText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //Create New Get Element Method For Reusability
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //Create Method For Random Date And Time For Reusability
    public static String randomDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyhhmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    //Create Method For Take Screen Shot For Reusability
    public static void takeSnapShot(String text)
    {
        //Convert Web Driver Object To Take Screen Shot
        TakesScreenshot srcShot = ((TakesScreenshot) driver);
        //Call Get Screenshot As Method To Create Image File
        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
        //Copy File Destination
        try
        {
            FileUtils.copyFile(srcFile, new File("src/ScreenShot/"+text+randomDate()+".png"));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    //Create Implicit Wait Method For Reusability
    public static void toDriverWaitForFewSeconds()
    {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    //Create Method Fo Sleep Element
    public static void elementSleep()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
    //Create New Select By Visible Text Method For DropDown list For Reusability
    public static String selectByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
        return text;
    }
    public static void verifyUrlContains(String url)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }

}
