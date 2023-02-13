package com.epam.pages;

import com.epam.helpers.UiHelper;
import com.epam.helpers.UserDataProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id = 'psd']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='Button-Styles_formButton__zyrRK']")
    private WebElement signUpButton;


    public void registerUser(String role) throws InterruptedException {
        switch (role) {
            case "admin":
                uiHelper.sendKeys(firstName, UserDataProvider.getSignupStudentName());
                Thread.sleep(2000);
                uiHelper.sendKeys(lastName, UserDataProvider.getSignupStudentSurName());
                Thread.sleep(4000);
                uiHelper.scrollDown(signUpButton);
                Thread.sleep(4000);
                uiHelper.sendKeys(email, UserDataProvider.getSignupStudentName());
                Thread.sleep(4000);
                uiHelper.sendKeys(password, UserDataProvider.getSignupStudentPassword());
                Thread.sleep(4000);
                break;
            case "student":
                uiHelper.sendKeys(firstName, UserDataProvider.getSignupStudentName());
                uiHelper.sendKeys(lastName, UserDataProvider.getSignupStudentSurName());
                uiHelper.scrollDown(signUpButton);
                uiHelper.sendKeys(email, "exlbqjgcxuleeaejsy@bbitq.com");
                uiHelper.sendKeys(password, "Test23#nj");
                break;
            case "mentor":
                uiHelper.sendKeys(firstName, UserDataProvider.getSignupStudentName());
                uiHelper.sendKeys(lastName, UserDataProvider.getSignupStudentSurName());
                uiHelper.scrollDown(signUpButton);
                uiHelper.sendKeys(email, UserDataProvider.getSignupStudentEmail());
                uiHelper.sendKeys(password, UserDataProvider.getSignupStudentPassword());
                break;
        }
Thread.sleep(4000);
        uiHelper.clickOnWebElement(signUpButton);

        Thread.sleep(4000);
    }

}


