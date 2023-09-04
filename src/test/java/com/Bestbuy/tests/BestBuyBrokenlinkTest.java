package com.Bestbuy.tests;

import org.testng.annotations.Test;

import com.Bestbuy.utils.BestWrappers;
import com.Bestbuy.utils.SelWrappers;
import com.Bestbuy.utils.Reports;

public class BestBuyBrokenlinkTest extends SelWrappers {

	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	
	@Test
	public void brokenLinktest()
	{
		try
		{
			Reports.setTCDesc("Validating the Url");
			se.brokenLinkBestbuy();
			Reports.reportStep("PASS", "Url passed");

			//screenshot("signup_valid");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "Url failed");
			ex.printStackTrace();
		}	
	}
}
