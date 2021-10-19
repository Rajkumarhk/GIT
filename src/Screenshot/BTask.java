package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsCopyToFileTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BTask {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("rajkumar");
		System.out.println(username);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		System.out.println(password);
		
		WebElement findElement = driver.findElement(By.name("login"));
		findElement.click();
		
		
		TakesScreenshot ts  = (TakesScreenshot) driver ; 
		
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\TEST\\Desktop\\New folder\\Selenium\\Screenshot\\fb.png");
		
		FileUtils.copyFile(s, d);
		
	}

}
