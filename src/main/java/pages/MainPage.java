package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class MainPage implements IHeader{
    public SignInPage clickOnSignIn (){
        IopenSignInDropDownMenu();
        IclickSignInBtn();
        return page(SignInPage.class);

    }
}
