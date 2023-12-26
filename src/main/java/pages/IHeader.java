package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public interface IHeader {
    SelenideElement signInDropDownMenu = $(byXpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
    SelenideElement signInBtn = $(byXpath("(//span[@class='nav-action-inner'])[1]"));
    SelenideElement helloUsernameBtn = $(byXpath("//span[text()='Hello, Konstantyn']"));

    default void openSignInDropDownMenu() {
        signInDropDownMenu.hover();
    }

    default SignInPage clickSignInBtn() {
        signInBtn.click();
        return page(SignInPage.class);
    }
}
