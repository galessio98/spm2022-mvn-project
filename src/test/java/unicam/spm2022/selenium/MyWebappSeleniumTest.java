package unicam.spm2022.selenium;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

class MyWebappSeleniumTest {

	/*
	 * static String browser; static String projectPath; static String
	 * pathToMacDrivers; static String address;
	 * 
	 * static WebDriver driver; public String baseUrl = "http://pros.unicam.it/";
	 * 
	 *//**
		 * @throws java.lang.Exception
		 */
	/*
	 * @BeforeAll static void setUpBeforeClass() throws Exception { projectPath =
	 * System.getProperty("user.dir");
	 * 
	 * }
	 * 
	 * 
	 *//**
		 * @throws java.lang.Exception
		 */
	/*
	 * @AfterAll static void tearDownAfterClass() throws Exception { }
	 * 
	 *//**
		 * @throws java.lang.Exception
		 */
	/*
	 * @BeforeEach void setUp() throws Exception {
	 * 
	 * if(System.getProperty("os.name").equals("Mac OS X")) {
	 * System.setProperty("webdriver.chrome.driver",
	 * projectPath+"/drivers/mac/chromedriver");
	 * address="http://localhost:8080/spm2021"; ChromeOptions chromeOptions = new
	 * ChromeOptions(); driver = new ChromeDriver(chromeOptions);
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * }else{ if(System.getProperty("os.name").contains("Windows")) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\studente\\Documents\\BrowserDriver\\chromedriver.exe");
	 * address="http://localhost/spm2021"; ChromeOptions chromeOptions = new
	 * ChromeOptions(); driver = new ChromeDriver(chromeOptions);
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * }else {
	 * 
	 * WebDriverManager.chromedriver().setup(); ChromeOptions options = new
	 * ChromeOptions(); options.addArguments("--no-sandbox");
	 * options.addArguments("--disable-dev-shm-usage");
	 * options.addArguments("--headless"); driver = new ChromeDriver(options);
	 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); } } }
	 * 
	 *//**
		 * @throws java.lang.Exception
		 *//*
			 * @AfterEach void tearDown() throws Exception { driver.close(); driver.quit();
			 * }
			 * 
			 * 
			 * 
			 * @Test
			 * 
			 * @Disabled void testMyAppTitle() { driver.navigate().to(baseUrl);
			 * System.out.println("Title is: "+driver.getTitle());
			 * assertTrue(driver.getTitle().contains("SPM")); }
			 * 
			 * @Test //@Disabled
			 * 
			 * @Tag("AcceptanceTest") void testMyGitHubAction() { driver.get(baseUrl);
			 * System.out.println("Title is: "+driver.getTitle());
			 * assertTrue(driver.getTitle().contains("PROS")); }
			 */

}
