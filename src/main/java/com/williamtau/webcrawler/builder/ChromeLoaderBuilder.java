package com.williamtau.webcrawler.builder;

import com.williamtau.webcrawler.config.ChromeConfiguration;
import com.williamtau.webcrawler.exception.LoaderBuilderException;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

/**
 * @author williamtau
 */
public class ChromeLoaderBuilder extends AbstractLoaderBuilder<ChromeLoaderBuilder, ChromeConfiguration> {

    private ChromeConfiguration configuration;

    public ChromeLoaderBuilder(){
        this(null);
    }

    public ChromeLoaderBuilder(String driverPath){
        this(driverPath, null);
    }

    public ChromeLoaderBuilder(String driverPath, String url){
        configuration = new ChromeConfiguration();
        this.url(url);
        this.driver(driverPath);
    }

    public String html(){
        return html(null);
    }

    public String html(String xpath) {
        initialize();

        By byXPath = null;
        if(StringUtils.isEmpty(xpath)){
            byXPath = By.xpath("//*");
        }else{
            byXPath = By.xpath(xpath);
        }

        WebElement webElement = super.webDriver.findElement(byXPath);
        return webElement.getAttribute("innerHTML");
    }

    protected void initialize() {
        File webDriverFile = new File(configuration.getDriverPath());
        if(!webDriverFile.exists()){
            throw new LoaderBuilderException("Web driver file is not exist. Web driver path is "+configuration.getDriverPath());
        }
        System.setProperty("webdriver.chrome.driver", webDriverFile.getAbsolutePath());

        ChromeOptions options = configuration.getChromeOptions();
        super.webDriver = new ChromeDriver(options);
        super.webDriver.get(configuration.getUrl());
    }

    public ChromeLoaderBuilder url(String url) {
        configuration.setUrl(url);
        return this;
    }

    public ChromeLoaderBuilder driver(String driverPath) {
        configuration.setDriverPath(driverPath);
        return this;
    }

    public ChromeConfiguration config() {
        return configuration;
    }

    public void addArgument(String arg){
        configuration.addArgument(arg);
    }
}
