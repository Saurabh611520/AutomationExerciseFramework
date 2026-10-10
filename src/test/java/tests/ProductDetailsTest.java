package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;
public class ProductDetailsTest extends BaseTest{
    @Test
    public void productDetailsVisibleTest() throws InterruptedException {
        Thread.sleep(2000);
        HomePage home = new HomePage(driver);
        home.clickProducts();
        Thread.sleep(2000);
        ProductPage prod = new ProductPage(driver);
        Assert.assertTrue(prod.isAllProductVisible());
        prod.clickFirstProduct();
        Thread.sleep(2000);
        ProductDetailsPage details = new ProductDetailsPage(driver);
        Assert.assertTrue(details.isProductVisible());
        System.out.println("Product Details Page Disla");
    }
}