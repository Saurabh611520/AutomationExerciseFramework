package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;
public class PaymentTest extends BaseTest{
    @Test
    public void paymentFlowTest(){
        HomePage home = new HomePage(driver);
        home.clickLogin();
        LoginPage login = new LoginPage(driver);
        login.login("sonwanepooja888@gmail.com","Pooja@123");
        
        driver.get("https://automationexercise.com/payment");
        PaymentPage pay = new PaymentPage(driver);
        pay.fillPayment("Pratik", "4111111111111111", "123", "12", "2028");
        System.out.println("Payment Page Run Zala");
        // pay.clickPay(); // khara order nako asel tar comment thev
    }
}