package com.ap.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ap.genericlib.Browser;
import com.ap.genericlib.Constants;
import com.ap.genericlib.WebDriverComonlib;



public class Login extends WebDriverComonlib{


	@FindBy(id="email")
	private WebElement usernameEdt;
	
	@FindBy(id="passwd")
	private WebElement passwordEdt;
	
	@FindBy(id="SubmitLogin")
	private WebElement SigninBtn;

	public void SignintoAp(){
		Browser.driver.get(Constants.url);
		waitForPageToLoad();
		usernameEdt.sendKeys(Constants.userNAme);
		passwordEdt.sendKeys(Constants.password);
		SigninBtn.click();
	}


	



	

}
