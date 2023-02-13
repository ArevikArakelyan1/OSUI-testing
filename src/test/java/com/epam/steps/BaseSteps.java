package com.epam.steps;

import com.epam.core.driver.Driver;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseSteps {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
  //  protected final DBHelper dbHelper = new DBHelper();

    public static void setup() {
        Driver.getDriver();
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

}
