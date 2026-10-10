package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.SignupPage;
public class SignupTest extends BaseTest{
    @Test
    public void signupTest(){
        HomePage home = new HomePage(driver);
        home.clickLogin();
        SignupPage signup = new SignupPage(driver);
        signup.isNewUserVisible();
        signup.enterSignup("Pratik"+System.currentTimeMillis(), "pratik"+System.currentTimeMillis()+"@test.com");
        System.out.println("Signup Page Run Zala");
    }
}