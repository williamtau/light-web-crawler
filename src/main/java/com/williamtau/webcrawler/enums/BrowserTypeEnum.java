package com.williamtau.webcrawler.enums;

/**
 * @author williamtau
 */
public enum BrowserTypeEnum {

    CHROME("CHROME");

    private String browserName;

    BrowserTypeEnum(String browserName) {
        this.browserName = browserName;
    }
}
