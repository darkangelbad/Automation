package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsertMail {

private static WebElement element = null;
	
	
	public static WebElement Box_InsertMail (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='Email']"));
        return element;
    }
		
	public static WebElement Boton_ContinueToPass (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='next']"));
        return element;
    }
		
	
}
