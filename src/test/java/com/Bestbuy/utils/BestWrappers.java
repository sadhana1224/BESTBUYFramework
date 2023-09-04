package com.Bestbuy.utils;

import org.openqa.selenium.support.PageFactory;

import com.Bestbuy.pages.BestBuyAddItemsPage;
import com.Bestbuy.pages.BestBuyBottomLinkPage;
import com.Bestbuy.pages.BestBuyMenuPage;
import com.Bestbuy.pages.BestBuySignUpPage;


public class BestWrappers extends SelWrappers {
	SelWrappers se= new SelWrappers();
	
	public void bestSignUp(String fname,String lname,String email,String pwd,String repwd,String phnum,String SigninMail,String siPwd) throws InterruptedException
	{
		
		BestBuySignUpPage bbPage=PageFactory.initElements(driver, BestBuySignUpPage.class);
		bbPage.bestBuySignup(fname, lname, email, pwd, repwd, phnum,SigninMail, siPwd);
			
	}
	public void bestBuyMenuPage()
	{
		
		BestBuyMenuPage bmPage=PageFactory.initElements(driver, BestBuyMenuPage.class);
		bmPage.menunavigation();
	}
	public void bestBuyHomepageBottomLink()
	{
		
		BestBuyBottomLinkPage bmlPage=PageFactory.initElements(driver, BestBuyBottomLinkPage.class);
		bmlPage.bottomLinks();
	}
	public void bestBuyAddItemsToCart(String item1,String name,String lname,String city,String street,String code,String email,String num) throws InterruptedException
	{
		
		BestBuyAddItemsPage baPage=PageFactory.initElements(driver, BestBuyAddItemsPage.class);
		baPage.searchAndAddItems(item1,name,lname,city,street,code,email,num);

	}

}
