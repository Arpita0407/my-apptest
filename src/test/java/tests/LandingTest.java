package tests;

import org.testng.annotations.Test;
import pages.Landing;

public class LandingTest extends BaseTest 
{

    @Test
    public void verifyLandingPageTitle() 
    {
        Landing landingPage = new Landing(driver);
        landingPage.verifyLandingPage();
    }
}
