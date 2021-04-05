package frontarea;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class FrontEndLogout extends FrontEndLogin{


    /**
     * This method logout the customer from the account
     */
    public static void logOut() {
        Browser.driver.findElement(By.cssSelector("div#top-links a.dropdown-toggle")).click();
        Browser.driver.findElement(By.cssSelector("div#top-links ul.dropdown-menu li:nth-of-type(5) a")).click();
    }

    /**
     * This method check if the customer is logout successfully
     */
    public static void verifyMessageLogOut() {
        String actualMassege = Browser.driver.findElement(By.id("content")).getText();
        Assert.assertTrue(actualMassege.contains("You have been logged off your account."), "There is a logout BUG!");
    }
}
