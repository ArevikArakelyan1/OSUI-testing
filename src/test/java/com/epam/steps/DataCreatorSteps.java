package com.epam.steps;

import com.epam.pages.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataCreatorSteps extends BaseSteps {

    CommonPage commonPage;
    Homepage homepage;

    RegisterPage registerPage;


    @BeforeAll
    public static void setupDriver() {
        setup();
    }

    @AfterAll
    public static void tearDown() {
        quitDriver();
    }


    @Before
    public void initPages() {
        commonPage = new CommonPage();
        homepage = new Homepage();
        registerPage = new RegisterPage();
    }


    @When("Go to Sign up popup")
        public void goToSignUpPopup() throws InterruptedException {
            homepage.clickOnsignUpButton();
        }

    @Given("Register a {string}")
    public void registerA(String role) throws InterruptedException {
        registerPage.registerUser(role);
    }
}

