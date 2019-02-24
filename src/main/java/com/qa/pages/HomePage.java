package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.BasePage;


public class HomePage extends BasePage {
	
	// define page factory 

		@FindBy (xpath="//a[@class='navbar-brand']/img")
		WebElement logo;

		@FindBy (xpath = "//h2[contains(text(),'We Deliver 2 Billion Forecasts Per Day')]")
		WebElement homepageText1;

		@FindBy (xpath = "//h2[contains(text(),'Current weather and forecasts in your city')]")
		WebElement homepageText2;
		
		@FindBy (xpath =" //button[@class='btn btn-orange']")
		WebElement btnSearch ;
		
		@FindBy (xpath ="//button[@class='btn search-cities__lnk']")
		WebElement linkCurrentLocation;
		
		@FindBy (xpath ="//a[@id='nav-search']/preceding-sibling::a[1]")
		WebElement btnSignIn;
		
		@FindBy (className ="//a[contains(text(),' Sign Up')]")
		WebElement btnSignUp;
		
		// Initialized page factory

		public  HomePage()throws IOException{
			PageFactory.initElements(driver, this);
		}
				
		// methods 
		//Validate Title of the Page
		public String validatehomePageTitle() {
			return driver.getTitle();			
		}
		//Verified Logo of the Page
		public boolean validatehomePageLogo () {
			return logo.isDisplayed();
			
		}
		//Validate Text on Banner		
		public boolean validatehomePageText1() {
			return homepageText1.isDisplayed();
			
		}
		//Validate Text on Banner (h2 tag)	
		public boolean validatehomePageText2() {
			return homepageText2.isDisplayed();	

	    }
		//Verify Sign in button	
		public boolean validateSingInbtn() {
			return homepageText2.isDisplayed();	
	    }

		//Verify Sign up button	
		public boolean validateSignUpbtn() {
			return homepageText2.isDisplayed();	
	    }
		
		public boolean validateLinkCurrentLocation(){
			return linkCurrentLocation.isDisplayed();
		
		}

}
