package comm.orangehrmapp;

import org.openqa.selenium.WebDriver;

import centralizedMethods.AutomationMethods;

public class InvalidDtWarnMsgBase extends AutomationMethods{

	public InvalidDtWarnMsgBase(WebDriver driver) {
		this.driver = driver;
		}
	
	public String DashbrdMainMenu=  "//*[@id='menu_dashboard_index']";
	public String TimeMainMenu =    "//*[@id='menu_time_viewTimeModule']";
	public String TimesheetsMenu = "//*[@id='menu_time_Timesheets']";
	public String MyTimesheetsSubmenu = "//*[@id='menu_time_viewMyTimesheet']";
	
	public void warningmsg() {
		
		verifyIsDisplayed(DashbrdMainMenu, "DashbrdMainMenu");
		click(TimeMainMenu, "TimeMainMenu");
		click(TimesheetsMenu, "TimesheetsMenu");
		click(MyTimesheetsSubmenu, "MyTimesheetsSubmenu");
		
		
		
		
		
	}
	
}
