package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AccountPage {
    WebDriver driver;
    @FindBy(xpath="//b[text()='Account Created!']") WebElement accCreated;
    @FindBy(xpath="//a[text()='Continue']") WebElement continueBtn;
    public AccountPage(WebDriver d){this.driver=d; PageFactory.initElements(d,this);}
    public boolean isAccountCreated(){return accCreated.isDisplayed();}
    public void clickContinue(){continueBtn.click();}
}