package javaScriptExecutorTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	     //Horizantai
	     js.executeScript("window.scrollBy(500,0)");
	     //go till last
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     Thread.sleep(1000);
	     //Enter text
	     js.executeScript("document.getElementById('enterText').value='raj';");
	     //Refresh     
	     js.executeScript("history.go(0)");
	     js.executeScript("location.reload()");
	     
	     // size
	     System.out.println(js.executeScript("return window.innerHeight;"));
	     System.out.println(js.executeScript("return window.innerWidth;"));
		
	}

}
