package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_GoogleSearch {
	
//	public static void main(String[] args) {
//		googleSearch();
//	}
	
	@Test
	public static void googleSearch() {
		//
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://www.google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		//click on search button
//		//driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
//		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
	}

}
