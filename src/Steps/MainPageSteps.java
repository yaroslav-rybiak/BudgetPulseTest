package Steps;

import Pages.MainPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;
public class MainPageSteps {

    MainPage mainPage;

    @Step
    public void opens_main_page() {
        mainPage.open();
    }

    @Step
    public void clicks_login_link() {
        mainPage.LoginLink.click();
    }

    @Step
    public void enters_email(String email) {
        mainPage.EmailField.sendKeys(email);
    }

    @Step
    public void enters_password(String password) {
        mainPage.PasswordField.sendKeys(password);
    }

    @Step
    public void clicks_login_button() {
        mainPage.LoginButton.click();
    }

    @Step
    public void can_see_greeting(String email) {
        assertThat(mainPage.Greeting.getText().equals("Welcome, " + email + "."));
    }

    @Step
    public void logs_out() {
        mainPage.LogoutLink.click();
    }

    @Step
    public void can_see_error_message() {
        assertThat(mainPage.Error.isDisplayed());
    }

}
