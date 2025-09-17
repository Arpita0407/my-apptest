package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShopPage 
{
	
	WebDriver driver;
	
	protected By shopLink = By.linkText("Shop");
	protected By productlnk = By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a[1]");
	protected By reviewlink = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/ul/li[2]");
	protected By desclink = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/ul/li[1]");
	protected By addtocart = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/form/button");
	protected By viewBasket = By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/a");
	protected By applycoupan = By.name("apply_coupon");
	
	 // Constructor
    public ShopPage(WebDriver driver) 
    {
        this.driver = driver;
    }
	
    // Actions  
    
    public void clickShop()
    {
    	driver.findElement(shopLink).click();
    }

    public void clickProduct() {
        driver.findElement(productlnk).click();
    }

    public void clickRviews()
    {
    	driver.findElement(reviewlink).click();
    }
    
    public void clickDescr()
    {
    	driver.findElement(desclink).click();
    }
    
    public void addToCart()
    {
    	driver.findElement(addtocart).click();
    	WebElement cartText = driver.findElement(By.cssSelector("a.wpmenucart-contents"));
        System.out.println("Cart Info: " + cartText.getText());
    }
    
    public void viewBasket()
    {
    	driver.findElement(viewBasket).click();
    }

    public void applycoupan()
    {
    	driver.findElement(applycoupan).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement warningMsg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/ul"));
        String actualMessage = warningMsg.getText();
        Assert.assertEquals(actualMessage, "Please enter a coupon code.");
        
        System.out.println("Validation message displayed: " + actualMessage);
    }
}
