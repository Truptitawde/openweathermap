package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.BasePage;

public class WeatherDetailsPage extends BasePage {
	
	@FindBy (xpath="//input[@placeholder='Your city name']")
	WebElement textBox_CityName;

	@FindBy (xpath = "//input[@placeholder='Your city name']/following::button[1]")
	WebElement btn_Search;	

// initialised page factory

	public  WeatherDetailsPage()throws IOException{
		PageFactory.initElements(driver, this);
	}

// methods 
	
	public void enterCityName (String CityName) {
		textBox_CityName.sendKeys(CityName);
		btn_Search.click();
		 
	}
}
