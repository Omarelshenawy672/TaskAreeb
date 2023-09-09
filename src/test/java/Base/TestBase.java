package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public static WebDriver driver;
    @BeforeTest
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
}
