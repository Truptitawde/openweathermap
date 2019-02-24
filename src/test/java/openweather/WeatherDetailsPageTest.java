package openweather;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.WeatherDetailsPage;
import com.qa.utill.BasePage;


public class WeatherDetailsPageTest extends BasePage{

	public HomePage homepage;
	public WeatherDetailsPage weatherdetailspage;
	
	public WeatherDetailsPageTest() throws Exception{
		super();
		
	}
	@BeforeMethod
	public void setUp () throws IOException {
		initialization();
		
		homepage= new HomePage();
		weatherdetailspage = new WeatherDetailsPage();
	}	
	@Test (priority= 1)
	public void EnterCityName(){
		weatherdetailspage.enterCityName(prop.getProperty("CityName"));
		
		String CName = "Mumbai";
		
		WebElement actualresult = driver.findElement(By.xpath("//a[contains(text(),'"+ CName +"')]"));
		
		String result = actualresult.getText();
		
		String expectedResult = " Mumbai, IN";
		
		Assert.assertEquals(result,expectedResult);
				
		}	
	@Test (priority= 2)
	public void EnterInvalidCityName(){
		weatherdetailspage.enterCityName(prop.getProperty("InvalidCityName"));
		WebElement errorMsg = driver.findElement(By.xpath("//div[@role='alert']"));
	}
	/*@AfterMethod
	public void tearDown (){
		driver.quit();
}*/
	
}
