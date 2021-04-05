package adminarea.positive;

import adminarea.AdminDashboard;
import adminarea.AdminLogin;
import adminarea.core.BaseTest;
import org.testng.annotations.Test;


public class AdminLoginTests extends BaseTest {


    @Test
    public void successfulLogin() {
        AdminLogin.navigate();
        AdminLogin.login("admin", "parola123!");

        AdminDashboard.verifyDashboardHeadingText("Dashboard", "message in case of bug");
    }



}
