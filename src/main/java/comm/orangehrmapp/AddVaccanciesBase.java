package comm.orangehrmapp;

import org.openqa.selenium.WebDriver;

import centralizedMethods.AutomationMethods;

public class AddVaccanciesBase extends AutomationMethods{
	
	public AddVaccanciesBase(WebDriver driver) {
		this.driver= driver;
		}
	
	public String dashboardmenu="//a[@id='menu_dashboard_index']";
	public String recruitment = "//*[@id='menu_recruitment_viewRecruitmentModule']";
	public String vacancies = "//*[@id='menu_recruitment_viewJobVacancy']";
	
	
	public void vacanciespage() {
		verifyIsDisplayed(dashboardmenu, "dashboardmenu");
		mouseOver(recruitment, "recruitment");
		mouseOverNClick(vacancies, "vacancies");
		
		
		
		
	}
	
	
	
	

}
