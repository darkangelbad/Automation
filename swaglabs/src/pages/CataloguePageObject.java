package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class CataloguePageObject {

    private static WebElement element = null;

    public static WebElement Title_Catalogue (WebDriver driver){
        WaitUtils.waitVisible(driver,driver.findElement(By.className("title")));
        WaitUtils.waitClickable(driver,driver.findElement(By.className("title")));
        element = driver.findElement(By.className("title"));
        return element;
    }

}
