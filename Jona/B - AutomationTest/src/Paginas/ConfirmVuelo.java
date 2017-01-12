package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmVuelo {

	
private static WebElement element = null;
	
	
	public static WebElement Titulo_Confirm (WebDriver driver){
			element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]"));
			return element;
	}
			//Boton Volver a Vuelo
	
	public static WebElement Boton_VolverBuscarVuelo (WebDriver driver){
        element = driver.findElement(By.xpath("//a/img"));
        return element;
    }
	
	
	// Boton Volver a Casa
	
	public static WebElement Boton_VolverCasa (WebDriver driver){
        element = driver.findElement(By.xpath("//td[2]/a/img"));
        return element;
    }
			
	
	//Boton Logout
	
	public static WebElement Boton_Logout (WebDriver driver){
        element = driver.findElement(By.xpath("//td[3]/a/img"));
        return element;
    }
		
	
}
