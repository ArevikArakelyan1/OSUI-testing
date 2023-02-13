package com.epam.helpers;

import com.epam.core.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class UiHelper {

    private final WebDriver driver = Driver.getDriver();
    private final Logger logger = LoggerFactory.getLogger(UiHelper.class);
    private final WaitHelper waitHelper = new WaitHelper();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void clickOnWebElement(final WebElement target) {
       logger.info("Click on {} button", target.getText());
        waitHelper.waitElementToBeClickable(target);
        target.click();
    }
    public void sendKeys(final WebElement target, final String text) throws InterruptedException {
        waitHelper.waitElementToBeVisible(target);
        Thread.sleep(4000);
        target.sendKeys(text);
    }
    public void scrollDown(WebElement element){
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }
    public boolean checkElementsAreDisplayed(WebElement... elements) {
        return Arrays.stream(elements).allMatch(WebElement::isDisplayed);
    }
}
