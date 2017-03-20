package com.ap.homepageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.pageobjectrepolib.Common;
import com.ap.pageobjectrepolib.Contactus;
import com.ap.pageobjectrepolib.Login;
import com.ap.pageobjectrepolib.Women;
import com.ap.genericlib.Browser;
import com.ap.genericlib.Constants;

public class HomapageTest 
{

	private static final String priority = null;
	//object declaration
	WebDriver driver;
	Login loginPAge;
	Women WomenPage;
	Common comPage;
	Contactus contactusPage;

	@BeforeClass
	public void configBeforeClass()
	{
		
		//object intailzation
		//all 3 pages comes under login page
		driver = Browser.getBrowser();
		loginPAge = PageFactory.initElements(driver, Login.class);
		comPage = PageFactory.initElements(driver, Common.class);
		WomenPage=PageFactory.initElements(driver, Women.class);
		contactusPage=PageFactory.initElements(driver, Contactus.class);
		//login to App
		loginPAge.SignintoAp();

	}
	/*@BeforeMethod
	public void configBeforeMtd()
	{
		//login to App
		loginPAge.SignintoAp();	
	}*/
	@Test
	public void verifywomenTitle()throws Throwable
	{
		//driver.findElement(By.xpath("//a[@title='Women']")).click();
		WomenPage.women1();
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expTitle="Women - My Store";
		Assert.assertEquals(actualtitle, expTitle);
	}
	@Test(priority=1)
	public void verifycontactPage()throws Throwable
	{
		contactusPage.contactuspage();
		String actualtitle1=driver.getTitle();
		System.out.println(actualtitle1);
		String expTitle1="Contact us - My Store";
		Assert.assertEquals(actualtitle1, expTitle1);
	}

	/*@AfterMethod
		public void configAfterMtd(){
			comPage.logOut();*/
	@AfterClass
	public void configAfterclass()
	{
		comPage.logOut();
		driver.close();
	}

}


