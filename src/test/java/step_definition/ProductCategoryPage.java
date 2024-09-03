package step_definition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import static pages.ProductCategorysPage.*;


public class ProductCategoryPage {


        @Then("User should be able to view the product details")
        public void productcategory() {
            String productcategoryvalue= driver.findElement(By.xpath(productcategory)).getText();
            Assert.assertEquals(productcategoryvalue,"Formal Shoes");
    }

}
