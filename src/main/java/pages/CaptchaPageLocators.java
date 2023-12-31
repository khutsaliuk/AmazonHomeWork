package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CaptchaPageLocators {
    SelenideElement captcha = $(byXpath("//span[@class='a-size-large']"));
}
