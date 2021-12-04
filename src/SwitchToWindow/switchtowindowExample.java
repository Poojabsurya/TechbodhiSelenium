package SwitchToWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtowindowExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("win1")).click();
		
		//get handles of the window
	String mainwindowhandle = driver.getWindowHandle();
	System.out.println(mainwindowhandle);
	Set <String> allwindowhandles = driver.getWindowHandles();
	System.out.println(allwindowhandles);	
	Iterator <String> iterator =allwindowhandles.iterator();
	while(iterator.hasNext())
	{
		String child_window=iterator.next();
		if(!mainwindowhandle.equals(child_window))
		{
			driver.switchTo().window(child_window);
			System.out.println(driver.switchTo().window(child_window).getTitle());
			driver.close();
		}
		
	}
	
	
	}

}
