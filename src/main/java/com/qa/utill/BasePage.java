package com.qa.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {
	
	public static WebDriver driver ;
	public static Properties prop ;

	public BasePage() {
			try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\Selenium Code\\New Eclipse\\eclipse\\openweather"
					+ "\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization () {
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(); // launch chromedriver 				
		}
		else if (browsername.equalsIgnoreCase("FF")) {
			WebDriverManager.chromedriver().setup();
			driver= new FirefoxDriver(); // launch firefox
		}

		else if (browsername.equalsIgnoreCase("Edge")) {
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver(); // launch firefox
		}

       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
       
       driver.get(prop.getProperty("url"));
	}

}