package openweather;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utill.BasePage;

public class LoginPageTest extends BasePage {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test
	public void login() throws IOException{
		
		homePage= loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
			
	}	
		
	@AfterMethod
		public void teardown (){
		driver.quit();
		
	}
	
	
}
