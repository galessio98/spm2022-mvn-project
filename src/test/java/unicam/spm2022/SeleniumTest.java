package unicam.spm2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    WebDriver driver;
    String projectPath;

//    @Before
//    void before(){
//        projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver");
//        driver = new ChromeDriver();
//    }

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
	    options.addArguments("--disable-dev-shm-usage");
	    options.addArguments("--headless");
        driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
