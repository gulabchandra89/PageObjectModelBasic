package rough;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Page;
import crmAccounts.AccountsPage;
import crmAccounts.CreateAccountPage;
import crmPages.CRM_HomePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;

public class LoginTest {

	public static void main(String[] args) {
		HomePage home= new HomePage();
		LoginPage loginPage=home.goToLogin();
		//LoginPage loginPage= new LoginPage();
		ZohoAppPage appPage=loginPage.doLogin("maligulabchandra89@gmail.com", "Udemy@selenium1234");
		//ZohoAppPage appPage= new ZohoAppPage();
		CRM_HomePage crm_HomePage=appPage.goToCRM();
		//CRM_HomePage crm_HomePage= new CRM_HomePage();
		AccountsPage accountsPage=Page.menu.goToAccounts();
		//AccountsPage accountsPage= new AccountsPage();
		CreateAccountPage createAccountPage= accountsPage.goToCreateAccounts();
		//CreateAccountPage createAccountPage= new CreateAccountPage();
		createAccountPage.CreateAccount("GulabMali");
		
	}

}
