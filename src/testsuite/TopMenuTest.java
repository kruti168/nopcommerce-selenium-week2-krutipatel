package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


    public class TopMenuTest extends BaseTest {
        //Inheriting the BaseTest Class
        String baseUrl = "https://demo.nopcommerce.com/";

        @Before
        public void setUp() {
            openBrowser(baseUrl);

        }
        @Test
        public void userShouldNavigateToComputerPageSuccessfully() {
            WebElement computerTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
            computerTab.click();
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "nopCommerce demo store. Computers");
        }

        @Test
        public void userShouldNavigateToElectronicsPageSuccessfully() {
            WebElement electronicsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
            electronicsTab.click();
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "nopCommerce demo store. Electronics");
        }

        @Test
        public void userShouldNavigateToApparelPageSuccessfully() {
            WebElement apparelTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]"));
            apparelTab.click();
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "nopCommerce demo store. Apparel");
        }

        @Test
        public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
            WebElement digitalDownloadsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]"));
            digitalDownloadsTab.click();
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "nopCommerce demo store. Digital downloads");
        }

        @Test
        public void userShouldNavigateToBooksPageSuccessfully() {
            WebElement booksTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]"));
            booksTab.click();
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "nopCommerce demo store. Books");
        }

        @Test
        public void userShouldNavigateToJewelryPageSuccessfully() {
            WebElement jewelryTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]"));
            jewelryTab.click();
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "nopCommerce demo store. Jewelry");
        }

        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully() {
            WebElement giftCardsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]"));
            giftCardsTab.click();
            String pageTitle = driver.getTitle();
            Assert.assertEquals(pageTitle, "nopCommerce demo store. Gift Cards");
        }

        @After
        public void tearDown(){
            driver.quit();
        }
}
