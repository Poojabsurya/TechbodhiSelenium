package BrowserCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//till above code ur browser will open but to open page u want use below command .get
		
		//command to get url 
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		//command to take title of page
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		
		//command to take current url
		String PageCurrentUrl=driver.getCurrentUrl();
		System.out.println(PageCurrentUrl);
		
		driver.findElement((By.xpath("//button[text()='New Browser Tab']"))).click();
		//driver.close(); // this will close current tab
		driver.quit(); //it will close all tabs
		
	}
}
