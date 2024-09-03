package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class Homepage {
    private WebDriver driver;

    // Define locators as constants
    private static final String HAMBURGER_MENU_XPATH = "//div[@id='menuToggle']";
    private static final String SIGN_PORTAL_XPATH = "//*[@id='menu']/a[2]";

    // Constructor to initialize WebDriver

    // Method to click on the hamburger menu
    public void clickHamburger() {
        // Use WebDriverWait instead of Thread.sleep
        WebElement hamburgerMenu = driver.findElement(By.xpath(HAMBURGER_MENU_XPATH));
        hamburgerMenu.click();
    }

    // Method to click on the sign portal
    public void signPortal() {
        // Use WebDriverWait instead of Thread.sleep
        WebElement signPortal = driver.findElement(By.xpath(SIGN_PORTAL_XPATH));
        signPortal.click();
    }
}
