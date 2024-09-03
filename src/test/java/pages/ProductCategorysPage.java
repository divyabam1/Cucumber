package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;

public class ProductCategorysPage {

    //Product view
    public static WebDriver driver;
    public static String productcategory = "//*[@id=\"ShoeType\"]";

    @Test
    public void testProductCategoryPage() {
        // Locate the element and get the text
        WebElement element = driver.findElement(By.xpath(productcategory));
        String productCategoryValue = element.getText();

        // Assert the value
        Assert.assertEquals("Formal Shoes", productCategoryValue);
    }
}
