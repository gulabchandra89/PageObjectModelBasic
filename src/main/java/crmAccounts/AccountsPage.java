package crmAccounts;

import org.openqa.selenium.By;

import base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage goToCreateAccounts()
	{
		//driver.findElement(By.xpath("//*[@id='topRightIcons']/span[1]/link-to/button")).click();
		click("goToCreateAccounts_xpath");
		return new CreateAccountPage();
	}

	public void goToImportAccounts()
	{
		
		
	}
}
