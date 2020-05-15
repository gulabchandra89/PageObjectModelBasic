package crmAccounts;

import org.openqa.selenium.By;

import base.Page;

public class CreateAccountPage extends Page{

	public void CreateAccount(String AccountName)
	
	{
		//driver.findElement(By.xpath("//*[@id=\"Crm_Accounts_ACCOUNTNAME\"]")).sendKeys(AccountName);
		type("CreateAccount_xpath", AccountName);
		
	}
	
}
