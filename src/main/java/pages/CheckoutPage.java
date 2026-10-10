package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;
    @FindBy(xpath="//h2[text()='Address Details']") WebElement addressDetails;
    @FindBy(xpath="//a[text()='Place Order']") WebElement placeOrderBtn;
    @FindBy(xpath="//textarea[@name='message']") WebElement commentBox;

    public CheckoutPage(WebDriver d){ this.driver=d; PageFactory.initElements(d,this); }
    public boolean isAddressVisible(){ return addressDetails.isDisplayed(); }
    public void enterComment(String msg){ commentBox.sendKeys(msg); }
    public void clickPlaceOrder(){ placeOrderBtn.click(); }
}