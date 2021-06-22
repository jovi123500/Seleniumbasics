package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumbasic 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\seleniumfiles\\driverfiles\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/");
		String actualPageTitle=driver.getTitle();
		System.out.println("actual page title="+actualPageTitle);
		String actualUrl=driver.getCurrentUrl();
		//System.out.println("actual url="+actualUrl);
		String actualPageSource=driver.getPageSource();
		//System.out.println(actualPageSource);
		
		WebElement username=driver.findElement(By.name("userName"));//webelement
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		username.sendKeys("test123");
		//Thread.sleep(3000);
		//username.clear();
		//password.sendKeys("12345");
		//submit.click();
		String typeattrribute=username.getAttribute("type");
		//System.out.println(typeattrribute);
		String tagnme=username.getTagName();
		//System.out.println(tagnme);
		
		WebElement user=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font"));
		String label= user.getText();
		//System.out.println(label);
		
		//String sub=submit.getAttribute("value");
		//System.out.println(sub);
		//driver.close();
	
	}
	

}
