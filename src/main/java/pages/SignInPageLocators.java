package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInPageLocators {
    SelenideElement emailInput = $(byXpath("//input[@id='ap_email']"));
    SelenideElement continueBtn = $(byXpath("//span[@id='continue']")); //или input Вместо span попробовать
    SelenideElement alertMessage = $(byXpath("//span[@class='a-list-item']"));
    SelenideElement emptyFieldMessage = $(byXpath("//div[@id='auth-email-missing-alert']/div/div"));
}
