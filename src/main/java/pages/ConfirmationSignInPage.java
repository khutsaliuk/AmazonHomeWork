package pages;

import org.testng.reporters.jq.Main;

import static com.codeborne.selenide.Selenide.page;

public class ConfirmationSignInPage extends ConfirmationSignInPageLocators {
    public ConfirmationSignInPage typePassword(String password) {
        inputPass.setValue(password);
        return page(ConfirmationSignInPage.class);
    }

    public MainPage clickSignInBtn() {
        signInBtn.click();
        return page(MainPage.class);
    }
}
