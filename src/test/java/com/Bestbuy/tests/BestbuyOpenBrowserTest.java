package com.Bestbuy.tests;

import org.testng.annotations.Test;

import com.Bestbuy.utils.BestWrappers;
import com.Bestbuy.utils.SelWrappers;
import com.Bestbuy.utils.Reports;

public class BestbuyOpenBrowserTest extends SelWrappers{
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	

	//First testcase
	@Test
	public void browserLaunch()
	{
		try
		{
			Reports.setTCDesc("Valid launchbrowser functionality");
			launchBrowser("https://www.bestbuy.com/");
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			Reports.reportStep("FAIL", "Problem broseTutorials page");
		}
	}


		
	}


