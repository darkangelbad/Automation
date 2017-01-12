package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsertPass {

private static WebElement element = null;
	
	
	public static WebElement Box_InsertPass (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='Passwd']"));
        return element;
    }
	
	public static WebElement Check_NoLogout (WebDriver driver){
        element = driver.findElement(By.id("PersistentCookie"));
        return element;
    }
	
	public static WebElement Boton_Login (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='signIn']"));
        return element;
    }
	
	
}
