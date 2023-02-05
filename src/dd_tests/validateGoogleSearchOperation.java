package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class validateGoogleSearchOperation extends TestCore 
{
	@Test
	public void GoogleSearchOperation() throws IOException, InterruptedException 
	{
		try
		{
			// Verify Searchbar
			WebElement SearchBar = driver.findElement(By.xpath(object.getProperty("SearchBar")));
			Assert.assertEquals(true, SearchBar.isDisplayed());
			System.out.println("Search bar is visible and clickable.");
			app_logs.debug("Search bar is visible and clickable.");
			SearchBar.sendKeys(object.getProperty("TextForSearch"));
			SearchBar.sendKeys(Keys.ENTER);
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Search bar is not visible or clickable.");
		}

		Thread.sleep(4000);
		WebElement element1 = driver.findElement(By.xpath(object.getProperty("SearchResult1")));
		
		if ((element1.getText()).contains(object.getProperty("TextForSearch")))
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			WebElement element2 = driver.findElement(By.xpath(object.getProperty("SearchResult2")));
			if ((element2.getText()).contains(object.getProperty("TextForSearch")))
			{
				// js.executeScript("window.scrollBy(0,1000)");
				WebElement element3 = driver.findElement(By.xpath(object.getProperty("SearchResult3")));
				if ((element3.getText()).contains(object.getProperty("TextForSearch")))
				{
					WebElement element4 = driver.findElement(By.xpath(object.getProperty("SearchResult4")));
					if ((element4.getText()).contains(object.getProperty("TextForSearch")))
					{
						js.executeScript("window.scrollBy(0,1000)");
						WebElement element5 = driver.findElement(By.xpath(object.getProperty("SearchResult5")));
						if ((element5.getText()).contains(object.getProperty("TextForSearch")))
						{
							System.out.println("All Search Results are Correct.");
							app_logs.debug("All Search Results are Correct.");
						} 
						else
						{
							System.out.println("SearchResult5 is InCorrect.");
							app_logs.debug("SearchResult5 is InCorrect.");
						}
					} 
					else
					{
						System.out.println("SearchResult4 is InCorrect.");
						app_logs.debug("SearchResult4 is InCorrect.");
					}
				} 
				else 
				{
					System.out.println("SearchResult3 is InCorrect.");
					app_logs.debug("SearchResult3 is InCorrect.");
				}
			} 
			else
			{
				System.out.println("SearchResult2 is InCorrect.");
				app_logs.debug("SearchResult2 is InCorrect.");
			}
		} 
		else 
		{
			System.out.println("SearchResult1 is InCorrect.");
			app_logs.debug("SearchResult1 is InCorrect.");
		}
	}
}
