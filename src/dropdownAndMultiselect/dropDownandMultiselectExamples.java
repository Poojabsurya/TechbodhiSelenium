package dropdownAndMultiselect;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownandMultiselectExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Files\\BrowserInvoke\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Select oselect=new Select(driver.findElement(By.xpath("//select[@name='languages']")));
		
		oselect.selectByIndex(3);
		Thread.sleep(5000);
		
		oselect.selectByValue("C++");
		Thread.sleep(5000);
		
		oselect.selectByVisibleText("Python");
		
		List <WebElement> elementCount=oselect.getOptions();
		
		for(int i=0;i<elementCount.size()-1;i++)
		{
			System.out.println(elementCount.get(i).getText());
		}
		
	
	}

}
