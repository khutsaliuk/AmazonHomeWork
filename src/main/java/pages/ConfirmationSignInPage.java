package pages;

import io.qameta.allure.Step;
import org.testng.reporters.jq.Main;

import static com.codeborne.selenide.Selenide.page;

public class ConfirmationSignInPage extends ConfirmationSignInPageLocators {
    @Step("Fill the password input")
    public ConfirmationSignInPage typePassword(String password) {
        inputPass.setValue(password);
        return page(ConfirmationSignInPage.class);
    }

    @Step("Click on the Sign In button with false password")
    public ConfirmationSignInPage clickSignInBtnWithCorrectPass() {
        signInBtn.click();
        return this;
    }

    @Step("Click on the Sign In button with true password")
    public SuccessSignInPage clickSignInBtnWithIncorrectPass() {
        signInBtn.click();
        return page(SuccessSignInPage.class);
    }
}
