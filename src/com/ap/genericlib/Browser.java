package com.ap.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Browser 
{

	public static WebDriver driver;
	
	public static WebDriver getBrowser(){	
		
	if(Constants.browser.equals("ie")){	
		System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");
		driver =new InternetExplorerDriver();
	}else if(Constants.browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\sjar\\chromr driver\\chromedriver.exe");
		driver =new ChromeDriver();
	}else if(Constants.browser.equals("firefox")){
		driver = new FirefoxDriver();
	}
		return driver;
	}

	

}
