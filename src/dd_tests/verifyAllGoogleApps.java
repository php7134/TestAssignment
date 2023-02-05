package dd_tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyAllGoogleApps extends TestCore
{
	@Test(priority = 2)
	public void verifyGoogleapps() throws IOException, InterruptedException
	{
		try 
		{
			// Verify Grid icon
			WebElement Grid = driver.findElement(By.xpath(object.getProperty("Gridicon")));
			Assert.assertEquals(true, Grid.isDisplayed());
			System.out.println("Grid Icon is visible and clickable – Assert passed.");
			app_logs.debug("Grid Icon is visible and clickable.");
			Grid.click();
			System.out.println("Clicked On Grid.");
			app_logs.debug("Clicked On Grid.");
		

		} 
		catch (Exception e) 
		{
			app_logs.debug("Grid Icon is not visible or clickable.");
		}

		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Thread.sleep(2500);
		try 
		{
			// Verify Account
			WebElement AccountApp = driver.findElement(By.xpath(object.getProperty("Account")));
			Assert.assertEquals(true, AccountApp.isDisplayed());
			System.out.println("Account is visible and clickable - Assert passed.");
			app_logs.debug("Account is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Account is not visible or clickable.");
		}
		try 
		{
			// Verify Search
			WebElement SearchApp = driver.findElement(By.xpath(object.getProperty("Search")));
			Assert.assertEquals(true, SearchApp.isDisplayed());
			System.out.println("Search is visible and clickable - Assert passed.");
			app_logs.debug("Search is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Search is not visible or clickable.");
		}
		try 
		{
			// Verify Maps
			WebElement MapsApp = driver.findElement(By.xpath(object.getProperty("Maps")));
			Assert.assertEquals(true, MapsApp.isDisplayed());
			System.out.println("Maps is visible and clickable - Assert passed.");
			app_logs.debug("Maps is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Maps is not visible or clickable.");
		}
		try 
		{
			// Verify Youtube
			WebElement YoutubeApp = driver.findElement(By.xpath(object.getProperty("Youtube")));
			Assert.assertEquals(true, YoutubeApp.isDisplayed());
			System.out.println("Youtube is visible and clickable - Assert passed.");
			app_logs.debug("Youtube is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Youtube is not visible or clickable.");
		}
		try 
		{
			// Verify Play
			WebElement PlayApp = driver.findElement(By.xpath(object.getProperty("Play")));
			Assert.assertEquals(true, PlayApp.isDisplayed());
			System.out.println("Play is visible and clickable - Assert passed.");
			app_logs.debug("Play is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Play is not visible or clickable.");
		}
		try 
		{
			// Verify News
			WebElement NewsApp = driver.findElement(By.xpath(object.getProperty("News")));
			Assert.assertEquals(true, NewsApp.isDisplayed());
			System.out.println("News is visible and clickable - Assert passed.");
			app_logs.debug("News is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("News is not visible or clickable.");
		}
		try 
		{
			// Verify Gmail			
			WebElement GmailApp = driver.findElement(By.xpath(object.getProperty("Gmail")));
			Assert.assertEquals(true, GmailApp.isDisplayed());
			System.out.println("Gmail is visible and clickable - Assert passed.");
			app_logs.debug("Gmail is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Gmail is not visible or clickable.");
		}
		try 
		{
			// Verify Meet
			WebElement MeetApp = driver.findElement(By.xpath(object.getProperty("Meet")));
			Assert.assertEquals(true, MeetApp.isDisplayed());
			System.out.println("Meet is visible and clickable - Assert passed.");
			app_logs.debug("Meet is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Meet is not visible or clickable.");
		}
		try 
		{
			// Verify Contacts
			WebElement ContactsApp = driver.findElement(By.xpath(object.getProperty("Contacts")));
			Assert.assertEquals(true, ContactsApp.isDisplayed());
			System.out.println("Contacts is visible and clickable - Assert passed.");
			app_logs.debug("Contacts is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Contacts is not visible or clickable.");
		}
		try 
		{
			// Verify Drive
			WebElement DriveApp = driver.findElement(By.xpath(object.getProperty("Drive")));
			Assert.assertEquals(true, DriveApp.isDisplayed());
			System.out.println("Drive is visible and clickable - Assert passed.");
			app_logs.debug("Drive is visible and clickable.");
		}
		catch (Exception e)
		{
			app_logs.debug("Drive is not visible or clickable.");
		}
		try 
		{
			// Verify Calendar
			WebElement CalendarApp = driver.findElement(By.xpath(object.getProperty("Calendar")));
			Assert.assertEquals(true, CalendarApp.isDisplayed());
			System.out.println("Calendar is visible and clickable - Assert passed.");
			app_logs.debug("Calendar is visible and clickable.");
		}
		catch (Exception e)
		{
			app_logs.debug("Calendar is not visible or clickable.");
		}
		try 
		{
			// Verify Translate
			WebElement TranslateApp =driver.findElement(By.xpath(object.getProperty("Translate")));
			Assert.assertEquals(true, TranslateApp.isDisplayed());
			System.out.println("Translate is visible and clickable - Assert passed.");
			app_logs.debug("Translate is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Translate is not visible or clickable.");
		}
		
		try 
		{
			// Verify Photos
			WebElement PhotosApp = driver.findElement(By.xpath(object.getProperty("Photos")));
			Assert.assertEquals(true, PhotosApp.isDisplayed());
			System.out.println("Photos is visible and clickable - Assert passed.");
			app_logs.debug("Photos is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Photos is not visible or clickable.");
		}
		try 
		{
			// Verify Duo
			WebElement DuoApp = driver.findElement(By.xpath(object.getProperty("Duo")));
			Assert.assertEquals(true, DuoApp.isDisplayed());
			System.out.println("Duo is visible and clickable - Assert passed.");
			app_logs.debug("Duo is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Duo is not visible or clickable.");
		}
		
		try 
		{
			// Verify Shopping
			WebElement ShoppingApp = driver.findElement(By.xpath(object.getProperty("Shopping")));
			Assert.assertEquals(true, ShoppingApp.isDisplayed());
			System.out.println("Shopping is visible and clickable - Assert passed.");
			app_logs.debug("Shopping is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Shopping is not visible or clickable.");
		}
		
		try 
		{
			// Verify Docs
			WebElement DocsApp =driver.findElement(By.xpath(object.getProperty("Docs")));
			Assert.assertEquals(true, DocsApp.isDisplayed());
			System.out.println("Docs is visible and clickable - Assert passed.");
			app_logs.debug("Docs is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Docs is not visible or clickable.");
		}
		try 
		{
			// Verify Sheets
			WebElement SheetsApp = driver.findElement(By.xpath(object.getProperty("Sheets")));
			Assert.assertEquals(true, SheetsApp.isDisplayed());
			System.out.println("Sheets is visible and clickable - Assert passed.");
			app_logs.debug("Sheets is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Sheets is not visible or clickable.");
		}
		try 
		{
			// Verify Slides
			WebElement SlidesApp = driver.findElement(By.xpath(object.getProperty("Slides")));
			Assert.assertEquals(true, SlidesApp.isDisplayed());
			System.out.println("Slides is visible and clickable - Assert passed.");
			app_logs.debug("Slides is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Slides is not visible or clickable.");
		}
		try 
		{
			// Verify Books
			WebElement BooksApp = driver.findElement(By.xpath(object.getProperty("Books")));
			Assert.assertEquals(true, BooksApp.isDisplayed());
			System.out.println("Books is visible and clickable - Assert passed.");
			app_logs.debug("Books is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Books is not visible or clickable.");
		}
		try 
		{
			// Verify Blogger
			WebElement BloggerApp = driver.findElement(By.xpath(object.getProperty("Blogger")));
			Assert.assertEquals(true, BloggerApp.isDisplayed());
			System.out.println("Blogger is visible and clickable - Assert passed.");
			app_logs.debug("Blogger is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Blogger is not visible or clickable.");
		}
		try 
		{
			// Verify Hangouts
			WebElement HangoutsApp = driver.findElement(By.xpath(object.getProperty("Hangouts")));
			Assert.assertEquals(true, HangoutsApp.isDisplayed());
			System.out.println("Hangouts is visible and clickable - Assert passed.");
			app_logs.debug("Hangouts is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Hangouts is not visible or clickable.");
		}
		try 
		{
			// Verify Keep
			WebElement KeepApp = driver.findElement(By.xpath(object.getProperty("Keep")));
			Assert.assertEquals(true, KeepApp.isDisplayed());
			System.out.println("Keep is visible and clickable - Assert passed.");
			app_logs.debug("Keep is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Keep is not visible or clickable.");
		}
		try 
		{
			// Verify Jamboard
			WebElement JamboardApp = driver.findElement(By.xpath(object.getProperty("Jamboard")));
			Assert.assertEquals(true, JamboardApp.isDisplayed());
			System.out.println("Jamboard is visible and clickable - Assert passed.");
			app_logs.debug("Jamboard is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Jamboard is not visible or clickable.");
		}
		
		try 
		{
			// Verify Earth
			WebElement EarthApp = driver.findElement(By.xpath(object.getProperty("Earth")));
			Assert.assertEquals(true, EarthApp.isDisplayed());
			System.out.println("Earth is visible and clickable - Assert passed.");
			app_logs.debug("Earth is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Earth is not visible or clickable.");
		}
		try 
		{
			// Verify Collections
			WebElement CollectionsApp = driver.findElement(By.xpath(object.getProperty("Collections")));
			Assert.assertEquals(true, CollectionsApp.isDisplayed());
			System.out.println("Collections is visible and clickable - Assert passed.");
			app_logs.debug("Collections is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Collections is not visible or clickable.");
		}
		try 
		{
			// Verify ArtsandCulture
			WebElement ArtsandCultureApp = driver.findElement(By.xpath(object.getProperty("ArtsandCulture")));
			Assert.assertEquals(true, ArtsandCultureApp.isDisplayed());
			System.out.println("ArtsandCulture is visible and clickable - Assert passed.");
			app_logs.debug("ArtsandCulture is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("ArtsandCulture is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleAds
			WebElement GoogleAdsApp = driver.findElement(By.xpath(object.getProperty("GoogleAds")));
			Assert.assertEquals(true, GoogleAdsApp.isDisplayed());
			System.out.println("GoogleAds is visible and clickable - Assert passed.");
			app_logs.debug("GoogleAds is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("GoogleAds is not visible or clickable.");
		}
		try 
		{
			// Verify Podcasts
			WebElement PodcastsApp = driver.findElement(By.xpath(object.getProperty("Podcasts")));
			Assert.assertEquals(true, PodcastsApp.isDisplayed());
			System.out.println("Podcasts is visible and clickable - Assert passed.");
			app_logs.debug("Podcasts is visible and clickable.");
			System.out.println("------TC_02 Executed--------");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Podcasts is not visible or clickable.");
		}
	}
}
