package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.budgetpulse.com")

public class MainPage extends PageObject {

    @FindBy(linkText = "Login")
    public WebElement LoginLink;

    @FindBy(id = "login_username")
    public WebElement EmailField;

    @FindBy(id = "login_password")
    public WebElement PasswordField;

    @FindBy(id = "login-link")
    public WebElement LoginButton;

    @FindBy(className = "first")
    public WebElement Greeting;

    @FindBy(id = "authMessage")
    public WebElement Error;

    @FindBy(linkText = "Log Out")
    public WebElement LogoutLink;

    @FindBy(id = "contributefriend")
    public WebElement ContributeButton;

    @FindBy(id = "nav_search_email")
    public WebElement EmailSearchField;

    @FindBy(id = "info")
    public WebElement PublicProfile;

    @FindBy(id = "search-link")
    public WebElement SearchButton;
}
