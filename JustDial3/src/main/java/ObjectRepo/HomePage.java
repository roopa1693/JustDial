package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage 
{
@FindBy(xpath="//android.widget.Button[@text='No, thanks']") private WebElement NoThanksButton;

@FindBy(xpath = "//android.widget.TextView[@text='Travel']") private WebElement TravelBtn;

@FindBy(xpath = "//android.widget.TextView[@text='Hotels']") private WebElement hotelBtn;

@FindBy(xpath = "//android.widget.TextView[@text='Resorts']") private WebElement resortBtn;

@FindBy(xpath = "//android.widget.TextView[@text='Filter']") private WebElement filterBtn;

@FindBy(xpath = "//android.view.View[@text='AC Rooms Available']") private WebElement availOpt;

@FindBy(xpath = "//android.widget.Button[@text='Apply']") private WebElement applyBtn;

@FindBy(xpath = "//android.view.View[@resource-id='dates']") private WebElement datesOpt;

@FindBy(xpath = "//android.widget.TextView[@text='15']") private WebElement date1;

@FindBy(xpath = "//android.widget.TextView[@text='22']") private WebElement date2;

@FindBy(xpath = "//android.widget.TextView[@text='Jain Farms']") private WebElement selectHotel;

@FindBy(xpath = "//android.widget.Button[@text='Book A Room']") private WebElement bookRoomBtn;

@FindBy(xpath = "//android.widget.TextView[@text='Bangalore']") private WebElement bangOpt;

@FindBy(xpath = "//android.widget.TextView[@text='Lemon Tree Hotel']") private WebElement hotelSelect;

@FindBy(xpath = "//android.widget.TextView[@text='Booking.com']")private WebElement bookingcomClick;

@FindBy(xpath = "//android.view.View[@text='Check-in date']") private WebElement dateCheck1;

@FindBy(xpath = "//android.view.View[@text='13 August 2022']") private WebElement dateSel1;

@FindBy(xpath = "//android.view.View[@text='Check-out date']") private WebElement dateCheck2;

@FindBy(xpath = "//android.view.View[@text='14 August 2022']") private WebElement dateSel2;

@FindBy(xpath = "//android.widget.TextView[@text='Yes']")private WebElement yesSelect;

public WebElement getCheckIn() {
	return checkIn;
}

@FindBy(xpath = "//android.widget.Button[@text='Search']") private WebElement searchBtn;

@FindBy(xpath = "//android.widget.TextView[@text='Lemon Tree Hotel Electronics City']")private WebElement finalSelect;

@FindBy(xpath = "//android.widget.Button[@text='Reserve']") private WebElement reserveBtn;

@FindBy(xpath = "//android.widget.TextView[@text='Check In'][1]") private WebElement checkIn;

public WebElement getBookingcomClick() {
	return bookingcomClick;
}

public WebElement getDateCheck1() {
	return dateCheck1;
}

public WebElement getDateSel1() {
	return dateSel1;
}

public WebElement getDateCheck2() {
	return dateCheck2;
}

public WebElement getDateSel2() {
	return dateSel2;
}

public WebElement getYesSelect() {
	return yesSelect;
}

public WebElement getSearchBtn() {
	return searchBtn;
}

public WebElement getFinalSelect() {
	return finalSelect;
}

public WebElement getReserveBtn() {
	return reserveBtn;
}

public HomePage(AndroidDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getNoThanksButton() {
	return NoThanksButton;
}

public WebElement getTravelBtn() {
	return TravelBtn;
}



public WebElement getHotelBtn() {
	return hotelBtn;
}

public WebElement getResortBtn() {
	return resortBtn;
}

public WebElement getHotelSelect() {
	return hotelSelect;
}

public WebElement getFilterBtn() {
	return filterBtn;
}

public WebElement getBangOpt() {
	return bangOpt;
}

public WebElement getAvailOpt() {
	return availOpt;
}

public WebElement getApplyBtn() {
	return applyBtn;
}

public WebElement getDatesOpt() {
	return datesOpt;
}

public WebElement getDate1() {
	return date1;
}

public WebElement getDate2() {
	return date2;
}

public WebElement getSelectHotel() {
	return selectHotel;
}

public WebElement getBookRoomBtn() {
	return bookRoomBtn;
}
}
