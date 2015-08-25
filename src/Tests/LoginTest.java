package Tests;

import Steps.MainPageSteps;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(driver="firefox", uniqueSession = true)
    WebDriver driver;

    private String email = "br59241@gmail.com";
    private String password = "oDo94oZmbB";

    @Steps
    MainPageSteps user;

    @Test
    public void user_should_see_a_dashboard_after_login() {
        user.opens_main_page();
        user.clicks_login_link();
        user.enters_email(email);
        user.enters_password(password);
        user.clicks_login_button();
        assertThat(user.can_see_greeting());
        user.logs_out();
    }

    @Test
    public void user_should_see_an_error_when_password_is_wrong() {
        user.opens_main_page();
        user.clicks_login_link();
        user.enters_email(email);
        user.enters_password(password+"fail");
        user.clicks_login_button();
        user.can_see_error_message();
    }
}
