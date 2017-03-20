package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignINPage 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		//verify loginpage
				/*String exploginTitle="Login - My Store";
				String actloginTitle=driver.getTitle();
				System.out.println(actloginTitle);
				if(actloginTitle.contains(exploginTitle))
				{
					System.out.println("loginpage is verified--->pass");
				}
				else
				{
					System.out.println("loginpage is not verified--->fail");
				}*/
		
		// login to site
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("julupandafamily@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expTitle="Women - My Store";
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
		String actualtitle10=driver.getTitle();
		System.out.println(actualtitle10);
		String expTitle10="Contact us - My Store";
		if(actualtitle10.contains(expTitle10))
		{
			System.out.println("contact us is verified--->pass");
		}
		else
		{
			System.out.println("contact us not verified--->fail");
		}
		driver.findElement(By.xpath("//input[@id='newsletter-input']")).sendKeys("julupandafamily@gmail.com");
		driver.findElement(By.xpath("//button[@class='btn btn-default button button-small']")).click();
		
	}
}
		
