package Tests;

import Steps.MainPageSteps;
import net.thucydides.core.annotations.Pending;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest {

    private String email = TestData.Credentials.getEmail();
    private String password = TestData.Credentials.getPassword();

    @Managed(driver="firefox", uniqueSession = true)
    WebDriver driver;

    @Steps
    MainPageSteps user;

    @Test
    public void user_should_see_a_dashboard_after_login() {
        user.opens_main_page();
        user.clicks_login_link();
        user.enters_email(email);
        user.enters_password(password);
        user.clicks_login_button();
        user.can_see_greeting();
        user.logs_out();
    }

    @Test
    public void user_should_see_an_error_when_password_is_wrong() {
        user.opens_main_page();
        user.clicks_login_link();
        user.enters_email(email);
        user.enters_password(password + "fail");
        user.clicks_login_button();
        user.can_see_error_message();
    }

    @Test
    public void searching_public_goals_by_email() {
        user.opens_main_page();
        user.clicks_contribute_button();
        user.searches_for_email(email);
        user.can_see_public_goals();
    }
}
