package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public interface IHeader {
    SelenideElement SIGN_IN_DROP_DOWN_MENU = $(byXpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
    SelenideElement SIGN_IN_BTN = $(byXpath("(//span[@class='nav-action-inner'])[1]"));
    SelenideElement GREETING = $(byXpath("//span[@id='nav-link-accountList-nav-line-1']"));

    @Step("Hover a mouse over the header")
    default void IopenSignInDropDownMenu() {
        SIGN_IN_DROP_DOWN_MENU.hover();
    }

    @Step("Click on the 'Sign in' button")
    default void IclickSignInBtn() {
        IopenSignInDropDownMenu();
        SIGN_IN_BTN.shouldBe(Condition.enabled).click();
    }

    @Step("Checks that the greeting is correct")
    default MainPage IcheckGreeting(String expectedGreeting) {
        Assert.assertEquals(GREETING.getText(), expectedGreeting);
        return page(MainPage.class);
    }
}
