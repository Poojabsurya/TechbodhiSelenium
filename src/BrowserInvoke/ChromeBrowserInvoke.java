package BrowserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInvoke {

	public static void main(String[] args)
	{
		//without below line broswer cannot be invoke
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.google.co.in/");
	}
}
