package InputBoxandButtons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxandButtons {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pooja");
		driver.findElement(By.name("pass")).sendKeys("1256");
		driver.findElement(By.name("login")).click();
		

	}

}
