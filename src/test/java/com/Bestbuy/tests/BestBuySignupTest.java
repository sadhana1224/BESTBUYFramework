package com.Bestbuy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Bestbuy.utils.BestWrappers;
import com.Bestbuy.utils.SelWrappers;
import com.Bestbuy.utils.Reports;

public class BestBuySignupTest extends SelWrappers {
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	
	@Test( groups = {"Positive"})
	public void signUpPage()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp functionality with valid credentials");
			bw.launchBrowser();
			bw.brokenLinkBestbuy();
			bw.bestSignUp("sadhu","logesh","sadhanasuba24@test.com","One+two=3","One+two=3","8532498732","sadhanasuba24@test.com","One+two=3");
			screenshot("signup_valid");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "SignUp failed");
			ex.printStackTrace();
		}	
	}
	@AfterMethod
	public void closeBrowsers()
	{
		closeAllBrowsers();
	}
	

}
