package com.epam.steps;

import com.epam.pages.CommonPage;
import com.epam.pages.Homepage;
import com.epam.pages.LoginPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class LoginSteps extends BaseSteps {

    LoginPage loginPage ;
    Homepage homepage;

    CommonPage commonPage;


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
        loginPage = new LoginPage();
        homepage = new Homepage();
        commonPage = new CommonPage();
        homepage.goToPage();
    }


    @Then("Click on SignIn button")
    public void clickOnSignInButton() throws InterruptedException {

       homepage.clickOnsignInButton();
      //  Thread.sleep(4000);
    }


    @Given("Login as an {string}")
    public void loginAsAn(String role) throws InterruptedException {
        loginPage.loginByRole(role);
    }

    @Then("Scroll down")
    public void scrollDown() {
    }

    @Then("Validate that the admin is loged successfully")
    public void validateThatTheAdminIsLogedSuccessfully() {
        Assertions.assertThat(commonPage.getCurrentUrl()).contains("http://open-school-dev.eu-central-1.elasticbeanstalk.com/categories/subcategories");
    }
}
