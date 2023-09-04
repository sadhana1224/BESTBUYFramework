package com.Bestbuy.tests;

import org.testng.annotations.Test;

import com.Bestbuy.utils.BestWrappers;
import com.Bestbuy.utils.Reports;
import com.Bestbuy.utils.SelWrappers;

public class BestBuyMenuTest extends SelWrappers {
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	@Test
	public void menuNavigation()
	{
		try
		{
			Reports.setTCDesc("Validating the title page of Menu");
			bw.launchBrowser("https://www.bestbuy.com/");
			bw.brokenLinkBestbuy();
			se.chooseCountry();
		    bw.bestBuyMenuPage();
			Reports.reportStep("PASS", "Title page of Menu passed");

			screenshot("Menu_valid");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "Title page of Menu failed");
			ex.printStackTrace();
		}	
	}
}
