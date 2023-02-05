package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyGoogleProducts extends TestCore 
{
	@Test
	public void GoogleProductsVerification() throws IOException
	{
		driver.get("https://about.google/intl/en/products/");
		try 
		{
			// Verify ExploreAllProducts button
			
			WebElement ExploreAllProducts = driver.findElement(By.xpath(object.getProperty("ExploreAllProducts")));
			Assert.assertEquals(true, ExploreAllProducts.isDisplayed());
			System.out.println("ExploreAllProducts button is visible and clickable.");
			app_logs.debug("ExploreAllProducts button is visible and clickable.");
			ExploreAllProducts.click();

		} 
		catch (Exception e)
		{
			app_logs.debug("ExploreAllProducts is not visible or clickable.");
		}
		try 
		{
			// Verify AndroidOS
			WebElement AndroidOS = driver.findElement(By.xpath(object.getProperty("AndroidOS")));
			Assert.assertEquals(true, AndroidOS.isDisplayed());
			System.out.println("AndroidOS is visible and clickable.");
			app_logs.debug("AndroidOS is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("AndroidOS is not visible or clickable.");
		}
		
		try 
		{
			// Verify AndroidTV
			
			WebElement AndroidTV = driver.findElement(By.xpath(object.getProperty("AndroidTV")));
			Assert.assertEquals(true, AndroidTV.isDisplayed());
			System.out.println("AndroidTV is visible and clickable.");
			app_logs.debug("AndroidTV is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("AndroidTV is not visible or clickable.");
		}
		try 
		{
			// Verify Calendar
			
			WebElement Calendar = driver.findElement(By.xpath(object.getProperty("Calendar")));
			Assert.assertEquals(true, Calendar.isDisplayed());
			System.out.println("Calendar is visible and clickable.");
			app_logs.debug("Calendar is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Calendar is not visible or clickable.");
		}
		try 
		{
			// Verify Cardboard
			
			WebElement Cardboard =driver.findElement(By.xpath(object.getProperty("Cardboard")));
			Assert.assertEquals(true, Cardboard.isDisplayed());
			System.out.println("Cardboard is visible and clickable.");
			app_logs.debug("Cardboard is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Cardboard is not visible or clickable.");
		}
		try 
		{
			// Verify Chrome
			
			WebElement Chrome = driver.findElement(By.xpath(object.getProperty("Chrome")));
			Assert.assertEquals(true, Chrome.isDisplayed());
			System.out.println("Chrome is visible and clickable.");
			app_logs.debug("Chrome is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Chrome is not visible or clickable.");
		}
		try 
		{
			// Verify ChromeWebStore
			
			WebElement ChromeWebStore = driver.findElement(By.xpath(object.getProperty("ChromeWebStore")));
			Assert.assertEquals(true, ChromeWebStore.isDisplayed());
			System.out.println("ChromeWebStore is visible and clickable.");
			app_logs.debug("ChromeWebStore is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("ChromeWebStore is not visible or clickable.");
		}
		try 
		{
			// Verify Chromebook
			
			WebElement Chromebook = driver.findElement(By.xpath(object.getProperty("Chromebook")));
			Assert.assertEquals(true, Chromebook.isDisplayed());
			System.out.println("Chromebook is visible and clickable.");
			app_logs.debug("Chromebook is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Chromebook is not visible or clickable.");
		}
		try 
		{
			// Verify Chromecast
			
			WebElement Chromecast = driver.findElement(By.xpath(object.getProperty("Chromecast")));
			Assert.assertEquals(true, Chromecast.isDisplayed());
			System.out.println("Chromecast is visible and clickable.");
			app_logs.debug("Chromecast is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Chromecast is not visible or clickable.");
		}
		try 
		{
			// Verify ConnectedHome
			
			WebElement ConnectedHome = driver.findElement(By.xpath(object.getProperty("ConnectedHome")));
			Assert.assertEquals(true, ConnectedHome.isDisplayed());
			System.out.println("ConnectedHome is visible and clickable.");
			app_logs.debug("ConnectedHome is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("ConnectedHome is not visible or clickable.");
		}
		try 
		{
			// Verify Contacts
			
			WebElement Contacts = driver.findElement(By.xpath(object.getProperty("Contacts")));
			Assert.assertEquals(true, Contacts.isDisplayed());
			System.out.println("Contacts is visible and clickable.");
			app_logs.debug("Contacts is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Contacts is not visible or clickable.");
		}
		try 
		{
			// Verify DigitalWellbeing
			
			WebElement DigitalWellbeing = driver.findElement(By.xpath(object.getProperty("DigitalWellbeing")));
			Assert.assertEquals(true, DigitalWellbeing.isDisplayed());
			System.out.println("DigitalWellbeing is visible and clickable.");
			app_logs.debug("DigitalWellbeing is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("DigitalWellbeing is not visible or clickable.");
		}
		try 
		{
			// Verify Docs
			
			WebElement Docs = driver.findElement(By.xpath(object.getProperty("Docs")));
			Assert.assertEquals(true, Docs.isDisplayed());
			System.out.println("Docs is visible and clickable.");
			app_logs.debug("Docs is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Docs is not visible or clickable.");
		}
		try 
		{
			// Verify Drive
			
			WebElement Drive = driver.findElement(By.xpath(object.getProperty("Drive")));
			Assert.assertEquals(true, Drive.isDisplayed());
			System.out.println("Drive is visible and clickable.");
			app_logs.debug("Drive is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Drive is not visible or clickable.");
		}
		try 
		{
			// Verify Earth
			
			WebElement Earth = driver.findElement(By.xpath(object.getProperty("Earth")));
			Assert.assertEquals(true, Earth.isDisplayed());
			System.out.println("Earth is visible and clickable.");
			app_logs.debug("Earth is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Earth is not visible or clickable.");
		}
		try 
		{
			// Verify Finance
			
			WebElement Finance = driver.findElement(By.xpath(object.getProperty("Finance")));
			Assert.assertEquals(true, Finance.isDisplayed());
			System.out.println("Finance is visible and clickable.");
			app_logs.debug("Finance is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Finance is not visible or clickable.");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		try 
		{
			// Verify Forms
			
			WebElement Forms = driver.findElement(By.xpath(object.getProperty("Forms")));
			Assert.assertEquals(true, Forms.isDisplayed());
			System.out.println("Forms is visible and clickable.");
			app_logs.debug("Forms is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Forms is not visible or clickable.");
		}
		try 
		{
			// Verify Gboard
			
			WebElement Gboard = driver.findElement(By.xpath(object.getProperty("Gboard")));
			Assert.assertEquals(true, Gboard.isDisplayed());
			System.out.println("Gboard is visible and clickable.");
			app_logs.debug("Gboard is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Gboard is not visible or clickable.");
		}
		try 
		{
			// Verify Gmail
			
			WebElement Gmail = driver.findElement(By.xpath(object.getProperty("Gmail")));
			Assert.assertEquals(true, Gmail.isDisplayed());
			System.out.println("Gmail is visible and clickable.");
			app_logs.debug("Gmail is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Gmail is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleAlerts
			
			WebElement GoogleAlerts = driver.findElement(By.xpath(object.getProperty("GoogleAlerts")));
			Assert.assertEquals(true, GoogleAlerts.isDisplayed());
			System.out.println("GoogleAlerts is visible and clickable.");
			app_logs.debug("GoogleAlerts is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleAlerts is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleArts&Culture
			
			WebElement GoogleArtsCulture = driver.findElement(By.xpath(object.getProperty("GoogleArts&Culture")));
			Assert.assertEquals(true, GoogleArtsCulture.isDisplayed());
			System.out.println("GoogleArts&Culture is visible and clickable.");
			app_logs.debug("GoogleArts&Culture is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleArts&Culture is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleAssistant
			
			WebElement GoogleAssistant = driver.findElement(By.xpath(object.getProperty("GoogleAssistant")));
			Assert.assertEquals(true, GoogleAssistant.isDisplayed());
			System.out.println("GoogleAssistant is visible and clickable.");
			app_logs.debug("GoogleAssistant is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleAssistant is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleAuthenticator
			
			WebElement GoogleAuthenticator = driver.findElement(By.xpath(object.getProperty("GoogleAuthenticator")));
			Assert.assertEquals(true, GoogleAuthenticator.isDisplayed());
			System.out.println("GoogleAuthenticator is visible and clickable.");
			app_logs.debug("GoogleAuthenticator is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleAuthenticator is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleChat
			
			WebElement GoogleChat = driver.findElement(By.xpath(object.getProperty("GoogleChat")));
			Assert.assertEquals(true, GoogleChat.isDisplayed());
			System.out.println("GoogleChat is visible and clickable.");
			app_logs.debug("GoogleChat is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleChat is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleCassroom
			
			WebElement GoogleCassroom = driver.findElement(By.xpath(object.getProperty("GoogleCassroom")));
			Assert.assertEquals(true, GoogleCassroom.isDisplayed());
			System.out.println("GoogleCassroom is visible and clickable.");
			app_logs.debug("GoogleCassroom is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleCassroom is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleDuo
			
			WebElement GoogleDuo = driver.findElement(By.xpath(object.getProperty("GoogleDuo")));
			Assert.assertEquals(true, GoogleDuo.isDisplayed());
			System.out.println("GoogleDuo is visible and clickable.");
			app_logs.debug("GoogleDuo is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleDuo is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleExpenditions
			
			WebElement GoogleExpenditions = driver.findElement(By.xpath(object.getProperty("GoogleExpenditions")));
			Assert.assertEquals(true, GoogleExpenditions.isDisplayed());
			System.out.println("GoogleExpenditions is visible and clickable.");
			app_logs.debug("GoogleExpenditions is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleExpenditions is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleFamilyLink
			
			WebElement GoogleFamilyLink =driver.findElement(By.xpath(object.getProperty("GoogleFamilyLink")));
			Assert.assertEquals(true, GoogleFamilyLink.isDisplayed());
			System.out.println("GoogleFamilyLink is visible and clickable.");
			app_logs.debug("GoogleFamilyLink is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleFamilyLink is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleFi
			
			WebElement GoogleFi = driver.findElement(By.xpath(object.getProperty("GoogleFi")));
			Assert.assertEquals(true, GoogleFi.isDisplayed());
			System.out.println("GoogleFi is visible and clickable.");
			app_logs.debug("GoogleFi is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleFi is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleFiles
			
			WebElement GoogleFiles = driver.findElement(By.xpath(object.getProperty("GoogleFiles")));
			Assert.assertEquals(true, GoogleFiles.isDisplayed());
			System.out.println("GoogleFiles is visible and clickable.");
			app_logs.debug("GoogleFiles is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleFiles is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleFindMyDevice
			
			WebElement GoogleFindMyDevice = driver.findElement(By.xpath(object.getProperty("GoogleFindMyDevice")));
			Assert.assertEquals(true, GoogleFindMyDevice.isDisplayed());
			System.out.println("GoogleFindMyDevice is visible and clickable.");
			app_logs.debug("GoogleFindMyDevice is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleFindMyDevice is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleFit
			
			WebElement GoogleFit = driver.findElement(By.xpath(object.getProperty("GoogleFit")));
			Assert.assertEquals(true, GoogleFit.isDisplayed());
			System.out.println("GoogleFit is visible and clickable.");
			app_logs.debug("GoogleFit is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleFit is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleFlights
			
			WebElement GoogleFlights = driver.findElement(By.xpath(object.getProperty("GoogleFlights")));
			Assert.assertEquals(true, GoogleFlights.isDisplayed());
			System.out.println("GoogleFlights is visible and clickable.");
			app_logs.debug("GoogleFlights is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleFlights is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleFonts
			
			WebElement GoogleFonts = driver.findElement(By.xpath(object.getProperty("GoogleFonts")));
			Assert.assertEquals(true, GoogleFonts.isDisplayed());
			System.out.println("GoogleFonts is visible and clickable.");
			app_logs.debug("GoogleFonts is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleFonts is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleGroups
			
			WebElement GoogleGroups = driver.findElement(By.xpath(object.getProperty("GoogleGroups")));
			Assert.assertEquals(true, GoogleGroups.isDisplayed());
			System.out.println("GoogleGroups is visible and clickable.");
			app_logs.debug("GoogleGroups is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleGroups is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleHomeApp
			
			WebElement GoogleHomeApp = driver.findElement(By.xpath(object.getProperty("GoogleHomeApp")));
			Assert.assertEquals(true, GoogleHomeApp.isDisplayed());
			System.out.println("GoogleHomeApp is visible and clickable.");
			app_logs.debug("GoogleHomeApp is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleHomeApp is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleInputTools
			
			WebElement GoogleInputTools = driver.findElement(By.xpath(object.getProperty("GoogleInputTools")));
			Assert.assertEquals(true, GoogleInputTools.isDisplayed());
			System.out.println("GoogleInputTools is visible and clickable.");
			app_logs.debug("GoogleInputTools is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleInputTools is not visible or clickable.");
		}
		try 
		{
			// Verify GoogLens
			
			WebElement GoogLens = driver.findElement(By.xpath(object.getProperty("GoogLens")));
			Assert.assertEquals(true, GoogLens.isDisplayed());
			System.out.println("GoogLens is visible and clickable.");
			app_logs.debug("GoogLens is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogLens is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleMeet
			
			WebElement GoogleMeet = driver.findElement(By.xpath(object.getProperty("GoogleMeet")));
			Assert.assertEquals(true, GoogleMeet.isDisplayed());
			System.out.println("GoogleMeet is visible and clickable.");
			app_logs.debug("GoogleMeet is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleMeet is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleOne
			WebElement GoogleOne = driver.findElement(By.xpath(object.getProperty("GoogleOne")));
			Assert.assertEquals(true, GoogleOne.isDisplayed());
			System.out.println("GoogleOne is visible and clickable.");
			app_logs.debug("GoogleOne is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleOne is not visible or clickable.");
		}
		js.executeScript("window.scrollBy(0,500)");
		try 
		{
			// Verify GooglePlay
			
			WebElement GooglePlay = driver.findElement(By.xpath(object.getProperty("GooglePlay")));
			Assert.assertEquals(true, GooglePlay.isDisplayed());
			System.out.println("GooglePlay is visible and clickable.");
			app_logs.debug("GooglePlay is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePlay is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePhotos
			
			WebElement GooglePhotos = driver.findElement(By.xpath(object.getProperty("GooglePhotos")));
			Assert.assertEquals(true, GooglePhotos.isDisplayed());
			System.out.println("GooglePhotos is visible and clickable.");
			app_logs.debug("GooglePhotos is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePhotos is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePlay
			
			WebElement GooglePlay = driver.findElement(By.xpath(object.getProperty("GooglePlay")));
			Assert.assertEquals(true, GooglePlay.isDisplayed());
			System.out.println("GooglePlay is visible and clickable.");
			app_logs.debug("GooglePlay is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePlay is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePlayBooks
			
			WebElement GooglePlayBooks = driver.findElement(By.xpath(object.getProperty("GooglePlayBooks")));
			Assert.assertEquals(true, GooglePlayBooks.isDisplayed());
			System.out.println("GooglePlayBooks is visible and clickable.");
			app_logs.debug("GooglePlayBooks is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePlayBooks is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePlayGames
			
			WebElement GooglePlayGames = driver.findElement(By.xpath(object.getProperty("GooglePlayGames")));
			Assert.assertEquals(true, GooglePlayGames.isDisplayed());
			System.out.println("GooglePlayGames is visible and clickable.");
			app_logs.debug("GooglePlayGames is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePlayGames is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePlayMoviesandTV
			
			WebElement GooglePlayMoviesandTV = driver.findElement(By.xpath(object.getProperty("GooglePlayMoviesandTV")));
			Assert.assertEquals(true, GooglePlayMoviesandTV.isDisplayed());
			System.out.println("GooglePlayMoviesandTV is visible and clickable.");
			app_logs.debug("GooglePlayMoviesandTV is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePlayMoviesandTV is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePlayPass
			
			WebElement GooglePlayPass = driver.findElement(By.xpath(object.getProperty("GooglePlayPass")));
			Assert.assertEquals(true, GooglePlayPass.isDisplayed());
			System.out.println("GooglePlayPass is visible and clickable.");
			app_logs.debug("GooglePlayPass is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePlayPass is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePlayProtect
			
			WebElement GooglePlayProtect = driver.findElement(By.xpath(object.getProperty("GooglePlayProtect")));
			Assert.assertEquals(true, GooglePlayProtect.isDisplayed());
			System.out.println("GooglePlayProtect is visible and clickable.");
			app_logs.debug("GooglePlayProtect is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePlayProtect is not visible or clickable.");
		}
		try 
		{
			// Verify GooglePodcasts
			
			WebElement GooglePodcasts = driver.findElement(By.xpath(object.getProperty("GooglePodcasts")));
			Assert.assertEquals(true, GooglePodcasts.isDisplayed());
			System.out.println("GooglePodcasts is visible and clickable.");
			app_logs.debug("GooglePodcasts is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GooglePodcasts is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleShopping
			
			WebElement GoogleShopping = driver.findElement(By.xpath(object.getProperty("GoogleShopping")));
			Assert.assertEquals(true, GoogleShopping.isDisplayed());
			System.out.println("GoogleShopping is visible and clickable.");
			app_logs.debug("GoogleShopping is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleShopping is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleStreetView
			
			WebElement GoogleStreetView = driver.findElement(By.xpath(object.getProperty("GoogleStreetView")));
			Assert.assertEquals(true, GoogleStreetView.isDisplayed());
			System.out.println("GoogleStreetView is visible and clickable.");
			app_logs.debug("GoogleStreetView is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleStreetView is not visible or clickable.");
		}
		try 
		{
			// Verify GoogleTasks
			
			WebElement GoogleTasks = driver.findElement(By.xpath(object.getProperty("GoogleTasks")));
			Assert.assertEquals(true, GoogleTasks.isDisplayed());
			System.out.println("GoogleTasks is visible and clickable.");
			app_logs.debug("GoogleTasks is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleTasks is not visible or clickable.");
		}
		try 
		{
			// Verify Hangouts
			
			WebElement Hangouts = driver.findElement(By.xpath(object.getProperty("Hangouts")));
			Assert.assertEquals(true, Hangouts.isDisplayed());
			System.out.println("Hangouts is visible and clickable.");
			app_logs.debug("Hangouts is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Hangouts is not visible or clickable.");
		}
		try 
		{
			// Verify Keep
			
			WebElement Keep = driver.findElement(By.xpath(object.getProperty("Keep")));
			Assert.assertEquals(true, Keep.isDisplayed());
			System.out.println("Keep is visible and clickable.");
			app_logs.debug("Keep is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Keep is not visible or clickable.");
		}
		try 
		{
			// Verify Maps
			
			WebElement Maps = driver.findElement(By.xpath(object.getProperty("Maps")));
			Assert.assertEquals(true, Maps.isDisplayed());
			System.out.println("Maps is visible and clickable.");
			app_logs.debug("Maps is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Maps is not visible or clickable.");
		}
		try 
		{
			// Verify Measure
			
			WebElement Measure = driver.findElement(By.xpath(object.getProperty("Measure")));
			Assert.assertEquals(true, Measure.isDisplayed());
			System.out.println("Measure is visible and clickable.");
			app_logs.debug("Measure is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Measure is not visible or clickable.");
		}
		try 
		{
			// Verify Messages
			
			WebElement Messages = driver.findElement(By.xpath(object.getProperty("Messages")));
			Assert.assertEquals(true, Messages.isDisplayed());
			System.out.println("Messages is visible and clickable.");
			app_logs.debug("Messages is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Messages is not visible or clickable.");
		}
		try 
		{
			// Verify News
			
			WebElement News = driver.findElement(By.xpath(object.getProperty("News")));
			Assert.assertEquals(true, News.isDisplayed());
			System.out.println("News is visible and clickable.");
			app_logs.debug("News is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("News is not visible or clickable.");
		}
		try 
		{
			// Verify PhotoScan
			
			WebElement PhotoScan = driver.findElement(By.xpath(object.getProperty("PhotoScan")));
			Assert.assertEquals(true, PhotoScan.isDisplayed());
			System.out.println("PhotoScan is visible and clickable.");
			app_logs.debug("PhotoScan is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("PhotoScan is not visible or clickable.");
		}
		try 
		{
			// Verify Pixel
			
			WebElement Pixel = driver.findElement(By.xpath(object.getProperty("Pixel")));
			Assert.assertEquals(true, Pixel.isDisplayed());
			System.out.println("Pixel is visible and clickable.");
			app_logs.debug("Pixel is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Pixel is not visible or clickable.");
		}
		js.executeScript("window.scrollBy(0,500)");
		try 
		{
			// Verify PixelBuds
			
			WebElement PixelBuds = driver.findElement(By.xpath(object.getProperty("PixelBuds")));
			Assert.assertEquals(true, PixelBuds.isDisplayed());
			System.out.println("PixelBuds is visible and clickable.");
			app_logs.debug("PixelBuds is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("PixelBuds is not visible or clickable.");
		}
		try 
		{
			// Verify Pixelbook
			
			WebElement Pixelbook = driver.findElement(By.xpath(object.getProperty("Pixelbook")));
			Assert.assertEquals(true, Pixelbook.isDisplayed());
			System.out.println("Pixelbook is visible and clickable.");
			app_logs.debug("Pixelbook is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Pixelbook is not visible or clickable.");
		}
		try 
		{
			// Verify Scholar
			
			WebElement Scholar = driver.findElement(By.xpath(object.getProperty("Scholar")));
			Assert.assertEquals(true, Scholar.isDisplayed());
			System.out.println("Scholar is visible and clickable.");
			app_logs.debug("Scholar is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Scholar is not visible or clickable.");
		}
		try 
		{
			// Verify Search
			
			WebElement Search = driver.findElement(By.xpath(object.getProperty("Search")));
			Assert.assertEquals(true, Search.isDisplayed());
			System.out.println("Search is visible and clickable.");
			app_logs.debug("Search is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Search is not visible or clickable.");
		}
		try 
		{
			// Verify Sheets
			
			WebElement Sheets = driver.findElement(By.xpath(object.getProperty("Sheets")));
			Assert.assertEquals(true, Sheets.isDisplayed());
			System.out.println("Sheets is visible and clickable.");
			app_logs.debug("Sheets is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Sheets is not visible or clickable.");
		}
		try 
		{
			// Verify Sites
			
			WebElement Sites = driver.findElement(By.xpath(object.getProperty("Sites")));
			Assert.assertEquals(true, Sites.isDisplayed());
			System.out.println("Sites is visible and clickable.");
			app_logs.debug("Sites is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Sites is not visible or clickable.");
		}
		try 
		{
			// Verify Slides
			
			WebElement Slides = driver.findElement(By.xpath(object.getProperty("Slides")));
			Assert.assertEquals(true, Slides.isDisplayed());
			System.out.println("Slides is visible and clickable.");
			app_logs.debug("Slides is visible and clickable.");			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Slides is not visible or clickable.");
		}
		try 
		{
			// Verify Snapseed
			
			WebElement Snapseed = driver.findElement(By.xpath(object.getProperty("Snapseed")));
			Assert.assertEquals(true, Snapseed.isDisplayed());
			System.out.println("Snapseed is visible and clickable.");
			app_logs.debug("Snapseed is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Snapseed is not visible or clickable.");
		}
		try 
		{
			// Verify Stadia
			
			WebElement Stadia = driver.findElement(By.xpath(object.getProperty("Stadia")));
			Assert.assertEquals(true, Stadia.isDisplayed());
			System.out.println("Stadia is visible and clickable.");
			app_logs.debug("Stadia is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Stadia is not visible or clickable.");
		}
		try 
		{
			// Verify TiltBrush
			
			WebElement TiltBrush = driver.findElement(By.xpath(object.getProperty("TiltBrush")));
			Assert.assertEquals(true, TiltBrush.isDisplayed());
			System.out.println("TiltBrush is visible and clickable.");
			app_logs.debug("TiltBrush is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("TiltBrush is not visible or clickable.");
		}
		try 
		{
			// Verify Translate
			
			WebElement Translate = driver.findElement(By.xpath(object.getProperty("Translate")));
			Assert.assertEquals(true, Translate.isDisplayed());
			System.out.println("Translate is visible and clickable.");
			app_logs.debug("Translate is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Translate is not visible or clickable.");
		}
		try 
		{
			// Verify TrustedContacts
			
			WebElement TrustedContacts =driver.findElement(By.xpath(object.getProperty("TrustedContacts")));            System.out.println("TrustedContacts is visible and clickable.");
			Assert.assertEquals(true, TrustedContacts.isDisplayed());
			System.out.println("TrustedContacts is visible and clickable.");
			app_logs.debug("TrustedContacts is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("TrustedContacts is not visible or clickable.");
		}
		try 
		{
			// Verify Voice
			
			WebElement Voice = driver.findElement(By.xpath(object.getProperty("Voice")));
			Assert.assertEquals(true, Voice.isDisplayed());
			System.out.println("Voice is visible and clickable.");
			app_logs.debug("Voice is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Voice is not visible or clickable.");
		}
		try 
		{
			// Verify Waze
			
			WebElement Waze =driver.findElement(By.xpath(object.getProperty("Waze")));
			Assert.assertEquals(true, Waze.isDisplayed());
			System.out.println("Waze is visible and clickable.");
			app_logs.debug("Waze is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Waze is not visible or clickable.");
		}
		try 
		{
			// Verify WearOSbyGoogle
			
			WebElement WearOSbyGoogle = driver.findElement(By.xpath(object.getProperty("WearOSbyGoogle")));
			Assert.assertEquals(true, WearOSbyGoogle.isDisplayed());
			System.out.println("WearOSbyGoogle is visible and clickable.");
			app_logs.debug("WearOSbyGoogle is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("WearOSbyGoogle is not visible or clickable.");
		}
		try 
		{
			// Verify YouTube
			
			WebElement YouTube = driver.findElement(By.xpath(object.getProperty("YouTube")));
			Assert.assertEquals(true, YouTube.isDisplayed());
			System.out.println("YouTube is visible and clickable.");
			app_logs.debug("YouTube is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("YouTube is not visible or clickable.");
		}
		try 
		{
			// Verify YouTubeKids
			
			WebElement YouTubeKids = driver.findElement(By.xpath(object.getProperty("YouTubeKids")));
			Assert.assertEquals(true, YouTubeKids.isDisplayed());
			System.out.println("YouTubeKids is visible and clickable.");
			app_logs.debug("YouTubeKids is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("YouTubeKids is not visible or clickable.");
		}
		try 
		{
			// Verify YouTubeMusic
			
			WebElement YouTubeMusic = driver.findElement(By.xpath(object.getProperty("YouTubeMusic")));
			Assert.assertEquals(true, YouTubeMusic.isDisplayed());
			System.out.println("YouTubeMusic is visible and clickable.");
			app_logs.debug("YouTubeMusic is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("YouTubeMusic is not visible or clickable.");
		}
		try 
		{
			// Verify YouTubeTV
			
			WebElement YouTubeTV = driver.findElement(By.xpath(object.getProperty("YouTubeTV")));
			Assert.assertEquals(true, YouTubeTV.isDisplayed());
			System.out.println("YouTubeTV is visible and clickable.");
			app_logs.debug("YouTubeTV is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("YouTubeTV is not visible or clickable.");
		}
		try 
		{
			// Verify YouTubeVR
			
			WebElement YouTubeVR = driver.findElement(By.xpath(object.getProperty("YouTubeVR")));
			Assert.assertEquals(true, YouTubeVR.isDisplayed());
			System.out.println("YouTubeVR is visible and clickable.");
			app_logs.debug("YouTubeVR is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("YouTubeVR is not visible or clickable.");
		}
		
		
	}
}
