package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Awebelements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEST\\Desktop\\New folder\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		
		String  a = username.getAttribute("placeholder");
		System.out.println(a);
		username.sendKeys("rajskelly@gmail.com");
		String ab = username.getAttribute("value");
		System.out.println(ab);
		
		username.clear();
		boolean e = username.isDisplayed();
		System.out.println(e);
		
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");
		
		boolean g = password.isEnabled();
		System.out.println(g);
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
	
		
		
		
			
	}

}
