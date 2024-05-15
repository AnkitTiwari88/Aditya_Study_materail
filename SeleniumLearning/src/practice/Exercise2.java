package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Exercise2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :" + driver.getCurrentUrl());
		
		Thread.sleep(6000);
		
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :" + driver.getCurrentUrl());
		
		Thread.sleep(6000);
		
		
		driver.navigate().to("https://mail.google.com/");
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :" + driver.getCurrentUrl());

		
		Thread.sleep(6000);
		driver.navigate().back();
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :" + driver.getCurrentUrl());

		
		
		Thread.sleep(6000);
		driver.navigate().back();
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :" + driver.getCurrentUrl());

		
		Thread.sleep(6000);
		driver.navigate().forward();
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :" + driver.getCurrentUrl());

		
		Thread.sleep(6000);
		driver.navigate().forward();
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :" + driver.getCurrentUrl());
		
		
	}

}
