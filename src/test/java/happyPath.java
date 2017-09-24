import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class testSearch {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// Setting chrome
		WebDriver driver = new ChromeDriver();

		String title = "";
		driver.get("https://us.travelexmoneycard.com/register-card/");

		//Checking if the page is opened 
		title = driver.getTitle();
		if (title.contentEquals("Register | Travelex Currency Card")) {
			System.out.println("Page accessed");
		} else {
			System.out.println("Page not accessed");
		}
		
		--------
		//Signup happy path
		signUp.cardNumber(driver).sendKeys("1111222233334444");
		signUp.day(driver).sendKeys("10");
		signUp.month(driver).sendKeys("9");
		signUp.year(driver).sendKeys("2019");
		signUp.mmN(driver).sendKeys("Smith");
		signUp.password(driver).sendKeys("Happy$14");
		signUp.confirmPassword(driver).sendKeys("Happy$14");
		signUp.terms(driver).click();
		signUp.register(driver).click();

		title = driver.getTitle();
		if (title.contentEquals("User profile")) {
			System.out.println("Sign up works");
		} else {
			System.out.println("Sign up does not work");
		}
		
		//Faq search happy path
		driver.get("https://www.travelex.com/faqs");
		faq.search(driver).sendKeys("security");
		faq.searchButton(driver).click();

		String bodyText = driver.findElement(By.tagName("body")).getText();
    	Assert.assertTrue("Text not found!", bodyText.contains("security"));
		
		driver.quit();
		System.out.println("Tests passed");

	}
}
