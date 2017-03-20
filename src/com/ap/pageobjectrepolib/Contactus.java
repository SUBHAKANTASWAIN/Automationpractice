package com.ap.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ap.genericlib.WebDriverComonlib;

public class Contactus extends WebDriverComonlib
{
	@FindBy(xpath="//a[@title='Contact Us']")
	private WebElement contactus;
	
	
	public void contactuspage()
	{
		contactus.click();
	}

}
