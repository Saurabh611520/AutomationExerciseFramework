package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    WebDriver driver;
    @FindBy(xpath="//h2[text()='New User Signup!']") WebElement newUserText;
    @FindBy(name="name") WebElement name;
    @FindBy(xpath="//input[@data-qa='signup-email']") WebElement email;
    @FindBy(xpath="//button[text()='Signup']") WebElement signupBtn;
    
    public SignupPage(WebDriver d){ this.driver=d; PageFactory.initElements(d,this); }
    public boolean isNewUserVisible(){ return newUserText.isDisplayed(); }
    public void enterSignup(String n, String e){ name.sendKeys(n); email.sendKeys(e); signupBtn.click(); }
}