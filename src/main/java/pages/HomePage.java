package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath="//a[contains(text(),'Signup / Login')]") WebElement loginBtn;
    @FindBy(xpath="//a[contains(text(),'Products')]") WebElement productBtn;

    public HomePage(WebDriver driver) { this.driver=driver; PageFactory.initElements(driver, this); }
    public void clickLogin() { loginBtn.click(); }
    public void clickProducts() { productBtn.click(); }
}