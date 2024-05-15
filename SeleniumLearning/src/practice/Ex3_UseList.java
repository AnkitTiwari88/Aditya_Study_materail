package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_UseList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2317550\\eclipse-workspace\\SeleniumLearning\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.roboform.com/filling-test-all-fields");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("01___title")).sendKeys("Dhruv Goat");
		
		driver.findElement(By.name("02frstname")).sendKeys("Dhruv");
		driver.findElement(By.name("03middle_i")).sendKeys("C");
		driver.findElement(By.name("04lastname")).sendKeys("Totre");
		driver.findElement(By.name("04fullname")).sendKeys("Dhruv C");
//		driver.findElement(By.xpath("/html/body/div[2]/form/p/input")).click();
//		driver.findElement(By.name("")).sendKeys("");
		WebElement card=driver.findElement(By.name("40cc__type"));
		Select selCard = new Select(card);
		Thread.sleep(5000);
		selCard.selectByVisibleText("American Express");
		
	}

}
