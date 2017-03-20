package com.ap.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Women 
{
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenlink;
	

	public void women1() 
	{
		womenlink.click();
		
	}

}
