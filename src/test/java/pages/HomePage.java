package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
    WebDriver driver;

    // Locators for menu items
    protected By homeLink = By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/a");
    protected By shopLink = By.linkText("Shop");
    protected By myAccountLink = By.linkText("My Account");
    protected By testCasesLink = By.linkText("Test Cases");
    protected By atSiteLink = By.linkText("AT Site");
    protected By demoSiteLink = By.linkText("Demo Site");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    

    public void clickShop() {
        driver.findElement(shopLink).click();
    }

    public void clickMyAccount() {
        driver.findElement(myAccountLink).click();
    }
    
    public void clickTestCase() {
    	 driver.findElement(testCasesLink).click();
    }
    
    public void clickATSite() {
   	 driver.findElement(atSiteLink).click();
   }
    
    public void clickDemoSite() {
  	 driver.findElement(demoSiteLink).click();
  }
    
    public void clickHome() {
        driver.findElement(homeLink).click();
    }
    
}
