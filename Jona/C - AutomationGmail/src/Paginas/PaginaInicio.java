package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicio {

private static WebElement element = null;
	
	
	public static WebElement Link_InicioSesion (WebDriver driver){
        element = driver.findElement(By.xpath("//a[@id='gmail-sign-in']"));
        return element;
    }
		
}
