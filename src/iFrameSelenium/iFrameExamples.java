package iFrameSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameExamples {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.switchTo().frame(driver.findElement(By.name("iframe_a")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Jobs in India']//following::a[1]")).click();
		 driver.switchTo().defaultContent();
		List<WebElement> iframeElements= driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are:  " +iframeElements.size());
		
	}

}
