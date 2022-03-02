package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilities.BrowserConfigs;

public class HomePage {
	
	@FindBy(id="id1")
	public WebElement home;
	
	@FindBy(id="id2")
	public WebElement changePassword;
	
	@FindBy(id="id3")
	public WebElement logout;
	
	
	

}
