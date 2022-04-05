package comm.orangehrmapp;



import org.openqa.selenium.WebDriver;

import centralizedMethods.AutomationMethods;

public class NationalityBase extends AutomationMethods {
	
	public NationalityBase(WebDriver driver) {
		this.driver= driver;
	}
	
	public String dashboardmenu="//a[@id='menu_dashboard_index']";
	public String adminmenu = "//a[@id='menu_admin_viewAdminModule']";
	public String nationalitysubmenu = "//a[@id='menu_admin_nationality']";
	public String india = "//a[text()='India']";
	
	
	public void nationalitypage() {
		
		
		
		verifyIsDisplayed(dashboardmenu, "DashbrdMainMenu");
		click(adminmenu, "adminmenu");
		click(nationalitysubmenu,"nationalitysubmenu");
		scrollIntoView(india);
		verifyIsDisplayed(india, "india");
		
		
	}
	
	
	
	

}
