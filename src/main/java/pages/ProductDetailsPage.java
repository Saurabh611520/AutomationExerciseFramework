package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
    WebDriver driver;
    @FindBy(xpath="//div[@class='product-information']") WebElement info;
    @FindBy(xpath="//button[contains(text(),'Add to cart')]") WebElement addToCart;

    public ProductDetailsPage(WebDriver d){this.driver=d; PageFactory.initElements(d,this);}
    public boolean isProductVisible(){return info.isDisplayed();}
    public void addToCart(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", addToCart);
        try{ Thread.sleep(500); }catch(Exception e){}
        js.executeScript("arguments[0].click();", addToCart);
    }
}