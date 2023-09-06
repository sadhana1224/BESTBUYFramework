package com.Bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Bestbuy.utils.Reports;
import com.Bestbuy.utils.SelWrappers;


public class BestBuyAddItemsPage  extends SelWrappers {
	//add first item-6th testcase

	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement searchProduct;
	@FindBy(xpath="//span[@class='header-search-icon']")
	WebElement clickSearch;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
	WebElement addProduct;
	//add 2nd item-7th testcase
	@FindBy(xpath="//header/div[1]/div[1]/nav[1]/button[1]/*[1]")
	WebElement clickMenu;
	@FindBy(xpath="//li[@class='liDropdownList '][11]")
	WebElement clicklist;
	@FindBy(xpath="//li[@class='liDropdownList '][6]")
	WebElement furniture;
	@FindBy(xpath="//a[text()='Luggage']")
	WebElement kitchenf;
	@FindBy(xpath="//input[@id='soldout_facet-Exclude-Out-of-Stock-Items-0']")
	WebElement outSt;
	@FindBy(xpath="((//h4[@class='sku-title'])//a)[3]")
	WebElement addproduct2;
	@FindBy(xpath="(//div[@class='fulfillment-add-to-cart-button'])[1]")
	WebElement addButton;

	//choose brand-add 3rd item-8th test case
	@FindBy(xpath="//button[@data-t='hamburger-navigation-button']")
	WebElement menuClick;
	@FindBy(xpath="//button[@data-id='node-86']")
	WebElement selprod3;
	@FindBy(xpath="//a[text()='Samsung']")
	WebElement brand;
	@FindBy(xpath="(//div[@class='col-xs-2'])[2]")
	WebElement brandpart;
	@FindBy(xpath="//a[text()='Refurbished Samsung phones']")
	WebElement brandprod;
	@FindBy(xpath="//input[@id='soldout_facet-Exclude-Out-of-Stock-Items-0']")
	WebElement outSt1;
	@FindBy(xpath="(//h4[@class='sku-title']//a)[5]")
	WebElement mobile;
	@FindBy(xpath="(//div[@class='fulfillment-add-to-cart-button'])[1]")
	WebElement addProduct3;

	//checkout page-9th test case

	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement goToCart;
	
	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement closeAd;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	@FindBy(xpath="//button[contains(text(),'Continue as Guest')]")
	WebElement cGuest;
	@FindBy(xpath="//button[text()='Switch all to shipping']")
	WebElement shipping;
	@FindBy(xpath="//input[@id='firstName']")
	WebElement bfname;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement bflname;
	@FindBy(xpath="//input[@id='street']")
	WebElement bstreet;
	@FindBy(xpath="//input[@id='city']")
	WebElement bcity;
	@FindBy(xpath="//select[@class='tb-select']")
	WebElement bstate;
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipcode;
	@FindBy(xpath="//input[@id='save-for-billing-address-Map {}']")
	WebElement billadd;
	@FindBy(xpath="//span[text()='Apply']")
	//contact information
	WebElement apply;
	@FindBy(id="user.emailAddress")
	WebElement payemail;

	@FindBy(id="user.phone")
	WebElement payphone;

	@FindBy(xpath="//div[@class='button--continue']//button")
	WebElement payment;
	
	//dummy payment
	@FindBy(xpath="//input[@id='number']")
	WebElement cardno;
	
	@FindBy(xpath="//select[@id='expMonth']//option[4]")
	WebElement expiremonth;
	
	@FindBy(xpath="//select[@id='expYear']//option[6]")
	WebElement expireyear;
	@FindBy(xpath="//input[@id='cvv']")
	WebElement cvv;
	//ask password
	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	
	//place your order
	@FindBy(xpath="//span[contains(text(),'Place Your Order')]")
	WebElement placeorder;
	public void searchAndAddItems(String item1,String name,String lname,String street,String city,String code,String pmail,String pnum) throws InterruptedException
	{
		//add item 1
		typeText(searchProduct,item1);
		click(clickSearch);
		//click(addProduct);
		if (addProduct.isDisplayed())
		{
			addProduct.click();
		}
		else {
			System.out.println("Product is out of stock.");
		}
		Thread.sleep(3000);
		navigateBack();

		//add item 2

		click(clickMenu);
		click(clicklist);
		click(furniture);
		click(kitchenf);
        click(outSt);
		click(addproduct2);

		if (addButton.isDisplayed())
		{
			addButton.click();
			Reports.reportStep("PASS","added the second product successfully");

		}
		else {
			System.out.println("Product is out of stock.");
			Reports.reportStep("FAIL","not added the second product successfully");
		}
		//click(addButton);

		Thread.sleep(3000);
		navigateBack();
		navigateBack();

		//add item3
		click(menuClick);
		click(selprod3);
		click(brand);
		click(brandpart);
		click(brandprod);
		click(outSt1);
		click(mobile);
		if (addProduct3.isDisplayed())
		{
			addProduct3.click();
			Reports.reportStep("PASS","added the third product successfully");

		}
		else {
			System.out.println("Product is out of stock.");
			Reports.reportStep("FAIL","not added the third product successfully");

		}

	
		//checkout page
		click(goToCart);
		click(closeAd);
		click(checkout);
		click(cGuest);
		click(shipping);
		typeText(bfname,name);
		typeText(bflname,lname);
		typeText(bstreet,street);
		typeText(bcity,city);
		selectByIndex(bstate,4);
		//typeText(bstate,state);
		typeText(zipcode,code);
		click(billadd);
		click(apply);

		//payment
		typeText(payemail,pmail);
		typeText(payphone,pnum);
		click(payment);

	}
	
	public void dummyPayment(String cno,String cvvno,String pwdc)
	{
		typeText(cardno,cno);
		click(expiremonth);
		click(expireyear);
		typeText(cvv,cvvno);
		typeText(pass,pwdc);
		click(placeorder);
	}
}




