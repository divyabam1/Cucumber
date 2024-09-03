package step_definition;

import io.cucumber.java.en.Given;
import pages.Homepage;
import utility.BrowserDriver;

public class BasePage



{

    Homepage homepage;

    @Given("User navigates to login page")
            public void userNavigatesToLoginPage() throws Throwable
        {
            //BrowserDriver bd = new BrowserDriver();
            homepage = new Homepage();
            homepage.clickHamburger();
            homepage.signPortal();

    }
}
