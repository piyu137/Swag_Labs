package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Login_Page {
	WebDriver driver;
	
	public  Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	@BeforeTest
	
	public void LaunchBrowser() {
		
	//Verify Logo
	WebElement Logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
	boolean Applogo=Logo.isDisplayed();
	System.out.println(Logo.getText()+ "  "+Applogo);
	
	//Verify Username option
	WebElement Username=driver.findElement(By.id("user-name"));
	boolean UserEntry=Username.isDisplayed();
	System.out.println(Username.getText()+ "  "+UserEntry);

	//Verify Password option
	WebElement Password= driver.findElement(By.id("password"));
	boolean PassEntry=Password.isDisplayed();
	System.out.println(Password.getText()+ "  "+PassEntry);
	
	//Verify Login Button
	WebElement Login=driver.findElement(By.xpath("//input[@type='submit'][1]"));
	boolean LoginBtn=Login.isDisplayed();
	System.out.println(Login.getText()+ "  "+LoginBtn);
	}
  @Test
  public void Login() {
	  //Enter username and Password
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  }
  @AfterTest
  public void Submit() throws InterruptedException {
	  //Login
	  driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
	  Thread.sleep(1000);
	  System.out.println("_____Logged in Successfully_____");
  }
}
