package com.opensource.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType.ForSeleniumServer;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Ejercicio1 {
	public static WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  
	  Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesión o regístrate");
	  
	
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
