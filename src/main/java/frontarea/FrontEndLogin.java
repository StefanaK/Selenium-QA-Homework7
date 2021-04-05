package frontarea;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class FrontEndLogin {
    /**
     * This method will open the specific webpage that we want
     */
    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    /**
     * This method will login you in the customers area and using the followings parameters:
     *
     * @param e_mail customer's e_mail that is used for the registration
     * @param password that is used for the registration
     */
    public static void login(String e_mail, String password) {
        Browser.driver.findElement(By.xpath("//div[@id=\"top-links\"]//a[@title=\"My Account\"]//span[@class=\"hidden-xs hidden-sm hidden-md\"]")).click();
        Browser.driver.findElement(By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//li[2]//a")).click();
        Browser.driver.findElement(By.id("input-email")).sendKeys(e_mail);
        Browser.driver.findElement(By.id("input-password")).sendKeys(password);
        Browser.driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
    }

    /**
     * This method verify if the user is login successfully
     */
    public static void verifyLogin() {
        Assert.assertTrue(Browser.driver.findElement(By.id("content")).isDisplayed(), "There is a login BUG");
    }

    public static void verifyMessageIncorrectData() {
        String actualMessage = Browser.driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
        Assert.assertEquals(actualMessage, "Warning: No match for E-Mail Address and/or Password.", "There is a BUG!!!");
    }
}
