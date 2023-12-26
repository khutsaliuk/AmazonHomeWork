package pages;

import static com.codeborne.selenide.Selenide.page;

public class SignInPage extends SignInPageLocators {
    public SignInPage typeEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public ConfirmationSignInPage clickOnContinueBtn() {
        continueBtn.click();
        return page(ConfirmationSignInPage.class);
    }
}
