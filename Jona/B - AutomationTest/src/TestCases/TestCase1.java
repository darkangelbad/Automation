package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Paginas.PaginaInicio;
import Paginas.BuscadorVuelo;
import Paginas.SelectorVuelo;
import Paginas.LibroDeVuelo;
import Paginas.ConfirmVuelo;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase1 {

	
	public static void main (String[] ar){
		
		
		String ele;
		
		String exePath = "C:\\Users\\jacita\\shoppertrak\\project\\Jona\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		
		
		//Login
		
		PaginaInicio.Box_user(driver).sendKeys("tutorial");
		PaginaInicio.Box_password(driver).sendKeys("tutorial");
		PaginaInicio.Boton_login(driver).click();
		
		
		//Seteo Pagina Buscador De Vuelo
		
		
		BuscadorVuelo.Menu_MesSalida(driver).sendKeys("November"); // Forma de seleccionar una opcion dentro de un menu a travez de escibir la opcion y cambiar el foco.
		new Select (BuscadorVuelo.Menu_DiaSalida(driver)).selectByVisibleText("1"); // Forma de seleccionar una opcion dentro de un menu a travez de un select directo a la opcion que quiere.
		BuscadorVuelo.Menu_LlegadaHasta(driver).sendKeys("London");
		BuscadorVuelo.Menu_MesLlegada(driver).sendKeys("November");
		BuscadorVuelo.Menu_DiaLlegada(driver).sendKeys("15");
		BuscadorVuelo.Raid_PrimeraClase(driver).click();
		BuscadorVuelo.Boton_1ContinuBusca(driver).click();
		
		
		//Seleccionando Vuelo
		
		SelectorVuelo.Raid_2a(driver).click();
		SelectorVuelo.Raid_3b(driver).click();
		SelectorVuelo.Boton_2ContinuSelec(driver).click();
		
		//Completando datos del Libro de Vuelo
		
		
		   //Pasajero
				
		LibroDeVuelo.Box_Nombre(driver).sendKeys("Jonathan");
		LibroDeVuelo.Box_Apellido(driver).sendKeys("Acita");
		LibroDeVuelo.Menu_Comida(driver).sendKeys("Kosher");
		
		   //Tarjeta de Credito
		
		LibroDeVuelo.Menu_Tarjeta(driver).sendKeys("MasterCard");
		LibroDeVuelo.Box_NumTarjeta(driver).sendKeys("2451786598427546");
		LibroDeVuelo.Menu_VenMesTarjeta(driver).sendKeys("12");
		LibroDeVuelo.Menu_VenAnoTarjeta(driver).sendKeys("2009");
		LibroDeVuelo.Box_TarjetaNombre(driver).sendKeys("Jonathan");
		LibroDeVuelo.Box_TarjetaNombre2(driver).sendKeys("Andres");
		LibroDeVuelo.Box_TarjetaApellido(driver).sendKeys("Acita");
		
		   //Direccion de Facturación
		
		
		
		   //Direccion de Envio
		
		
		   //Confirmacion
		
		LibroDeVuelo.Boton_3ContinuLibro(driver).click();
		
		
		//Texto En Pantalla Confirmacion Vuelo
		
		ele = (ConfirmVuelo.Titulo_Confirm(driver).getText());
        try {
        	Assert.assertEquals("Your itinerary has been booked!", ele);
            driver.quit();
            System.out.println("lo encontro ameo");
        } catch (Error e) {
            driver.quit();
            System.out.println("Se tomo el palo ameo");
        }
			
	}
}
