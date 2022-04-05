package com.orangehrmappchild;

import org.testng.annotations.Test;

import centralizedMethods.AutomationMethods;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class UserAddChild extends AutomationMethods{
 
	
	@Test
	public void useradd() {
		
		
		
	}
	
  
 
	
	@BeforeClass
  public void beforeClass() throws IOException, InterruptedException {
		initialise();
		openChrome();
		
  }

  
	
	@AfterClass
  public void afterClass() {
		
		driver.quit();
  }

}
