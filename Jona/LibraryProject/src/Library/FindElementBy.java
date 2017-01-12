package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static WebElement SearchElementBy (WebDriver wd, String by, String Path){
		
		WebElement element = null;
		switch (by){
		
			case "xpath": 
				 element = wd.findElement(By.xpath(Path)); 
			break;
			
			case "tagName":
				 element = wd.findElement(By.tagName(Path)); 
			break;
			
			case "id":
				 element = wd.findElement(By.id(Path)); 
			break;
			
			case "className":
				 element = wd.findElement(By.className(Path)); 
			break;
		}	
		return element;
	}
	
}
