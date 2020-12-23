package com.williamtau.webcrawler.loader;


import com.williamtau.webcrawler.builder.ChromeLoaderBuilder;

/**
 * @author williamtau
 */
public class ChromeLoader {

    private ChromeLoaderBuilder loaderBuilder;

    public ChromeLoader(){
        this(null);
    }

    public ChromeLoader(String driver){
        loaderBuilder = new ChromeLoaderBuilder(driver);
    }

    public ChromeLoader(String driver, String url){
        loaderBuilder = new ChromeLoaderBuilder(driver, url);
    }

    public ChromeLoader driver(String driverPath){
        loaderBuilder.driver(driverPath);
        return this;
    }

    public ChromeLoader url(String url){
        loaderBuilder.url(url);
        return this;
    }

    public ChromeLoader addArgument(String arg){
        loaderBuilder.addArgument(arg);
        return this;
    }

    public String html(){
        return loaderBuilder.html();
    }

    public String body(){
        return loaderBuilder.body();
    }

    public void xpath(String pattern){

    }

    public boolean quit(){
        return loaderBuilder.quit();
    }

}
