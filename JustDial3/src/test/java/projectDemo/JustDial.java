package projectDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GeneralUtility.BaseClass;
import GeneralUtility.MobileDriverUtility;
import ObjectRepo.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class JustDial extends BaseClass
{
@Test
	public void demoProject1() throws MalformedURLException, InterruptedException 
	{
		MobileDriverUtility mUtil=new MobileDriverUtility();
		HomePage hPage=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		hPage.getNoThanksButton().click();
		hPage.getTravelBtn().click();
		hPage.getHotelBtn().click();
		Thread.sleep(10000);
		mUtil.swipeAction(driver,750, 1550, 750, 925, 10000);
		
		hPage.getResortBtn().click();
		
		hPage.getFilterBtn().click();
		Thread.sleep(3000);
		
		mUtil.swipeAction(driver, 700, 1550, 700, 959, 10000);
		
		hPage.getAvailOpt().click();
		
		mUtil.swipeAction(driver,700, 1618, 700, 1032, 10000);
		hPage.getApplyBtn().click();
		
		hPage.getDatesOpt().click();
		hPage.getDate1().click();
		
		
		hPage.getDate2().click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='14']")).click();
		
		Thread.sleep(3000);
		
		hPage.getSelectHotel().click();
		
		hPage.getBookRoomBtn().click();
		Thread.sleep(5000);
	}

}
