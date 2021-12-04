package MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMytripExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("(//span[@class='false chNavText darkGreyText'])[6]")).click();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		driver.findElement(By.xpath("(//span[@class='sr_city blackText'])[1]")).click();
		
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();;
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-1-item-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Jan 11 2022']")).click();
		
		
	}

}

