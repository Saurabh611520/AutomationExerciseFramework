package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    WebDriver driver;
    @FindBy(xpath="//h2[text()='Get In Touch']") WebElement getInTouch;
    @FindBy(name="name") WebElement name;
    @FindBy(name="email") WebElement email;
    @FindBy(name="subject") WebElement subject;
    @FindBy(name="message") WebElement message;
    @FindBy(name="submit") WebElement submitBtn;

    public ContactUsPage(WebDriver d){ this.driver=d; PageFactory.initElements(d,this); }
    public boolean isGetInTouchVisible(){ return getInTouch.isDisplayed(); }
    public void fillForm(String n, String e, String sub, String msg){
        name.sendKeys(n); email.sendKeys(e); subject.sendKeys(sub); message.sendKeys(msg);
    }
    public void clickSubmit(){ submitBtn.click(); }
}