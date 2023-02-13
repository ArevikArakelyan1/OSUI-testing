package com.epam.pages;

public class CommonPage extends BasePage {

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
