package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;
public class ProductTest extends BaseTest{
    @Test
    public void productTest(){
        HomePage home = new HomePage(driver);
        home.clickProducts();
        ProductPage prod = new ProductPage(driver);
        prod.isAllProductVisible();
        System.out.println("Product Page Run Zala");
    }
}