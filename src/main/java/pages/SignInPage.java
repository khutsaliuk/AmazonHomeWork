package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class SignInPage extends SignInPageLocators {
    @Step("Fill the email input")
    public SignInPage typeEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("Click on the 'Continue' button with correct Email")
    public PasswordPage clickOnContinueBtnWithCorrectEmail() {
        continueBtn.click();
        return page(PasswordPage.class);
    }

    @Step("Click on the 'Continue' button with incorrect Email")
    public SignInPage clickOnContinueBtnWithIncorrectEmail() {
        continueBtn.click();
        return this;
    }

    @Step("Check message for incorrectly entered e-mail")
    public SignInPage checkIncorrectEmailMessageAlert(String expectedMessage) {
        String actualMessage = alertMessage.shouldBe(Condition.visible, Duration.ofSeconds(5)).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        return this;
    }

    @Step("Check message with empty email field")
    public SignInPage checkEmptyEmailMessageAlert(String expectedMessage) {
        String actualMessage = emptyFieldMessage.shouldBe(Condition.visible, Duration.ofSeconds(5)).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        return this;
    }
}
