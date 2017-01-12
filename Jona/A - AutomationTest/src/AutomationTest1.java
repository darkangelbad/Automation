import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest1 {

	public static void main(String[] args) {

		
		String ele;
		
		String exePath = "C:\\Users\\jacita\\shoppertrak\\project\\Jona\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		
		//Pagina Login
			
			//Selecciono campo User e ingreso la palabra tutorial
		driver.findElement(By.name("userName")).sendKeys("tutorial");
			//Pagina Login - Selecciono campo Pass e ingreso la palabra tutorial
		driver.findElement(By.name("password")).sendKeys("tutorial");
			//Pagina Login - Hago click en el boton de Login
		driver.findElement(By.name("login")).click();
		
		// Segunda Pagina - Buscador de Vuelo
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			// Hago Click en el menu desplegable "Arriving"
		driver.findElement(By.name("toPort")).click();
			// Escribo la palabra a buscar para que me seleccione la opcion deseda
		driver.findElement(By.name("toPort")).sendKeys("London");
			// Hago click sobre el Raid Bottom de Primera Clase
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
			// Hago click sobre el Boton Continuar
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		
		// Tercera Pagina - Seleccionar Vuelo
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
			//Hace clic sobre el segundo Raid Bottom de la primer lista
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[@class='frame_action_xrows']/input")).click();
			// Hace clic sobre el trcer Raid Bottom de la segunda lista
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[@class='frame_action_xrows']/input")).click();
			// Hace clic sobre el boton de continuar
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click();
		
		// Cuarta Pagina - Libro de Vuelo - completar campos
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
			// Campo nombre
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")).sendKeys("Jonathan");
			// Campo Apellido
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("Acita");
			// Campo numero de tarjeta
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("152478965");
			// Clic en el boton compra segura
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[23]/td/input")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		// Quinta Pagina - Verificar que aparezca el siguiente texto " Your itinerary has been booked! "
		ele = (driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText());
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
