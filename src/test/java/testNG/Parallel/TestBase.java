package testNG.Parallel;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
public class TestBase {
 
    protected WebDriver threadDriver = null;
 
    @BeforeMethod
    public void setUp() throws MalformedURLException {
 
        System.setProperty("webdriver.chrome.driver", "C:/products/chromedriver.exe");
        threadDriver = new ChromeDriver();
    }
 
    public WebDriver getDriver() {
        return threadDriver;
    }
 
    @AfterMethod
    public void closeBrowser() {
       // getDriver().quit();
 
    }
}