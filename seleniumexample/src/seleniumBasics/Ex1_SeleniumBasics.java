package seleniumBasics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Ex1_SeleniumBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Edge.driver","C:\\Users\\2317550\\eclipse-workspace\\seleniumexample\\Browser\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
	}

}
