package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    @FindBy(xpath="//h2[text()='All Products']") WebElement allProducts;
    @FindBy(xpath="(//a[text()='View Product'])[1]") WebElement firstViewProduct;

    public ProductPage(WebDriver d){this.driver=d; PageFactory.initElements(d,this);}
    public boolean isAllProductVisible(){return allProducts.isDisplayed();}
    public void clickFirstProduct(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", firstViewProduct);
        js.executeScript("arguments[0].click();", firstViewProduct);
    }
}