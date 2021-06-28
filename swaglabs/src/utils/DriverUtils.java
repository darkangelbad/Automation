package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    private static String URL = ("https://www.saucedemo.com/");

    public static WebDriver driverChrome() {

        WebDriver wd = null;
        String exePath = "src/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get(URL);
        return wd;
    }

    public static WebDriver driverFirefox() {

        WebDriver wd = null;
        String exePath = "src/driver/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", exePath);
        wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get(URL);
        return wd;
    }
}
