package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage 
{
	
	WebDriver driver;
	
	protected By shopLink = By.linkText("Shop");
	protected By productlnk = By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a[1]");
	protected By reviewlink = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/ul/li[2]");
	protected By desclink = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/ul/li[1]");
	protected By addtocart = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/form/button");
	
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

}
