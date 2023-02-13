package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends BasePage {

    @FindBy(xpath = "//div[@class = 'Navbar_buttonContent__+2-b-']/button")
    private WebElement signInButton;

    @FindBy(xpath = "//button[@class ='Button-Styles_headerButton__iG1ZJ Button-Styles_headerButton__signUp__cyEhO']")
    private WebElement signUpButton;


    public void clickOnsignInButton() throws InterruptedException {
        uiHelper.clickOnWebElement(signInButton);
        Thread.sleep(4000);
    }

    public void clickOnsignUpButton() throws InterruptedException {
        uiHelper.clickOnWebElement(signUpButton);
        Thread.sleep(4000);
    }
}
