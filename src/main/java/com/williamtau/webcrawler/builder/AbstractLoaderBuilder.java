package com.williamtau.webcrawler.builder;

import com.williamtau.webcrawler.config.BasicConfiguration;
import org.openqa.selenium.WebDriver;

/**
 * @author williamtau
 */
public abstract class AbstractLoaderBuilder<B extends AbstractLoaderBuilder, C extends BasicConfiguration> {

    protected WebDriver webDriver;

    public abstract B url(String url);

    public abstract B driver(String driverPath);

    public abstract String html();
    public abstract String html(String xpath);
    public String body(){
        return html("//body");
    }

    protected abstract void initialize();

    public boolean quit(){
        try{
            webDriver.quit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public abstract C config();

}
