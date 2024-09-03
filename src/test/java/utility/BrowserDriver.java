package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {


    public static  WebDriver driver;
     public static ChromeOptions options;
    public BrowserDriver()
    {

        //options=new ChromeOptions();
        //options.addArguments("remote-allow origins=*");
        //System.setProperty("webdriver.http.factory","jdk-http-client");
        // Set the path for the ChromeDriver executable
        //String chromeDriverPath = "/Users/bhavin/Documents/Projects/Cucumber-master/src/test/resources/drivers/chromedriver.exe";//System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }

    public static WebDriver getDriver(){
        return driver;
    }
    public void close()
    {
        driver.close();
    }
}
