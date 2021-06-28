package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;


public class LoginPageObject {

    private static WebElement element = null;

    public static WebElement Logo_SwagLab (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.className("login_logo")));
        WaitUtils.waitClickable(driver,driver.findElement(By.className("login_logo")));
        element = driver.findElement(By.className("login_logo"));
        return element;
    }

    public static WebElement Field_Username (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.id("user-name")));
        WaitUtils.waitClickable(driver,driver.findElement(By.id("user-name")));
        element = driver.findElement(By.id("user-name"));
        return element;
    }

    public static WebElement Field_Password (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.id("password")));
        WaitUtils.waitClickable(driver,driver.findElement(By.id("password")));
        element = driver.findElement(By.id("password"));
        return element;
    }

    public static WebElement Button_Login (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.id("login-button")));
        WaitUtils.waitClickable(driver,driver.findElement(By.id("login-button")));
        element = driver.findElement(By.id("login-button"));
        return element;
    }

    public static WebElement Image_Robot (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.className("bot_column")));
        WaitUtils.waitClickable(driver,driver.findElement(By.className("bot_column")));
        element = driver.findElement(By.className("bot_column"));
        return element;
    }

    public static WebElement Section_LoginCredentials (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.id("login_credentials")));
        WaitUtils.waitClickable(driver,driver.findElement(By.id("login_credentials")));
        element = driver.findElement(By.id("login_credentials"));
        return element;
    }

    public static WebElement Section_LoginPassword (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.className("login_password")));
        WaitUtils.waitClickable(driver,driver.findElement(By.className("login_password")));
        element = driver.findElement(By.className("login_password"));
        return element;
    }

    public static WebElement Container_ErrorMessage (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.className("error-message-container")));
        WaitUtils.waitClickable(driver,driver.findElement(By.className("error-message-container")));
        element = driver.findElement(By.className("error-message-container"));
        return element;
    }

    public static WebElement Container_ErrorButton (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.className("error-button")));
        WaitUtils.waitClickable(driver,driver.findElement(By.className("error-button")));
        element = driver.findElement(By.className("error-button"));
        return element;
    }

}
