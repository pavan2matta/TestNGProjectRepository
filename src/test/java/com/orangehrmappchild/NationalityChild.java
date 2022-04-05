package com.orangehrmappchild;

import org.testng.annotations.Test;

import centralizedMethods.AutomationMethods;
import comm.orangehrmapp.NationalityBase;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class NationalityChild extends AutomationMethods{
	
	
	@BeforeClass(groups={"BVT","Sanity","Regression"})
	  public void beforeClass() throws IOException {
		initialise();
		openChrome();
		
	  }

	  @AfterClass(groups={"BVT","Sanity","Regression"})
	  public void afterClass() {
		  driver.quit();
	  }
	  
	  @Test(priority = 0,groups={"BVT","Sanity","Regression"})
	  public void loginorangehrm() throws InterruptedException {
		  loginhrm(prop.getProperty("URL").trim(), prop.getProperty("UserId").trim(),  prop.getProperty("Password").trim());
	  }
	  
	  
    @Test(priority = 1,groups={"BVT","Sanity","Regression"},dependsOnMethods = "loginorangehrm")
  public void nationalitypage1() throws IOException{
    	NationalityBase nl = new NationalityBase(driver);
    	nl.nationalitypage();
	
	
  }


  
}
