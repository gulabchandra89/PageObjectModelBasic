package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page {
	
	
	public LoginPage goToLogin()
	{
		//driver.findElement(By.xpath("//div[3]/div[2]/div/a[4]")).click();
		click("login_xpath");
		return new LoginPage();
	}

	
	
	public void goToSupport()
	{
		driver.findElement(By.xpath("//div[3]/div[2]/div/a[2]")).click();
		
	}
	
	public void goToCustomers()
	{
		driver.findElement(By.xpath("//div[3]/div[2]/div/a[1]")).click();
		
	}
	
	public void goToContactSales()
	{
		driver.findElement(By.xpath("//div[3]/div[2]/div/a[3]")).click();
		
	}
	public void goToFreeSignUp()
	{
		driver.findElement(By.xpath("//div[3]/div[2]/div/a[5]")).click();
		
	}
	
	public void validateFooterLink()
	{
		
		
	}



	
}
