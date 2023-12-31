package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class MainPage implements IHeader {
    @Step("Hover and click on the 'sign in' button in the header")
    public SignInPage clickOnSignIn() {
        IclickSignInBtn();
        return page(SignInPage.class);
    }
}
