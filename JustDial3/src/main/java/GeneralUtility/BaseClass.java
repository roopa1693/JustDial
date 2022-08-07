package GeneralUtility;
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;
	import io.appium.java_client.service.local.AppiumDriverLocalService;

	public class BaseClass {
		public AndroidDriver driver;
		AppiumDriverLocalService service;

		DataBaseUtility Dlib=new DataBaseUtility();

		@BeforeSuite
		public void setConnection() {
			Dlib.connectToDB();
		}

		@BeforeMethod
		public void loginToApp() throws MalformedURLException {
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,IPathConstantsAppium.OsName);
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,IPathConstantsAppium.Version);
			dc.setCapability(MobileCapabilityType.UDID, IPathConstantsAppium.Udid);
			dc.setCapability("appPackage", IPathConstantsAppium.AppPackage);
			dc.setCapability("appActivity",IPathConstantsAppium.AppActivity);
			dc.setCapability("noReset", "true");
			URL url=new URL("http://localhost:4723/wd/hub");
		    driver=new AndroidDriver(url, dc);

		}
		@AfterMethod
		public void logoutApp() {
			driver.closeApp();
		}
	/*	@AfterClass
		public void stopServer() {
			service.stop(); 
		}*/
		@AfterSuite
		public void closeDB() {
			Dlib.closeDBconnection();
		}
	
}

