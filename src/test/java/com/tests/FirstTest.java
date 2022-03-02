package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.BrowserConfigs;

public class FirstTest extends BrowserConfigs{
	
	@BeforeMethod
	public void con() {
		
	}
	
	@Test @dependsOn
	public void method1() {
		
		LoginPage loginP = new LoginPage();
		HomePage homeP = new HomePage();
		
		
		
		loginP.username.sendKeys("raghav");
		loginP.password.sendKeys("***");
		loginP.signin.click();
	}

}
