package frontend.core;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Browser;

public class BaseTestFrontEnd {

    @BeforeClass
    public void setUp(){
        Browser.setup();
    }

    @AfterClass
    public void quit(){
        Browser.quit();
    }

}
