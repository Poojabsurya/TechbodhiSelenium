package AlertInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedAlertExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
	
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(al.getText());
		//al.accept();
		al.dismiss();
		Thread.sleep(5000);
		
	}

}
