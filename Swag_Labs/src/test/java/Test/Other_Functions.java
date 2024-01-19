package Test;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Other_Functions {
	WebDriver driver;
	public Other_Functions(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public void Filters_menu() throws InterruptedException {
		Select s=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		s.selectByValue("hilo");
		System.out.println("Filter Applied: High to Low");
		
		
		
	}
	public void Options_menu() throws InterruptedException {
		WebElement OptionsMenu=driver.findElement(By.xpath("//div[@class='bm-burger-button']/child::button"));
		System.out.println(OptionsMenu.getText()+"    "+OptionsMenu.isDisplayed());
		OptionsMenu.click();
		
		List<WebElement>Menu=driver.findElements(By.xpath("//div[@class='bm-menu']/child::nav/a"));
		for(WebElement List: Menu)	{
			System.out.println("Menu List:  "+List.getText());
		}
		
	    WebElement AllItems=driver.findElement(By.xpath("//div[@class='bm-menu']/child::nav/a[1]"));
	    System.out.println("All Items: "+AllItems.isDisplayed());
	    AllItems.click();
	    
	    WebElement About=driver.findElement(By.xpath("//div[@class='bm-menu']/child::nav/a[1]"));
	    System.out.println("About: "+ About.isDisplayed());
	    About.click();
	    Thread.sleep(4000);
	    System.out.println(driver.getCurrentUrl());
	    driver.navigate().back();
	    
	    WebElement ResetAppSet=driver.findElement(By.xpath("//div[@class='bm-menu']/child::nav/a[1]"));
	    System.out.println("ResetAppSet: "+ResetAppSet.isDisplayed());
	    ResetAppSet.click();
	    
	    WebElement Logout=driver.findElement(By.xpath("//div[@class='bm-menu']/child::nav/a[1]"));
	    System.out.println("Logout: "+Logout.isDisplayed());
	    Logout.click();
	    System.out.println("*******Successfully Logged Out********");
	
	}
}
