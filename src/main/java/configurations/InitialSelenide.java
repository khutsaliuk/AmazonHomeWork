package configurations;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class InitialSelenide {

    private ChromeOptions chromeOptions = new ChromeOptions();
    public final String AMZ_CAPTCHA1 = "1704052221931028";
    public final String AMZ_CAPTCHA2 = "obzwjF0IFn2C2aDgTSo7Aw==";
    public final String CSM_HIT = "tb:SAQF7JKJ2KB6KZK4Y9P4+s-CE2EZPXVPWA1REVC418M|1704045092582&t:1704045092582&adb:adblk_no";
    public final String CP_CDN = "\"L5Z9:UA\"";

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
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        Configuration.browserCapabilities = chromeOptions.addArguments("user-agent=" + currentUserAgent);
    }

    @AfterTest
    public void closeDriver() {
        Selenide.closeWebDriver();
    }
    public void changeCookie() {
        Cookie cookie = new Cookie("x-amz-captcha-1", AMZ_CAPTCHA1);
        getWebDriver().manage().addCookie(cookie);
        Cookie cookie2 = new Cookie("x-amz-captcha-2", AMZ_CAPTCHA2);
        getWebDriver().manage().addCookie(cookie2);
        Cookie cookie3 = new Cookie("csm-hit", CSM_HIT);
        getWebDriver().manage().addCookie(cookie3);
        Cookie cookie4 = new Cookie("sp-cdn", CP_CDN);
        getWebDriver().manage().addCookie(cookie4);
        getWebDriver().navigate().refresh();
    }
}
