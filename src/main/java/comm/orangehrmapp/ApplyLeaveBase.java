package comm.orangehrmapp;


import org.openqa.selenium.WebDriver;


import centralizedMethods.AutomationMethods;

public class ApplyLeaveBase extends AutomationMethods{
	
	public ApplyLeaveBase(WebDriver driver) {
		this.driver = driver;
	}

	public String QuickLnchAssLeave="//span[text()='Assign Leave']";
	public String LeaveDashBrdMenu="//b[text()='Leave']";
	public String ApplyDashBrdSubMenu="//a[@id='menu_leave_applyLeave']";
	public String MyLeaveDashBrdSubMenu="//a[@id='menu_leave_viewMyLeaveList']";
	public String EntitlementsDashBrdSubMenu="//a[@id='menu_leave_Entitlements']";
	public String ReportsDashBrdSubMenu="//a[@id='menu_leave_Reports']";
	public String ConfigureDashBrdSubMenu="//a[@id='menu_leave_Configure']";
	public String LeaveListDashBrdSubMenu="//a[@id='menu_leave_viewLeaveList']";
	public String AssignLeaveDashBrdSubMenu="//a[@id='menu_leave_assignLeave']";
	
	public void applyleavesubpanelsdisplay() {
		
			verifyIsDisplayed(QuickLnchAssLeave, "QuickLnchAssLeave");
			verifyIsDisplayed(LeaveDashBrdMenu, "LeaveDashBrdMenu");
			verifyIsDisplayed(ApplyDashBrdSubMenu, "ApplyDashBrdSubMenu");
			verifyIsDisplayed(MyLeaveDashBrdSubMenu, "MyLeaveDashBrdSubMenu");
			verifyIsDisplayed(EntitlementsDashBrdSubMenu, "EntitlementsDashBrdSubMenu");
			verifyIsDisplayed(ReportsDashBrdSubMenu, "ReportsDashBrdSubMenu");
			verifyIsDisplayed(ConfigureDashBrdSubMenu, "ConfigureDashBrdSubMenu"); 
			verifyIsDisplayed(LeaveListDashBrdSubMenu, "LeaveListDashBrdSubMenu");
			verifyIsDisplayed(ReportsDashBrdSubMenu, "ReportsDashBrdSubMenu");
			verifyIsDisplayed(AssignLeaveDashBrdSubMenu, "AssignLeaveDashBrdSubMenu"); 
			
			
	 }
	
	public String emplyname="//*[@id='assignleave_txtEmployee_empName']";
	public String leaveType="//*[@id='assignleave_txtLeaveType']";
	public String fromdate="//*[@id='assignleave_txtFromDate']";
	public String todate="//*[@id='assignleave_txtToDate']";
	public String Comment= "//*[@id='assignleave_txtComment']";
	public String Assgnbtn="//*[@id='assignBtn']";
	
	    public void assignleave(String AssLeEmpname,String fromDate,String toDate) {
		clearNEnterText(emplyname, AssLeEmpname, "emplyname");
		selectByVisibleText(leaveType, "CAN - Bereavement", "Select Leave Type");
		clearNEnterText(fromdate, fromDate, "fromdate");
		clearNEnterText(todate, toDate, "todate");
		clearNEnterText(Comment, "ufuyfuy", "comment");
		click(Assgnbtn, "assgnbtn");
		
	}
}
 