package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;
    @FindBy(name="name_on_card") WebElement nameOnCard;
    @FindBy(name="card_number") WebElement cardNumber;
    @FindBy(name="cvc") WebElement cvc;
    @FindBy(name="expiry_month") WebElement expMonth;
    @FindBy(name="expiry_year") WebElement expYear;
    @FindBy(id="submit") WebElement payBtn;

    public PaymentPage(WebDriver d){ this.driver=d; PageFactory.initElements(d,this); }
    public void fillPayment(String name, String card, String cvv, String mm, String yyyy){
        nameOnCard.sendKeys(name); cardNumber.sendKeys(card);
        cvc.sendKeys(cvv); expMonth.sendKeys(mm); expYear.sendKeys(yyyy);
    }
    public void clickPay(){ payBtn.click(); }
}