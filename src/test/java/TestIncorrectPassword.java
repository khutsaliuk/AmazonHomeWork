import configurations.InitialSelenide;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestIncorrectPassword extends InitialSelenide {
    private String URL = "https://www.amazon.com/";
    private String EXPECTED_MESSAGE ="Your password is incorrect";
    private String INCORRECT_PASS = "123777";
    private String EMAIL = "paskasomka@gmail.com";


    @Test
    public void testIncorrectPass() {
        open(URL);
        new MainPage()
                .clickOnSignIn()
                .typeEmail(EMAIL)
                .clickOnContinueBtnWithCorrectEmail()
                .typePassword(INCORRECT_PASS)
                .clickSignInBtnWithInCorrectPass()
                .checkIncorrectPasswordMessageAlert(EXPECTED_MESSAGE);
    }
}
