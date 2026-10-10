package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;
public class OrderTest extends BaseTest{
    @Test
    public void verifyOrderPlaced(){
        driver.get("https://automationexercise.com/");
        HomePage home = new HomePage(driver);
        home.clickProducts();
        ProductPage prod = new ProductPage(driver);
        prod.clickFirstProduct();
        ProductDetailsPage details = new ProductDetailsPage(driver);
        details.addToCart();
        // popup handle
        driver.get("https://automationexercise.com/view_cart");
        CartPage cart = new CartPage(driver);
        cart.proceedToCheckout();
        System.out.println("Order Flow Run Zala - Checkout paryant gela");
    }
}