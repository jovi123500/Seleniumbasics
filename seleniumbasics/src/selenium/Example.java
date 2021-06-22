package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://project.phpwebsites.in/grocery2/admin/");
		String actualPageTitle=driver.getTitle();
		//System.out.println("actual page title="+actualPageTitle);
		String actualUrl=driver.getCurrentUrl();
		//System.out.println("actual url="+actualUrl);
		String actualPageSource=driver.getPageSource();
		//System.out.println(actualPageSource);
		
		WebElement username=driver.findElement(By.name("username"));//webelement
		WebElement password=driver.findElement(By.name("password"));
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button"));
		
		username.sendKeys("exam999");
		//Thread.sleep(3000);
		//username.clear();
		password.sendKeys("12345");
		//signin.click();
		String typeattrribute=username.getAttribute("type");
		//System.out.println(typeattrribute);
		String typeattrributes=password.getAttribute("type");
		//System.out.println(typeattrributes);
		String tagnme=username.getTagName();
		//System.out.println(tagnme);
		
		
		
		String sig=signin.getAttribute("value");
		System.out.println(sig);
		//driver.close();
	
	}
	

	}


