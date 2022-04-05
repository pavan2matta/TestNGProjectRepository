package com.orangehrmappchild;

import org.testng.annotations.Test;

import centralizedMethods.AutomationMethods;
import comm.orangehrmapp.InvalidDtWarnMsgBase;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class InvalidDtWarnMsgChild extends AutomationMethods{
	
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
	  public void loginorangehrm() throws InterruptedException, IOException {
		  loginhrm(prop.getProperty("URL").trim(), prop.getProperty("UserId").trim(),  prop.getProperty("Password").trim());
	  }
	  
	
  @Test(priority = 1,groups={"BVT","Sanity","Regression"},dependsOnMethods = "loginorangehrm")
  public void warningmeassage() {
	  InvalidDtWarnMsgBase idm = new InvalidDtWarnMsgBase(driver);
	  idm.warningmsg();
	  
	  
	  
  }
  
  

}
