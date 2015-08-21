package Actions;

import Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainActions {

    private static String URL = "https://www.budgetpulse.com";
    private static WebDriverWait wait;

    public static void GoTo(WebDriver driver){
        driver.get(URL);
    }

    public static void ClickLoginLink(WebDriver driver) {
        MainPage.LoginLink(driver).click();
    }

    public static void InputEmail(WebDriver driver, String email) {
        MainPage.EmailField(driver).clear();
        MainPage.EmailField(driver).sendKeys(email);
    }

    public static void InputPassword(WebDriver driver, String password) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_password")));
        MainPage.PasswordField(driver).clear();
        MainPage.PasswordField(driver).sendKeys(password);
    }

    public static void ClickLoginButton(WebDriver driver) {
        MainPage.LoginButton(driver).click();
    }

    public static boolean AssertSuccessGreeting(WebDriver driver, String email) {
        return MainPage.Greeting(driver).getText().equals("Welcome, " + email + ".");
    }

}
