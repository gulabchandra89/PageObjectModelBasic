package base;

import java.sql.Driver;

import org.openqa.selenium.By;

import crmAccounts.AccountsPage;

public class TopMenu {
	
	
	
	
public void goToContacts()
{
	
}

public void goToLeads()
{
	
}

public AccountsPage goToAccounts()
{
  Page.driver.findElement(By.xpath("//*[@id='mainMenuTabDiv']/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
  return new AccountsPage();
}

public void goToDeals()
{
	
}

public void goToReports()
{
	
}

public void goToMarketplace()
{
	
}

public void goSignOut()
{
	Page.driver.findElement(By.xpath("")).click();
}

}
