package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.budgetpulse.com/transactions")

public class TransactionsPage extends PageObject {

    @FindBy(xpath = "(//a[contains(text(),'Collapse')])[3]")
    public WebElement AddTransactionLink;
}
