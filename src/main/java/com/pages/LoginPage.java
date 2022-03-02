package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BrowserConfigs;

public class LoginPage{
	
	@FindBy(id="id1")
	public WebElement username;
	
	@FindBy(id="id2")
	public WebElement password;
	
	@FindBy(id="id3")
	public WebElement signin;
	
	public LoginPage(){
		PageFactory.initElements(LoginPage.class, this);
	}
	

}
