package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.ContactUsPage;
import pages.HomePage;
public class ContactUsTest extends BaseTest{
    @Test
    public void contactUsTest(){
        HomePage home = new HomePage(driver);
        // HomePage madhe ContactUs button add kar
        driver.get("https://automationexercise.com/contact_us");
        ContactUsPage contact = new ContactUsPage(driver);
        contact.isGetInTouchVisible();
        contact.fillForm("Pratik","pratik@test.com","Test Subject","Hello Team");
        System.out.println("ContactUs Page Run Zala");
    }
}