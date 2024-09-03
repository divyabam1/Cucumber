package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {


    public static  WebDriver driver;
     public static ChromeOptions options;
    public BrowserDriver()
    {



        options=new ChromeOptions();
        options.addArguments("remote-allow origins=*");
        System.setProperty("webdriver.http.factory","jdk-http-client");


        // Set the path for the ChromeDriver executable
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();

      driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }
    public void close()
    {

        driver.close();
    }
}
