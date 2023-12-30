import configurations.InitialSelenide;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestIncorrectEmail extends InitialSelenide {
    private String EXPECTED_MESSAGE = "Enter your email or mobile phone number";

    @Test
    public void testEmptyEmail() {
        open("https://www.amazon.com/");
        new MainPage().clickOnSignIn().typeEmail("").clickOnContinueBtnWithIncorrectEmail();
        // Assert.assertEquals(EXPECTED_MESSAGE, );
    }
}