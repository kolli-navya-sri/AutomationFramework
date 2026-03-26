package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void loginTest() {

        test.info("Test started");

        LoginPage loginPage = new LoginPage(driver);

        test.info("Entering username");
        loginPage.enterUsername("standard_user");

        test.info("Entering password");
        loginPage.enterPassword("secret_sauce");

        test.info("Clicking login");
        loginPage.clickLogin();

        // Validation
        boolean isDisplayed = driver.findElement(By.className("title")).isDisplayed();
        Assert.assertTrue(isDisplayed);

        test.pass("Login verified successfully");
    }
}