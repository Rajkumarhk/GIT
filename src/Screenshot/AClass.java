package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AClass {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot t = (TakesScreenshot) driver ;
		
		File s  = t.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\TEST\\Desktop\\New folder\\Selenium\\Screenshot\\amz.png");
		
		//FileUtils.copyFile(s, d);
		
		         //OR
		//filehandler.copy
		
		org.openqa.selenium.io.FileHandler.copy(s, d);
		
	}

}
