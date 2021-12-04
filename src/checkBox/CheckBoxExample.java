package checkBox;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("http://omayo.blogspot.com/");
		//for checkbox take comman name .0
		List <WebElement> TotalCheckbox=driver.findElements(By.name("accessories"));
		for(int i=0;i<=TotalCheckbox.size()-1;i++)
		{
			System.out.println(TotalCheckbox.get(i).getAttribute("value"));
			TotalCheckbox.get(i).click();
		}
		
	}

}
