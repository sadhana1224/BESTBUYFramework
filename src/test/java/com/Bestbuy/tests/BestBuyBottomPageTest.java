package com.Bestbuy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Bestbuy.utils.BestWrappers;
import com.Bestbuy.utils.Reports;
import com.Bestbuy.utils.SelWrappers;

public class BestBuyBottomPageTest extends SelWrappers {
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	@Test
	public void bottomLinkValidation()
	{
		try
		{
			Reports.setTCDesc("Validating the Home Page Bottom Links");
			bw.launchBrowser();
			bw.brokenLinkBestbuy();
			se.chooseCountry();
		    bw.bestBuyHomepageBottomLink();
		Reports.reportStep("PASS", "Home Page Bottom Links Validated");

			screenshot("BottomLink_valid");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "Home Page Bottom Links not Validated");
			ex.printStackTrace();
		}	
	}
	@AfterMethod
	public void closeBrowser()
	{
		
		closeAllBrowsers();
	}
}
