import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//This file defines page objects so that they could be reused with different values
public class searchFields {

	private static WebElement element = null;

	public static WebElement lnk_searchField(WebDriver driver) {
		element = driver.findElement(By.id("search"));
		return element;
	}

	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("confirm"));
		return element;
	}
	
}