package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;

public class ProductSearchTest extends BaseTest{
    @Test
    public void searchProductTest(){
        HomePage home = new HomePage(driver);
        home.clickProducts();
        // Search code direct - ProductPage madhe method add karaychi garaj nahi
        WebElement searchBox = driver.findElement(By.id("search_product"));
        WebElement searchBtn = driver.findElement(By.id("submit_search"));
        searchBox.sendKeys("Blue Top");
        searchBtn.click();
        System.out.println("Product Search Test Run Zala - Blue Top search kela");
    }
}