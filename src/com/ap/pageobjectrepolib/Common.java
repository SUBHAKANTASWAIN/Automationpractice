package com.ap.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common 
{

	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutLink;

	public void logOut(){
		logoutLink.click();
	}
		
	}



