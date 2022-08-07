package projectDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GeneralUtility.BaseClass;
import GeneralUtility.MobileDriverUtility;
import ObjectRepo.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class demo extends BaseClass
{
@Test
public void demoProject() throws MalformedURLException, InterruptedException
{
	MobileDriverUtility mUtil=new MobileDriverUtility();
	HomePage hPage=new HomePage(driver);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	hPage.getNoThanksButton().click();
	hPage.getTravelBtn().click();
	hPage.getHotelBtn().click();
	hPage.getBangOpt().click();
	Thread.sleep(3000);
	mUtil.swipeAction(driver, 700, 1655, 700, 875, 10000);
	mUtil.swipeAction(driver, 850, 1190, 250, 1198, 10000);
	hPage.getHotelSelect().click();
	hPage.getBookRoomBtn().click();
	hPage.getBookingcomClick().click();
	Thread.sleep(5000);
	hPage.getDateCheck1().click();
	hPage.getDateSel1().click();
	
	hPage.getYesSelect().click();
	hPage.getSearchBtn().click();
	Thread.sleep(5000);
	hPage.getFinalSelect().click();
	Thread.sleep(3000);
	mUtil.swipeAction(driver, 430, 1700, 430, 1020, 10000);
	mUtil.swipeAction(driver, 430, 1808, 430, 680, 10000);
	mUtil.swipeAction(driver, 430, 1635, 430, 740, 10000);
	mUtil.swipeAction(driver, 430, 1625, 430, 812, 10000);
	mUtil.swipeAction(driver, 430, 1718, 430, 755, 10000);
	mUtil.swipeAction(driver, 430, 1158, 430, 400, 10000);
	hPage.getReserveBtn().click();
}
}
