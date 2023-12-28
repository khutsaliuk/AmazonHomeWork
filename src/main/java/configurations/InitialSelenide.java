package configurations;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class InitialSelenide {

    private ChromeOptions chromeOptions = new ChromeOptions();

    private static final String[] USER_AGENTS = {
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36 OPR/65.0.3467.48",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Safari/605.1.15",
            "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko",
            "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.14; rv:70.0) Gecko/20100101 Firefox/70.0",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36"
    };
    private String getRandomUserAgent() {
        int randomIndex = (int) (Math.random() * USER_AGENTS.length);
        return USER_AGENTS[randomIndex];
    }

    @BeforeTest
    public void before() {
        String currentUserAgent = getRandomUserAgent();
        System.out.println(currentUserAgent);
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        //Configuration.browserCapabilities.setCapability("chrome.switches", "--user-agent=" + currentUserAgent);
        Configuration.browserCapabilities = chromeOptions.addArguments("user-agent=" + currentUserAgent);
    }
    }
