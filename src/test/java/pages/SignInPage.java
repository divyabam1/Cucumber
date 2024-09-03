package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class SignInPage {



    static WebDriver driver= BrowserDriver.getDriver();
    public static String username="//*[@id=\"usr\"]";
    public static String pwd  ="//*[@id=\"pwd\"]";
    public static String Login_Btn="//*[@id=\"second_form\"]/input";

////*[@id="second_form"]/input
    public static void sendkeysusername()
    {
        //driver = Homepage.getDriver();
        driver.findElement(By.xpath(username)).sendKeys("sa");
    }

    public static void sendkeyspwd()
    {
        driver.findElement(By.xpath(pwd)).sendKeys("fs");
    }

    public static void clickloginbtn()
    {
        driver.findElement(By.xpath(Login_Btn)).click();
    }


}
