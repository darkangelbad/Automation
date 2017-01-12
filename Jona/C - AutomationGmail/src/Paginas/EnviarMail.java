package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnviarMail {
	
private static WebElement element = null;
	
	
	public static WebElement Boton_AmpliarVentana (WebDriver driver){
		element = driver.findElement(By.xpath("//td//img[2]"));
		return element;
	}

	public static WebElement Box_Destinatario (WebDriver driver){
        element = driver.findElement(By.className("vO"));
        return element;
    }
	
	public static WebElement Box_Asunto (WebDriver driver){
		element = driver.findElement(By.className("aoT"));
        return element;
    }
	
	public static WebElement Box_Mensaje (WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
        return element;
    }   
	
	public static WebElement Boton_EnviarMail (WebDriver driver){
		element = driver.findElement(By.xpath("//div[text()='Enviar']"));
        return element;
    }
	
}
