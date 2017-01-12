package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BandejaEntrada {

	private static WebElement element = null;
	
	
		public static WebElement Boton_RedactarMail (WebDriver driver){
			element = driver.findElement(By.xpath("//div[@class='z0']/div"));
			return element;
		}
	
		public static WebElement Label_Email (WebDriver driver){
			element = driver.findElement(By.tagName("body"));
			return element;
		}
		
		
		public static WebElement Eliminar (WebDriver driver){
			element = driver.findElement(By.xpath("(//span[@name='yo'])[2]"));
			return element;
		}
		
		public static WebElement Boton_Papelera (WebDriver driver){
			element = driver.findElement(By.xpath("//a[contains(text(),'Papelera')]"));
			return element;
		}
		
		
		
}
