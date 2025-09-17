package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Landing {
    WebDriver driver;

    public Landing(WebDriver driver) 
    {
        this.driver = driver;
    }

    public void verifyLandingPage() 
    {
        //driver.get("https://practice.automationtesting.in/");
        Assert.assertEquals(driver.getTitle(), "Automation Practice Site");
    }
}
