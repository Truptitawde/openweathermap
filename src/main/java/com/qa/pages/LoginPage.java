package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.config.*;

import com.qa.utill.BasePage;

public class LoginPage extends BasePage	{
	
	// define page factory 

	@FindBy (xpath ="//a[@id='nav-search']/preceding-sibling::a[1]")
	WebElement Login;
	
	@FindBy (xpath ="//div[@class='input-group']//input[@id='user_email']")
	WebElement Username;
	
	@FindBy (xpath ="//input[@id='user_password']")
	WebElement Password;
	
	@FindBy (xpath ="//input[@value='Submit']")
	WebElement Submit;
	
	@FindBy (xpath ="//a[@class='pull-right']")
	WebElement Domain;

	// Initialized page factory

	public  LoginPage()throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	//Methods

	public  HomePage Login( String un , String pw) throws IOException{
		
		Username.sendKeys(un);
		Password.sendKeys(pw);
		Submit.click();
		
		return new HomePage();
	}
	

}