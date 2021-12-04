package dropdownAndMultiselect;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Select oselect=new Select(driver.findElement(By.xpath("//select[@name='selenium_suite']")));
	
		oselect.selectByIndex(1);
		oselect.selectByIndex(2);
		
		List <WebElement> ElementCount=oselect.getOptions();
		
		for(int i=0;i<ElementCount.size()-1;i++)
		{
			System.out.println(ElementCount.get(i).getText());
				
		}
	}

}
