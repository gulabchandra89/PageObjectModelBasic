package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import freemarker.core.ReturnInstruction.Return;

public class LoginPage extends Page{

		
	public ZohoAppPage doLogin(String user,String pass)
	{
		//driver.findElement(By.xpath("//*[@id='login_id']")).sendKeys(user);
		type("user_xpath", user);
		
		//driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/form/button/span")).click();
		click("next_xpath");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
		type("pass_xpath", pass);
		//driver.findElement(By.xpath("//*[@id='nextbtn']/span")).click();
		click("sign_xpath");
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Enter OTP send to registered mobile number");
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//driver.findElement(By.xpath("//*[@id='nextbtn']/span")).click();
		click("verifyOTP_xpath");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='signin_flow']/div[5]/button[1]/span[2]")).click();
		click("trust_xpath");
		
	return new ZohoAppPage();
	
	
	}
	
	
}
