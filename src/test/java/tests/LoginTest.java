package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        // Using standard Guru99 demo credentials
        loginPage.login("mngr582098", "mAzyhuh"); 
        
        // Assert that login is successful (depends on what's visible after login)
        // Usually, the title changes or a welcome message appears.
        String expectedTitle = "Guru99 Bank Manager HomePage";
        Assert.assertTrue(driver.getTitle().contains("Guru99 Bank"), "Login failed or title mismatched");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalidUser", "invalidPass");
        
        // Wait for alert and verify text
        try {
            org.openqa.selenium.Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            Assert.assertEquals(alertText, "User or Password is not valid");
            alert.accept();
        } catch (Exception e) {
            Assert.fail("Expected alert for invalid login was not present");
        }
    }
}
