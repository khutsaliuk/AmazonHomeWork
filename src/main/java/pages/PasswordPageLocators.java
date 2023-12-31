package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PasswordPageLocators {
    SelenideElement inputPass = $(byXpath("//input[@id='ap_password']"));
    SelenideElement signInBtn = $(byXpath("//span[@id='auth-signin-button']"));
    SelenideElement alertMessage = $(byXpath("//span[@class='a-list-item']"));
}
