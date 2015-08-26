package Tests;

import Steps.TransactionsSteps;
import net.thucydides.core.annotations.Pending;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TransactionsTest {

    private String email = TestData.Credentials.getEmail();
    private String password = TestData.Credentials.getPassword();

    @Managed(driver="firefox", uniqueSession = true)
    WebDriver driver;

    @Steps
    TransactionsSteps user;

    @Test
    public void user_adds_income() {
        user.logs_in(email, password);
        //user.opens_transactions_page();
        //user.clicks_add_transaction();
    }
}
