package com.opensource.qa;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class AdminTestCases {
	// Instancias de objeto
	String username, password, msgNoRecords, userNotExist, newEmployee, newUser, newpassword;

	
	@BeforeTest
	  public void beforeTest() {
		// Test Data
		username = "Admin";
		password = "admin123";
		userNotExist = "XYZ";
		msgNoRecords = "No Records Found";
		newEmployee = "Admin A";
		newUser = "CarlosHeredia";
		newpassword = "password";

	  }
	
	
  @Test
  public void  tc001AdminSearchEmployee() {
	// Step 1
			Reporter.log("Open Browser \"OrangeHRM\" web page");
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();

			// Step 2
			Reporter.log("Enter Username, Password and click Login");
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();

			// Step 3
			Reporter.log("Validate that you have logged in successfully");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

			// Step 4
			Reporter.log("Click Admin - Go to the admin page");
			driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			// Step 5
			Reporter.log("Search username in field \"Username\"");
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);

			// Step 6
			Reporter.log("Click Search");
			driver.findElement(By.id("searchBtn")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			// Seleccionar un campo obligatorio

			// Step 7
			Reporter.log("Verify username exist in table");
			String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
			Assert.assertEquals(actualValue, username);

			// Step 8
			Reporter.log("Log out");
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			// Step 9
			Reporter.log("Close Browser");
			driver.close();

  }
  
  @Test
	public void tc002AdminSearchEmployeeNotExist() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(userNotExist);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7
		Reporter.log("Verify username exist in table");

		// AssertEquals
		String actualValue = driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(actualValue, msgNoRecords);

		// AssertTrue
		boolean isDisplayed = driver.findElement(By.xpath("//*[text()='" + msgNoRecords + "']")).isDisplayed();
		Assert.assertTrue(isDisplayed);

		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 9
		Reporter.log("Close Browser");
		driver.close();

	}

	@Test
	public void tc003AdminAddNewUser() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add Button");
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 6
		Reporter.log("Enter a Valid Employee Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(newEmployee);

		// Step 7
		Reporter.log("Enter a Valid User Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys(newUser);

		// Step 8
		Reporter.log("Enter new password ");
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys(newpassword);

		// Step 9
		Reporter.log("Enter  confirm password ");
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys(newpassword);

		// Step10
		Reporter.log("Click Save");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

		// Step 11
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newEmployee);

		// Step 12
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 13
		Reporter.log("Verify username exist in table");

		// AssertEquals
		String actualValue = driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(actualValue, msgNoRecords);

		// Step 14
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();

	}

  @Test
  public void tc004AdminDeleteUser() {
	// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
	//Step 2
		Reporter.log("Enter username, password and login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
	//Step 3
		Reporter.log("Validate logged in successfully");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		
	//Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	//Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);

	//Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	//Step 7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, newUser);

	//Step 8
		Reporter.log("Select User");
		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[1]")).click();
		
	//Step 9 
		Reporter.log("Click delete");
		driver.findElement(By.xpath("//*[@id=\"btnDelete\"]")).click();
	
		
	//Step 10
		Reporter.log("Validate pop-window is displayed: \"Delete Records?\"");
		String alert = driver.switchTo().alert().getText();
		//String msgDelete = driver.findElement(By.xpath("//*[@id=\"deleteConfModal\"]/div[2]/p")).getText();
		Assert.assertEquals(alert, "Delete records?");
	//Step 11
		Reporter.log("Click Ok to confirm delete user");
		driver.findElement(By.xpath("//*[@id=\"dialogDeleteBtn\"]"));

		
	//Step 12
		Reporter.log("Validate in table that user was delete successfully");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualValue1 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue1, msgNoRecords);
		
	//Step 13
		Reporter.log("Log out");
		
	//Step 14
		Reporter.log("Close browser");
		
		
  }

  @AfterTest
  public void afterTest() {
  }

}
