package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class SignInPage extends SignInPageLocators {
    @Step("Fill the email input")
    public SignInPage typeEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("Click on the 'Continue' button with correct Email")
    public ConfirmationSignInPage clickOnContinueBtnWithCorrectEmail() {
        continueBtn.click();
        return page(ConfirmationSignInPage.class);
    }

    @Step("Click on the 'Continue' button with incorrect Email")
    public SignInPage clickOnContinueBtnWithIncorrectEmail() {
        continueBtn.click();
        return this;
    }
}
