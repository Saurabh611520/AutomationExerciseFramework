package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
    WebDriver driver;
    @FindBy(xpath="//b[text()='Order Placed!']") WebElement orderPlaced;
    @FindBy(xpath="//a[text()='Continue']") WebElement continueBtn;

    public OrderConfirmationPage(WebDriver d){ this.driver=d; PageFactory.initElements(d,this); }
    public boolean isOrderPlaced(){ return orderPlaced.isDisplayed(); }
    public void clickContinue(){ continueBtn.click(); }
}