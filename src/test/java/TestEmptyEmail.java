import configurations.InitialSelenide;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestEmptyEmail extends InitialSelenide {
    private String URL = "https://www.amazon.com/";
    private String EXPECTED_MESSAGE = "Enter your email or mobile phone number";
    private String EMPTY_FIELD = "";

    @Test
    public void testEmptyEmail() {
        open(URL);
        changeCookie();
        new MainPage()
                .clickOnSignIn().typeEmail(EMPTY_FIELD).
                clickOnContinueBtnWithIncorrectEmail()
                .checkEmptyEmailMessageAlert(EXPECTED_MESSAGE);

    }
}