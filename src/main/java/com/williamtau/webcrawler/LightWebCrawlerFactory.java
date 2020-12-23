package com.williamtau.webcrawler;

import com.williamtau.webcrawler.loader.ChromeLoader;

/**
 * @author williamtau
 */
public class LightWebCrawlerFactory {

    public ChromeLoader chrome(){
        return new ChromeLoader();
    }

    public ChromeLoader chrome(String driverPath){
        return new ChromeLoader(driverPath);
    }

    public ChromeLoader chrome(String driverPath, String url){
        return new ChromeLoader(driverPath, url);
    }



}
