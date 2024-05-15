package practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser name:");
		String a = sc.nextLine();
		WebDriver driver;
		
		if(a.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(a.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else {
			System.out.println("OOPS! we don't have that browser.");
			return;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
	}

}
