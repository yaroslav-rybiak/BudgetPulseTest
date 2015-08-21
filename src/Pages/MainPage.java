package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class MainPage {

    private static WebElement element = null;

    public static WebElement LoginLink(WebDriver driver){
        element = driver.findElement(By.linkText("Login"));
        return element;
    }

    public static WebElement EmailField(WebDriver driver){
        element = driver.findElement(By.id("login_username"));
        return element;
    }

    public static WebElement PasswordField(WebDriver driver){
        element = driver.findElement(By.id("login_password"));
        return element;
    }

    public static WebElement LoginButton(WebDriver driver){
        element = driver.findElement(By.id("login-link"));
        return element;
    }

    public static WebElement Greeting(WebDriver driver){
        element = driver.findElement(By.className("first"));
        return element;
    }
}
