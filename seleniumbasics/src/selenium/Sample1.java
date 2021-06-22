package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Sample1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "E:\\seleniumfiles\\driverfiles\\edgedriver_win32\\edgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		

	}

}
