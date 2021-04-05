package frontend.positive;

import frontarea.FrontEndLogout;
import frontend.core.BaseTestFrontEnd;
import org.testng.annotations.Test;

public class FrontEndLogoutTest extends FrontEndLoginTest {
    @Test
    public void logOut(){
        FrontEndLogout.logOut();
        FrontEndLogout.verifyMessageLogOut();
    }
}
