package comm.orangehrmapp;

import org.openqa.selenium.WebDriver;

import centralizedMethods.AutomationMethods;

public class DashboardBase extends AutomationMethods{
	
	public DashboardBase(WebDriver driver) {
		this.driver = driver;
	}
	
	public String DashbrdMainMenu="//*[@id='menu_dashboard_index']";
//	public String QuickLnchAssLeave="//*[@class='quickLaunge']//img[contains(@src,'ApplyLeave')]/following-sibling::span[text()='Assign Leave']";
//	public String QuickLnchLeaveLst="//*[@class='quickLaunge']//img[contains(@src,'MyLeave')]/following-sibling::span[text()='Leave List']";
	public String QuickLnchAssLeave="//span[text()='Assign Leave']";
	public String QuickLnchLeaveLst="//span[text()='Leave List']";
	public String QuickLnchTimesheet="//span[text()='Timesheets']";
	public String QuickLnchApplyLeave="//span[text()='Apply Leave']";
	public String QuickLnchMyLeave="//span[text()='My Leave']";
	public String QuickLnchMyTimeSheet="//span[text()='My Timesheet']";
	
	public void quickLaunchPanel() {
		verifyIsDisplayed(DashbrdMainMenu, "DashbrdMainMenu");
		verifyIsDisplayed(QuickLnchAssLeave, "QuickLnchAssLeave");
		verifyIsDisplayed(QuickLnchLeaveLst, "QuickLnchLeaveLst");
		verifyIsDisplayed(QuickLnchApplyLeave, "QuickLnchApplyLeave");
		verifyIsDisplayed(QuickLnchMyTimeSheet, "QuickLnchMyTimeSheet");
		verifyIsDisplayed(QuickLnchMyLeave, "QuickLnchMyLeave");
		verifyIsDisplayed(QuickLnchTimesheet, "QuickLnchTimesheet");
		
	}

	
	
	
}
