package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bpractise {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		//it takes time to load the instagram page, using thread we pause the coding for some milli seconds
		//after typing thread.sleep, throw interruptedexception to main method (automatic,click with the mouse)
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("rajkumar@gmail.com");
		
		
	}

}
