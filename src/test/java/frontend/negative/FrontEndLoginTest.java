package frontend.negative;

import frontarea.FrontEndLogin;
import frontend.core.BaseTestFrontEnd;
import org.testng.annotations.Test;


public class FrontEndLoginTest extends BaseTestFrontEnd {

    @Test
    public void login(){
        FrontEndLogin.goTo();
        FrontEndLogin.login("s_vylkova@abv.bg", "123456");

        FrontEndLogin.verifyMessageIncorrectData();
    }
}
