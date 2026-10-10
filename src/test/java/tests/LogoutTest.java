package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
public class LogoutTest extends BaseTest{
    @Test
    public void logoutTest(){
        HomePage home = new HomePage(driver);
        home.clickLogin();
        LoginPage login = new LoginPage(driver);
        login.login("sonwanepooja888@gmail.com","Pooja@123");
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        System.out.println("Logout Zala");
    }
}