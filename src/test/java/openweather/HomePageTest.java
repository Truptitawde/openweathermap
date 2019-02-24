package openweather;
	
	import java.io.IOException;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.utill.BasePage;
	
public class HomePageTest extends BasePage {
	
		public HomePage homepage;
				

		public HomePageTest() throws Exception{
			super();
			
		}
		
		@BeforeMethod
		public void setUp () throws IOException {
			initialization();
				homepage= new HomePage();

		}
		
		@Test (description = "Validate Home page title")
		public void HomePageTitleTest () {
			String Title = homepage.validatehomePageTitle();
			Assert.assertEquals(Title, "current weather and forecast - OpenWeatherMap");
			System.out.println(Title);
			}
		
		@Test (priority= 2)
		public void HomePageLogoTest () {
			Boolean flag = homepage.validatehomePageLogo();
	        Assert.assertTrue(flag);
		}
				
		@Test (priority= 7)
		public void HomePageText1 () {
			Boolean text1 = homepage.validatehomePageText1();
			Assert.assertEquals(text1, "We Deliver 2 Billion Forecasts Per Day");
			System.out.println(text1);
		}
		
		@Test(priority= 6)
		public void HomePageText2 () {
			Boolean text2 = homepage.validatehomePageText2();
			Assert.assertEquals(text2, "Current weather and forecasts in your city");
			System.out.println(text2);
		}
		
		@Test (priority= 4)
		public void SignInbtn () {
			Boolean flag = homepage.validateSingInbtn();
	        Assert.assertTrue(flag);
		}
		
		@Test (priority= 5)
		public void SignUpbtn () {
			Boolean flag = homepage.validateSignUpbtn();
	        Assert.assertTrue(flag);
		}
		
		@Test (priority= 3)
		public void CurrentLocationLink () {
			Boolean flag = homepage.validateLinkCurrentLocation();
	        Assert.assertTrue(flag);
		}	
		
		@AfterMethod
		public void tearDown (){
			driver.quit();
	 }
}


