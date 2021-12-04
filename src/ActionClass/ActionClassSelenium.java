package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("https://www.browserstack.com/");
		Actions as = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
				as.moveToElement(element).build().perform();
				//to perform mouse operations use above method
	}

}
