package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibroDeVuelo {

	private static WebElement element = null;
	
	//Pasajero
	
	public static WebElement Box_Nombre (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='passFirst0']"));
        return element;
    }

	public static WebElement Box_Apellido (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='passLast0']"));
        return element;
    }

	public static WebElement Menu_Comida (WebDriver driver){
        element = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
        return element;
    }
	
	
	//Tarjeta de Credito

	public static WebElement Menu_Tarjeta (WebDriver driver){
        element = driver.findElement(By.xpath("//select[@name='creditCard']"));
        return element;
    }

	public static WebElement Box_NumTarjeta (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='creditnumber']"));
        return element;
    }

	public static WebElement Menu_VenMesTarjeta (WebDriver driver){
        element = driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
        return element;
    }

	public static WebElement Menu_VenAnoTarjeta (WebDriver driver){
        element = driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
        return element;
    }

	public static WebElement Box_TarjetaNombre (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='cc_frst_name']"));
        return element;
    }

	public static WebElement Box_TarjetaNombre2 (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='cc_mid_name']"));
        return element;
    }

	public static WebElement Box_TarjetaApellido (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='cc_last_name']"));
        return element;
    }
	
	
	//Direccion de Facturacion

	public static WebElement Check_SinTicketFactura (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='ticketLess']"));
        return element;
    }
	
	public static WebElement Box_DirecFactura1 (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='billAddress1']"));
        return element;
    }

	public static WebElement Box_DirecFactura2 (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='billAddress2']"));
        return element;
    }

	public static WebElement Box_CiudadFactura (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='billCity']"));
        return element;
    }

	public static WebElement Box_EstadoFactura (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='billState']"));
        return element;
    }

	public static WebElement Box_CPFactura (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='billZip']"));
        return element;
    }

	public static WebElement Menu_PaisFactura (WebDriver driver){
        element = driver.findElement(By.xpath("//select[@name='billCountry']"));
        return element;
    }
	
	
	//Direccion De Envío

	public static WebElement Check_SinTicketEnvio (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='ticketLess'])[2]"));
        return element;
    }

	public static WebElement Box_DirecEnvio (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='delAddress1']"));
        return element;
    }

	public static WebElement Box_DirecEnvio2 (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='delAddress2']"));
        return element;
    }

	public static WebElement Box_CiudadEnvio (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='delCity']"));
        return element;
    }

	public static WebElement Box_EstadoEnvio (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='delState']"));
        return element;
    }

	public static WebElement Box_CPEnvio (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='delZip']"));
        return element;
    }

	public static WebElement Menu_PaisEnvio (WebDriver driver){
        element = driver.findElement(By.xpath("//select[@name='delCountry']"));
        return element;
    }
	
	
	//Boton Continuar
	
	public static WebElement Boton_3ContinuLibro (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='buyFlights']"));
        return element;
    }
	
	
}
