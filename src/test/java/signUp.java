import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//This file defines page objects so that they could be reused with different values
public class signUp {

	private static WebElement element = null;

	public static WebElement card(WebDriver driver) {
		element = driver.findElement(By.id("CardNumber"));
		return element;
	}

	public static WebElement day(WebDriver driver) {
		element = driver.findElement(By.id("DobDay"));
		return element;
	}

	public static WebElement month(WebDriver driver) {
		element = driver.findElement(By.id("DobMonth"));
		return element;
	}

	public static WebElement year(WebDriver driver) {
		element = driver.findElement(By.id("DobYear"));
		return element;
	}

	public static WebElement mmName(WebDriver driver) {
		element = driver.findElement(By.id("MMN"));
		return element;
	}

	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.id("Email"));
		return element;
	}

	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("Password"));
		return element;
	}

	public static WebElement confirmPassword(WebDriver driver) {
		element = driver.findElement(By.id("ConfirmPassword"));
		return element;
	}

	public static WebElement terms(WebDriver driver) {
		element = driver.findElement(By.id("divchkbox"));
		return element;
	}

	public static WebElement register(WebDriver driver) {
		element = driver.findElement(By.id("btnRegister"));
		return element;
	}

	
}