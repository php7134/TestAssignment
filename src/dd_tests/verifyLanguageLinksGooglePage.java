package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyLanguageLinksGooglePage extends TestCore 
{
	@Test
	public void LanguageLinksVerifiaction() throws IOException
	{
		
        String a=null;
		String b=null;
		String b1=null;
		String a1=null;
		
		
		System.out.println(driver.findElement(By.xpath(object.getProperty("FeelingLuckyButton"))).getText());
		try 
		{
			// Verify SignIn button
			WebElement SignInButtonBefore =driver.findElement(By.xpath(object.getProperty("SignInButton")));
			Assert.assertEquals(true, SignInButtonBefore.isDisplayed());
			System.out.println("SignIn button is visible and clickable.");
			app_logs.debug("SignIn button is visible and clickable.");
			b=SignInButtonBefore.getText();
			System.out.println("Before Text of SigInbutton: "+b);
		} 
		catch (Exception e)
		{
			app_logs.debug("SignIn button is not visible or clickable.");
		}
		try 
		{
			// Verify FeelingLuckyButton
			WebElement FeelingLuckyButtonBefore = driver.findElement(By.xpath(object.getProperty("FeelingLuckyButton")));
			Assert.assertEquals(true, FeelingLuckyButtonBefore.isDisplayed());
			System.out.println("FeelingLuckyButton is visible and clickable.");
			app_logs.debug("FeelingLuckyButton is visible and clickable.");
			b1=(FeelingLuckyButtonBefore.getText());
			System.out.println("Before text of Feeling lucky Button:"+b1);
		} 
		catch (Exception e)
		{
			app_logs.debug("FeelingLuckyButton is not visible or clickable.");
		}
		try 
		{
			// Verify Language Link
			WebElement LanguageLink = driver.findElement(By.xpath(object.getProperty("LanguageLink")));
			Assert.assertEquals(true, LanguageLink.isDisplayed());
			System.out.println("LanguageLink is visible and clickable.");
			app_logs.debug("LanguageLink is visible and clickable.");
			LanguageLink.click();
		} 
		catch (Exception e)
		{
			app_logs.debug("LanguageLink is not visible or clickable.");
		}
		WebElement SignInButtonAfter = driver.findElement(By.xpath(object.getProperty("SignInButton")));
		Assert.assertEquals(true, SignInButtonAfter.isDisplayed());
		a=SignInButtonAfter.getText();
		System.out.println("After Text of SigInbutton: "+a);
		
		WebElement FeelingLuckyButtonAfter = driver.findElement(By.xpath(object.getProperty("FeelingLuckyButton")));
		Assert.assertEquals(true, FeelingLuckyButtonAfter.isDisplayed());
		a1=FeelingLuckyButtonAfter.getText();
		System.out.println("After text of Feeling lucky Button:"+b1);
		
		if(b.equals(a)& b1.equals(a1))
		{
			app_logs.debug("Home page language do not changed successfully.");
			System.out.println("Home page language do not changed successfully.");
			driver.navigate().back();
		}
		else
		{
			app_logs.debug("Home page language changed successfully.");
			System.out.println("Home page language changed successfully.");
		}
		

		WebElement DefaultLanguage = driver.findElement(By.xpath(object.getProperty("DefaultLanguage")));
		Assert.assertEquals(true, DefaultLanguage.isDisplayed());
		DefaultLanguage.click();
		System.out.println("Language settings changed to default.");
		
		
	}
}
