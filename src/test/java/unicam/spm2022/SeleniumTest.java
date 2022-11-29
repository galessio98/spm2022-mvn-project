package unicam.spm2022;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    WebDriver driver;

    @Before
    void before(){
        System.setProperty("webdriver.chrome.driver", "c:/users/aless/git/spm2022-mvn-project/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Disabled
    @Test
    void checkThisWebAppTitle() throws InterruptedException {
        driver.get("http://localhost:8080/spm2022/");
        Thread.sleep(3000);
        String at = driver.getTitle();
        String et = "SPM 2022";
//System.out.println(at);
        Thread.sleep(4000);
        Assert.assertEquals(et,at);
    }
}
