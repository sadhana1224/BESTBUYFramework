package com.Bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Bestbuy.utils.SelWrappers;

public class BestBuyMenuPage extends SelWrappers {
	
	
	//top deal title
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topdeal;
	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement dealOD;
	
	
	public void menunavigation()
	{
	
				
		click(topdeal);
		String expectedTitle="Top Deals";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}

		driver.navigate().back();
		
		click(dealOD);
		expectedTitle="Deal";
		if(driver.getTitle().startsWith(expectedTitle))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}

		
	}

	

}
