package main;

import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectSearchForColleges {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of browser:");
		String browser = sc.nextLine();
		
		// Declaring Web Driver
		WebDriver driver;
		
		//Initializing Web Browser
		if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SearchForColleges\\Browser\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\2317550\\eclipse-workspace\\SearchForColleges\\Browser\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Choose from available browser");
			return;
		}
		
		
		//Opening the web page
		driver.manage().window().maximize();
		driver.get("https://www.eduvidya.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(browser.equalsIgnoreCase("Edge")) {			
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.linkText("Continue to www.eduvidya.com (unsafe)")).click();
		}
	
		
		try{
		    driver.findElement(By.id("dismiss-button")).click();
		    
		}
		catch(Exception e){
			
		}
		
		//Click on "Colleges" link in the Navigation bar
		
		driver.findElement(By.linkText("Colleges")).click();
		
		WebElement course = driver.findElement(By.id("ddl_Category"));
		
		Thread.sleep(5000);
		//Click on "Course" dropdown and select a course (ex: Science)
		
		Select selCourse = new Select(course);
		
		selCourse.selectByVisibleText("Science");
		
		Thread.sleep(3000);
		
		//Click on "City" dropdown and select “Chennai” as city
		
		WebElement city = driver.findElement(By.id("ddl_City"));
		Select selCity = new Select(city);
		
		selCity.selectByValue("7");
		
		
		Thread.sleep(3000);
		
		//Click on "Search" button
		
		driver.findElement(By.id("btnSearch")).click();
		
		Thread.sleep(3000);
		
		WebElement ListOfCollege= driver.findElement(By.className("contentblock"));
		
		List<WebElement> collegeList = driver.findElements(By.className("contentblock"));
		for(WebElement el : collegeList)
		{
			System.out.println(el.getText());
			System.out.println();
		}
		System.out.print(collegeList.size());
		
		if(ListOfCollege.isDisplayed()) {
			System.out.println(" Search results are displayed.");
		}
		else {
			System.out.println("Search results are not displayed!");
		}
		
		
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.quit();
		

	}

}
