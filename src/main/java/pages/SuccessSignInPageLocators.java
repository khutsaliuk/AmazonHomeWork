package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SuccessSignInPageLocators {
    SelenideElement captcha = $(byXpath("//div[contains(@class, 'cvf-captcha-img')]"));
}
