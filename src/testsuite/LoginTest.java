package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {



        //Inheriting the BaseTest class
        String baseUrl = "https://demo.nopcommerce.com/";

        @Before
        public void setUp() {
            openBrowser(baseUrl);

        }
        @Test
        public void userShouldNavigateToLoginPageSuccessfully() {
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            WebElement welcomeText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
            Assert.assertTrue(welcomeText.isDisplayed());
        }

        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials() {
            // //Find login link and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            // find the Email field element
            WebElement emailField = driver.findElement(By.id("Email"));
            // Type the Email address to email field element
            emailField.sendKeys("mehekvirendra1@gmail.com");
            //Find the Password Field Element and send password on password field
            driver.findElement(By.name("Password")).sendKeys("Mv12345");
            //Find the Login btn Element and click
            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginButton.click();
            // Verify the ‘Log out’ text is display
            String expectedMessage = "Log out";
            WebElement actualTextElement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Log out", actualMessage);
        }

        @Test
        public void verifyTheErrorMessage() {
            //Find login link and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            //Find the Email Field Element
            WebElement emailField = driver.findElement(By.id("Email"));
            // Type the Email address to email field element
            emailField.sendKeys("prime123@gmaill.com");
            //Find the Password Field Element and send password on password field
            driver.findElement(By.name("Password")).sendKeys("Prime12345");
            //Find the Login btn Element and click
            WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginBtn.click();
            String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                    "No customer account found";
            WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals(expectedMessage, actualMessage);
        }

        @After
        public void tearDown() {
            driver.quit();
}


    }
