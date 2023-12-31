import configurations.InitialSelenide;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestIncorrectEmail extends InitialSelenide {
    private String URL = "https://www.amazon.com/";
    private String EMAIL = "someemail@example.com";
    private String EXPECTED_MESSAGE = "We cannot find an account with that email address";

    @Test
    public void testEmptyEmail() {
        open(URL);
        new MainPage()
                .clickOnSignIn()
                .typeEmail(EMAIL)
                .clickOnContinueBtnWithIncorrectEmail()
                .checkIncorrectEmailMessageAlert(EXPECTED_MESSAGE);
    }
}
