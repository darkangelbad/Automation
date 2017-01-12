package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscadorVuelo {

	private static WebElement element = null;
	
	
	//Detalle de Vuelos
	
	public static WebElement Raid_TypeRoundTrip (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='tripType']"));
        return element;
    }

	public static WebElement Raid_TypeOneWay (WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@name='tripType'])[2]"));
        return element;
    }

	
	public static WebElement Menu_Pasajeros (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='passCount']"));
        return element;
    }
	
	public static WebElement Menu_SalidaDesde (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='fromPort']"));
        return element;
    }
	
	public static WebElement Menu_MesSalida (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='fromMonth']"));
        return element;
    }
	
	public static WebElement Menu_DiaSalida (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='fromDay']"));
        return element;
    }
	
	public static WebElement Menu_LlegadaHasta (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='toPort']"));
        return element;
    }
	
	public static WebElement Menu_MesLlegada (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='toMonth']"));
        return element;
    }
	
	public static WebElement Menu_DiaLlegada (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='toDay']"));
        return element;
    }
	
	
	//Preferencias
	
	public static WebElement Raid_ClaseEconomica (WebDriver driver){
		element = driver.findElement(By.xpath("//input[@name='servClass']"));
        return element;
    }
	
	public static WebElement Raid_ClaseNegocio (WebDriver driver){
		element = driver.findElement(By.xpath("(//input[@name='servClass'])[2]"));
        return element;
    }
	
	public static WebElement Raid_PrimeraClase (WebDriver driver){
		element = driver.findElement(By.xpath("(//input[@name='servClass'])[3]"));
        return element;
    }
			
	public static WebElement Raid_Aerolinea (WebDriver driver){
		element = driver.findElement(By.xpath("//select[@name='airline']"));
        return element;
    }		
	
	
	//Continuar
	
	public static WebElement Boton_1ContinuBusca (WebDriver driver){
		element = driver.findElement(By.xpath("//input[@name='findFlights']"));
        return element;
    }		
			
			
}
