package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex2_NavWebsite {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Title of page is: "+ driver.getTitle());
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("abc@gmai.com");
//		
//		WebElement fwd = driver.findElement(By.partialLinkText("Forgotten"));
//		fwd.click();
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title of page:" + driver.getTitle());
		System.out.println("Current url:"+driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Title of page:" + driver.getTitle());
		System.out.println("Current url:"+driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println("Title of page:" + driver.getTitle());
		System.out.println("Current url:"+driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("Title of page:" + driver.getTitle());
		System.out.println("Current url:"+driver.getCurrentUrl());
		
	
		
		
		
		
	}

}
