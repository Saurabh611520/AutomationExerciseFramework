package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(name="email") WebElement email;
    @FindBy(name="password") WebElement password;
    @FindBy(xpath="//button[text()='Login']") WebElement loginBtn;

    public LoginPage(WebDriver driver){ this.driver=driver; PageFactory.initElements(driver, this); }
    public void login(String user, String pass){ email.sendKeys(user); password.sendKeys(pass); loginBtn.click(); }
}