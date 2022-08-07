package GeneralUtility;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtility
{
	/**
	 * it will wait for 10 seconds till the page gets load..(synchronization for find elements)..
	 * @param driver
	 */
	public void waitForPageToLoad(MobileDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * it will wait 10 seconds for java script element..
	 * @param driver
	 */
	public void waitForPageToLoadForJSElement(MobileDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	}
	/**
	 * it will check for the element in the GUI for polling time 500ms..(Explicit wait)..
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(MobileDriver driver,MobileElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * it will check for the element in the GUI for polling time 500ms..(Explicit wait)..
	 * check fot title is..
	 * @param driver
	 * @param element
	 */
	public void waitForTitleContains(MobileDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(title));
	}
	/**
	 * here we can change the polling time from default 500ms to any polling time (fluentwait)..
	 * @param driver
	 * @param pollingTime
	 * @param element
	 */
	public void waitForElementToCustom(MobileDriver driver,int pollingTime,MobileElement element)
	{
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(pollingTime,TimeUnit.SECONDS);
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * here we are giving custom timeout..
	 * @param element
	 * @throws InterruptedException
	 */
	public void waitAndClick(MobileElement element) throws InterruptedException
	{
		int count=0;
		while(count<10)
		{
			try
			{
				element.click();	
			}
			catch(Exception e)
			{
				Thread.sleep(1000);	
				count++;
			}
		}
	}
	/**
	 * Scroll Method..
	 * @param driver
	 * @param aName
	 * @param aValue
	 */
	public void scrollToElement(AndroidDriver driver,String aName,String aValue)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+aName+"(\""+aValue+"\"))");
	}
	/**
	 * To Tap on Element
	 * @param driver
	 * @param element
	 */
	public void tapOnElement(AndroidDriver driver,MobileElement element)
	{
		driver.tap(1, element, 100);
	}
	/**
	 * To Swipe..
	 * @param driver
	 * @param startX
	 * @param startY
	 * @param endX
	 * @param endY
	 * @param Duration
	 */
	public void swipeAction(AndroidDriver driver,int startX, int startY, int endX,int endY,int Duration)
	{
		driver.swipe(startX, startY, endX, endY, Duration);
	}
	/**
	 * Rotate Landscape
	 * @param driver
	 */
	public void orientationMethodLandscape(AndroidDriver driver)
	{
		driver.rotate(ScreenOrientation.LANDSCAPE);
	}
	/**
	 * To Rotate Portrait..
	 * @param driver
	 */
	public void orientationMethodPortrait(AndroidDriver driver)
	{
		driver.rotate(ScreenOrientation.PORTRAIT);
	}
}
