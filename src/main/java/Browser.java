import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {
    private static WebDriver driver;
//    private static WebDriver wait;

    public static void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
//    public static WebDriver getWait(){
//        return wait;
//    }
}
