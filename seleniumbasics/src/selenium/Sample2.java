package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\seleniumfiles\\driverfiles\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

	}

}
