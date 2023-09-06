package com.Bestbuy.tests;

import org.testng.annotations.Test;

import com.Bestbuy.utils.BestWrappers;
import com.Bestbuy.utils.Reports;
import com.Bestbuy.utils.SelWrappers;

public class BestBuySearch_NegativeTest extends SelWrappers {
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	
	@Test
	
	public void signIn_invalidCredentials()
	{
		try
		{
		Reports.setTCDesc("Search with  invalid Credentials");
		bw.launchBrowser();
		bw.brokenLinkBestbuy();
		se.chooseCountry();
		bw.negativeTc_Search("fhgjhdfjgdf");
		screenshot("invalidSearch");
		Reports.setTCDesc("Search with  Empty ");
       bw.negativeTc_Search1("");
       screenshot("emptySearch");
		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}	
		finally
		{
			 closeAllBrowsers();
		}
	}
}