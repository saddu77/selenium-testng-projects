package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void setUp() {
        prop = ConfigReader.loadProperties();
        System.setProperty("webdriver.chrome.driver",
        	    "C://Users//User//Desktop//Selenium Training//libs//chromedriver_win32//chromedriver.exe");

        WebDriverManager.chromedriver()
        .clearDriverCache()
        .clearResolutionCache()
        .setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
        
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
