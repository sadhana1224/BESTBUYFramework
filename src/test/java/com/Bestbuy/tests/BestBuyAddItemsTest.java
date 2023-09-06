package com.Bestbuy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Bestbuy.utils.BestWrappers;
import com.Bestbuy.utils.Reports;
import com.Bestbuy.utils.SelWrappers;

public class BestBuyAddItemsTest extends SelWrappers {
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	@Test
	public void add_Items_toCart()
	{
		try
		{
			Reports.setTCDesc("Search product and add item to the cart");
			bw.launchBrowser();
			//bw.brokenLinkBestbuy();
			se.chooseCountry();
			bw.bestBuyAddItemsToCart("macbook air 13.6 laptop","sadhana","sadhu","1510 Wyoming Blvd NE","Albuquerque","87112","sadhanasuba24@test.com","9688741481");
			//bw.dummyPaymentAndPlaceOrder("6543 6454 3854 5454", "123", "One+two=3");
			//Reports.reportStep("PASS", "item added in the cart");

			screenshot("additem1_valid");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "item not  added in the cart");
			ex.printStackTrace();
		}	
	}
	@AfterMethod
	public void clossBrowser()
	{
		closeAllBrowsers();
	}
}
