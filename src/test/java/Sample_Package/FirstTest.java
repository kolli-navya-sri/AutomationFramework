package Sample_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void loginTest() {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();

	    // Enter username
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");

	    // Enter password
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");

	    // Click login
	    driver.findElement(By.id("login-button")).click();
	    
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");

	    System.out.println("Login verified successfully");
	    
	 // Validation using element
	    boolean isDisplayed = driver.findElement(By.className("title")).isDisplayed();
	    Assert.assertTrue(isDisplayed);

	    System.out.println("Login action performed");

	    driver.quit();
	}
}