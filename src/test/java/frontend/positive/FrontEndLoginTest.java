package frontend.positive;

import frontarea.FrontEndLogin;
import frontend.core.BaseTestFrontEnd;
import org.testng.annotations.Test;

public class FrontEndLoginTest extends BaseTestFrontEnd {

    @Test
    public void loginTest(){
        FrontEndLogin.goTo();
        FrontEndLogin.login("s_vylkova@abv.bg","Passpragmatic14" );

        FrontEndLogin.verifyLogin();
    }
}
