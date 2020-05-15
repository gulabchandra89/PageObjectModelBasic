package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import base.TopMenu;
import crmAccounts.AccountsPage;
import crmAccounts.CreateAccountPage;
import crmPages.CRM_HomePage;
import pages.ZohoAppPage;
import utilities.Utility;

public class CreateAccountTest {

	@Test(dataProviderClass = Utility.class,dataProvider = "CommonDP")
	public void createAccountTest(Hashtable<String, String> data)
	{
		
		System.out.println("Account Name: "+ data.get("firstName"));
		
		  ZohoAppPage zPage=new ZohoAppPage(); //CRM_HomePage
		 CRM_HomePage crm_HomePage=zPage.goToCRM();
		  
		  AccountsPage accountPage= Page.menu.goToAccounts();
		  
		  
		  CreateAccountPage createAccountPage= accountPage.goToCreateAccounts();
		  
		  createAccountPage.CreateAccount(data.get("firstName"));
		 
		
	}
	
}
