package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("rajkumar@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");

		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://twitter.com/?lang=en");
		driver.navigate().refresh();
		
		String ab = driver.getTitle();
		System.out.println(ab);

		driver.close();

	}

}
