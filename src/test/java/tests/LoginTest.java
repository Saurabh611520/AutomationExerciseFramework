

package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
public class LoginTest extends BaseTest{
    @Test
    public void loginTest(){
        HomePage home = new HomePage(driver);
        home.clickLogin();
        LoginPage login = new LoginPage(driver);
        login.login("sonwanepooja888@gmail.com","Pooja@123");
        System.out.println("Login Test Run Zala: "+driver.getTitle());
    }
}