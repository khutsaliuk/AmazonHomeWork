import configurations.InitialSelenide;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestSuccessLogin extends InitialSelenide {
    private String URL = "https://www.amazon.com/";
    private String EXPECTED_GREETING = "Hello, Konstantyn";
    private String CORRECT_PASS = "123456";
    private String EMAIL = "paskasomka@gmail.com";

    @Test
    public void testSuccessLogin() {
        open(URL);
        new MainPage()
                .clickOnSignIn()
                .typeEmail(EMAIL)
                .clickOnContinueBtnWithCorrectEmail()
                .typePassword(CORRECT_PASS)
                .clickSignInBtnWithCorrectPass()
                .IcheckGreeting(EXPECTED_GREETING);
    }
}
