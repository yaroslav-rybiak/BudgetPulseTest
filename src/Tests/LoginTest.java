package Tests;

import Actions.MainActions;
import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    private static WebDriver driver;
    public String email = "br59241@gmail.com";
    public String password = "oDo94oZmbB";

    @BeforeClass
    public static void OpenBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    //login attempt with valid email and password
    public void LoginSuccess() {
        MainActions.GoTo(driver);
        MainActions.ClickLoginLink(driver);
        MainActions.InputEmail(driver, email);
        MainActions.InputPassword(driver, password);
        MainActions.ClickLoginButton(driver);
        Assert.assertTrue(MainActions.AssertSuccessGreeting(driver, email));
    }

    @AfterClass
    public static void CloseBrowser() {
        driver.quit();
    }

}