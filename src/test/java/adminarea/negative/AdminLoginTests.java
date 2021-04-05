package adminarea.negative;

import adminarea.AdminLogin;
import adminarea.core.BaseTest;
import org.testng.annotations.Test;


public class AdminLoginTests extends BaseTest {

    @Test
    public void unsuccessfulLogin() {
        AdminLogin.navigate();
        AdminLogin.login("dasfasdfasdf", "dasfkjdasfklflsdj");

        AdminLogin.verifyValidationMessage("No match for Username and/or Password.", "bug imash be!");
    }

}
