package tests;

import org.testng.annotations.Test;
import pages.ShopPage;

public class ShopTest extends BaseTest
{
	
	  @Test(priority = 1)
	  public void navigateToShop() 
	  {    
		  ShopPage sp = new ShopPage(driver);
		  sp.clickShop();
		  sp.clickProduct();
		  sp.clickRviews();
		  sp.clickDescr();
		  sp.addToCart();
		  sp.viewBasket();
		  sp.applycoupan();
	  }
	  
	  
}
