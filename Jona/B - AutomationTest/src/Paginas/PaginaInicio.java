package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicio {

	private static WebElement element = null;
	
	
	public static WebElement Box_user(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='userName']"));
        return element;
    }
    
    public static WebElement Box_password(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='password']"));
        return element;
    }
 
    public static WebElement Boton_login(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='login']"));
        return element;
    }

}
