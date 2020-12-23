package com.williamtau.crawl;

import com.williamtau.webcrawler.LightWebCrawler;
import com.williamtau.webcrawler.loader.ChromeLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author williamtau
 */
public class ChromeLoaderTest {

    private final static String DRIVER_PATH="/Users/twlsoft/Downloads/chromedriver";

    @Test
    public void test(){
        ChromeLoader loader = new LightWebCrawler()
                .chrome(DRIVER_PATH, "http://www.baidu.com");

        String response = loader.body();
        Assertions.assertNotNull(response);

        boolean isQuit = loader.quit();
        Assertions.assertEquals(true, isQuit);
    }

    @Test
    public void testLoadingWebUsingHeadless(){
        ChromeLoader loader = new LightWebCrawler()
                .chrome()
                .addArgument("--headless")
                .driver(DRIVER_PATH)
                .url("http://www.baidu.com");
        String response = loader.html();
        Assertions.assertNotNull(response);

        boolean isQuit = loader.quit();
        Assertions.assertEquals(true, isQuit);
    }

}
