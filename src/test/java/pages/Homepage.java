package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class Homepage {
    private static WebDriver driver = BrowserDriver.getDriver();

    // Define locators as constants
    private static final String HAMBURGER_MENU_XPATH = "//div[@id='menuToggle']";
    private static final String SIGN_PORTAL_XPATH = "//*[@id='menu']/a[2]"; //"//a[contains(@href, 'SignIn')]"; //*[@id='menu']/a[2]";

    WebDriverWait wait;
    // Constructor to initialize WebDriver
    BrowserDriver bd;

    /*public static WebDriver getDriver(){

        return driver;
    }*/

    // Method to click on the hamburger menu
    public void clickHamburger() {
        // Use WebDriverWait instead of Thread.sleep
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver = BrowserDriver.getDriver();
        bd = new BrowserDriver();
        driver = BrowserDriver.getDriver();
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver = getDriver();
        //driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement hamburgerMenu = driver.findElement(By.xpath(HAMBURGER_MENU_XPATH));
        hamburgerMenu.click();
    }

    // Method to click on the sign portal
    public void signPortal() {
        // Use WebDriverWait instead of Thread.sleep
        driver.findElement(By.xpath("//div[@id='menuToggle']/input")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SIGN_PORTAL_XPATH))).click();
        //WebElement signPortal = driver.findElement(By.xpath(SIGN_PORTAL_XPATH));
        //signPortal.click();
    }
}
