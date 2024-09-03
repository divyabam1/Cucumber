package step_definition;
import io.cucumber.java.en.When;

import static pages.SignInPage.*;
public class Signage_sd {

    @When("User is sucessfully enters the login details")
    public void logins()
    {

        sendkeysusername();
        sendkeyspwd();
        clickloginbtn();
    }

}
