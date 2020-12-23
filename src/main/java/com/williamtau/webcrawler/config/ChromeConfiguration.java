package com.williamtau.webcrawler.config;

import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author williamtau
 */
public class ChromeConfiguration extends BasicConfiguration {

    private ChromeOptions chromeOptions;

    public ChromeConfiguration(){
        chromeOptions = new ChromeOptions();
    }

    public void addArgument(String argument){
        chromeOptions.addArguments(argument);
    }

    public ChromeOptions getChromeOptions() {
        return chromeOptions;
    }
}
