package Steps;

import Pages.TransactionsPage;
import Pages.MainPage;
import net.thucydides.core.annotations.Step;

public class TransactionsSteps {

    TransactionsPage transactionsPage;
    MainPage mainPage;

    @Step
    public void logs_in(String email, String password) {
        mainPage.open();
        mainPage.LoginLink.click();
        mainPage.EmailField.sendKeys(email);
        mainPage.PasswordField.sendKeys(password);
        mainPage.LoginButton.click();
    }

    @Step
    public void opens_transactions_page() {
        transactionsPage.open();
    }

    @Step
    public void clicks_add_transaction() {
        transactionsPage.AddTransactionLink.click();
    }
}
