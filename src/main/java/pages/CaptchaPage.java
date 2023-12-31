package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

public class CaptchaPage extends CaptchaPageLocators {
    @Step("Check message in the captcha")
    public CaptchaPage checkIncorrectPasswordCaptcha(String expectedMessage) {
        String actualMessage = captcha.shouldBe(Condition.visible, Duration.ofSeconds(5)).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        return this;
    }
}
