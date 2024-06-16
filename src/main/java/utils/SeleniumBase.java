package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static utils.SeleniumConfig.*;

public class SeleniumBase {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public WebDriver seleniumConfig(){
        //WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","D:\\My Workspace\\redmos_tas\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,Duration.ofMinutes(1));
        driver.manage().window().maximize();
        return driver;
    }

    public void environmentSetup(){
        String value = getValue();
        driver.get(value);
    }
}