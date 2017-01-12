package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Papelera {

	private static WebElement element = null;
	
	public static WebElement Mail (WebDriver driver){
		element = driver.findElement(By.xpath("(//span[@name='yo'])[2]"));
		return element;
	}
	
	public static WebElement Recibidos (WebDriver driver){
		element = driver.findElement(By.xpath("//a[contains(text(),'Recibidos')]"));
		return element;
	}
	
	
	
	
}
