package step_definition;

import io.cucumber.java.en.Given;
import static pages.Homepage.*;

public class BasePage

{
    @Given("User navigates to login page")
            public void userNavigatesToLoginPage() throws Throwable
        {
            click_hamburger();
            Sign_portal();



    }
}
