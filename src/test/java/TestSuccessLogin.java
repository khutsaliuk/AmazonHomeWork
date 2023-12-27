import configurations.InitialSelenide;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestSuccessLogin extends InitialSelenide {
    @Test
    public void testSuccessLogin(){
        open("https://www.amazon.com/");
/*        before();
     new MainPage().clickOnSignIn().typeEmail("sadsa").clickOnContinueBtn().
             typePassword("123").clickSignInBtn();*/
    }
}
