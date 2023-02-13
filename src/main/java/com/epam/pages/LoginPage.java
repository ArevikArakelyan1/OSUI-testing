package com.epam.pages;

import com.epam.helpers.UiHelper;
import com.epam.helpers.UserDataProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@id='psd']")
    private WebElement passwordInput;
    @FindBy(xpath = "//form/button")
    private WebElement loginButton;

    public void fillEmail(String email) throws InterruptedException {
        logger.info("Fill email {}", email);
        uiHelper.sendKeys(emailInput, email);
    }

    public void fillPassword(String password) throws InterruptedException {
        logger.info("Fill password {}", password);
        uiHelper.sendKeys(passwordInput, password);
    }

    public void clickOnLoginButton() {
        uiHelper.clickOnWebElement(loginButton);
    }

    public void loginByRole(String role) throws InterruptedException {
        switch (role) {
            case "admin":
                uiHelper.sendKeys(emailInput, UserDataProvider.getAdminEmail());
                Thread.sleep(4000);
                uiHelper.sendKeys(passwordInput, UserDataProvider.getAdminPassword());
                break;
            case "student":
                uiHelper.sendKeys(emailInput, UserDataProvider.getUserEmail());
                uiHelper.sendKeys(passwordInput, UserDataProvider.getUserPassword());
                break;
            case "mentor":
                uiHelper.sendKeys(emailInput, UserDataProvider.getMentorEmail());
                uiHelper.sendKeys(passwordInput, UserDataProvider.getMentorPassword());
                break;
        }
        uiHelper.scrollDown(loginButton);
        uiHelper.clickOnWebElement(loginButton);
        Thread.sleep(4000);
    }
}
