package org.example;

import org.openqa.selenium.By;

public class NopCommerceNewsReleasePage extends Utils
{
    //create Object For Locator
    private By _commentTitle = By.className("enter-comment-title");
    //create Object For Locator
    private By _comment = By.className("enter-comment-text");
    //create Object For Locator
    private By _commentButton = By.name("add-comment");

    public void enterDetailsOnNewsPage()
    {
        //Enter Comment Title
        typeText(_commentTitle,"Guest");
        //Enter Comment Text
        typeText(_comment,"Test");
    }

    public void clickOnCommentButton()
    {
        //Click On Add Comment Button
        clickOnElement(_commentButton);
    }
}
