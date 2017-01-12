package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectorVuelo {

	private static WebElement element = null;
	
	//Ida
	
	public static WebElement Raid_1a (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='outFlight']"));
        return element;
    }
	
	public static WebElement Raid_2a (WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@name='outFlight'])[2]"));
        return element;
    }
	
	public static WebElement Raid_3a (WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@name='outFlight'])[3]"));
        return element;
    }
	
	public static WebElement Raid_4a (WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@name='outFlight'])[4]"));
        return element;
    }
	
	
	//Vuelta
	
	public static WebElement Raid_1b (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='inFlight']"));
        return element;
    }
	
	public static WebElement Raid_2b (WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@name='inFlight'])[2]"));
        return element;
    }
	
	public static WebElement Raid_3b (WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@name='inFlight'])[3]"));
        return element;
    }
	
	
	public static WebElement Raid_4b (WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@name='inFlight'])[4]"));
        return element;
    }
	
	//Continuar
	
	public static WebElement Boton_2ContinuSelec (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='reserveFlights']"));
        return element;
    }
}
