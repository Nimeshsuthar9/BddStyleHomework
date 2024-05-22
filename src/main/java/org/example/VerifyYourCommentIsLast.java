package org.example;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyYourCommentIsLast extends Utils
{
    public void verifyCommentAddedAtLastPosition(By by)
    {

        // prices arraylist created which stores web elements
        List<WebElement> prices = driver.findElements(by);
        //print size of prices web element
        System.out.println(prices.size());
        //empty array list products price created
        List<String> productsPrice = new ArrayList<>();
        //for each loop which goes through each element in prices array and retrieve text and add them to products price arraylist
        for (WebElement price:prices)
        {
            productsPrice.add(price.getText());
        }


        System.out.println("All Comments: "+productsPrice);
        String lastElement = productsPrice.get(productsPrice.size()-1);
        System.out.println("Last Comment: "+lastElement);
        if (lastElement.contains("Test working"))
        {
            System.out.println("comment added successfully at last position");
        }

    }
}
