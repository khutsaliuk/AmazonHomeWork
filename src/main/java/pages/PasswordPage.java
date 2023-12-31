package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class PasswordPage extends PasswordPageLocators {
    @Step("Fill the password input")
    public PasswordPage typePassword(String password) {
        inputPass.setValue(password);
        return this;
    }

    @Step("Click on the Sign In button with false password")
    public CaptchaPage clickSignInBtnWithInCorrectPass() {
        signInBtn.click();
        return page(CaptchaPage.class);
    }

    @Step("Click on the Sign In button with true password")
    public MainPage clickSignInBtnWithCorrectPass() {
        signInBtn.click();
        return page(MainPage.class);
    }
}
