package BrowserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaFireFoxInvoke {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Files\\Mozilla Firefox Invoke\\geckodriver-v0.21.0-win64 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.close();
		
	}

}
