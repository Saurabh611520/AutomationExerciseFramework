package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;
public class CheckoutTest extends BaseTest{
    @Test
    public void verifyCheckout(){
        HomePage home = new HomePage(driver);
        home.clickProducts();
        ProductPage prod = new ProductPage(driver);
        prod.clickFirstProduct();
        ProductDetailsPage details = new ProductDetailsPage(driver);
        details.addToCart();
        CartPage cart = new CartPage(driver);
        cart.proceedToCheckout();
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.isAddressVisible();
        System.out.println("Checkout Page Disla");
    }
}