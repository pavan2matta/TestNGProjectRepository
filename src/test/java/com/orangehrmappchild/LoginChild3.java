package com.orangehrmappchild;

import org.testng.annotations.Test;

import centralizedMethods.AutomationMethods;
import comm.orangehrmapp.DashboardBase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginChild3 extends AutomationMethods {

  @BeforeClass(groups={"BVT","Sanity","Regression"})
  public void beforeClass() throws IOException, InterruptedException {
	  initialise();
	  openChrome();
  }
  
  @AfterClass(groups={"BVT","Sanity","Regression"})
  public void afterMethod() {
	  driver.quit();  
  }
  
  @Test(priority = 0,groups={"BVT","Sanity","Regression"})
  public void LC3loginorangehrm() throws InterruptedException, IOException {
	  loginhrm(prop.getProperty("URL").trim(), prop.getProperty("UserId").trim(),  prop.getProperty("Password").trim());
  }
  
  @Test(priority = 0,groups={"BVT","Sanity","Regression"},dependsOnMethods = "LC3loginorangehrm")
  public void LC3loginorangehrm3() throws InterruptedException, IOException {
	  DashboardBase db=new DashboardBase(driver);
		 db.quickLaunchPanel();
  }

}
