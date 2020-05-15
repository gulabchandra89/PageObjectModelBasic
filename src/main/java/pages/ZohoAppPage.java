package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import crmPages.CRM_HomePage;

public class ZohoAppPage extends Page{
	
	
	
	
	public CRM_HomePage goToCRM() {
		
		//driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[6]/div/a/span")).click();
		click("goToCRM_xpath");
		return new CRM_HomePage();

	}
	
public void goToDesk() {
		

	}


public void goToSheet() {
	

}

public void goToMeeting() {
	

}
public void goToShow() {
	

}
public void goToMail() {
	

}

}
