package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoWebShopRegister
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//WebElement register=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		//String regtxt=register.getText();
		//System.out.println(regtxt);
		WebElement registerButton=driver.findElement(By.linkText("Register"));
		registerButton.click();
		//WebElement maletxt=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/label"));
		//String maletext=maletxt.getText();
		//System.out.println(maletext);
		//WebElement femaletxt=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label"));
		//String femaletext=femaletxt.getText();
		//System.out.println(femaletext);
		
		/*List<WebElement> gender=driver.findElements(By.xpath("//label[@class='forcheckbox']"));
		for(int i=0;i<gender.size();i++)
		{
			String value=gender.get(i).getText();
			System.out.println(value);
		}*/
		
		
		
		
		
		//WebElement female=driver.findElement(By.id("gender-female"));
		//female.click();
		//boolean fselect=female.isSelected();
		//System.out.println(fselect);
		
		
		//WebElement searchButton = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
		//searchButton.click();
		//boolean fenable=searchButton.isEnabled();
		//System.out.println(fenable);
		
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
		searchButton.click();
		boolean fdisplay=searchButton.isDisplayed();
		System.out.println(fdisplay);
		
		
		
		/*WebElement firstName=driver.findElement(By.id("FirstName"));
		firstName.sendKeys("ju");
		WebElement lastName=driver.findElement(By.id("LastName"));
		lastName.sendKeys("hihe");
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("hehi@gmail.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("jijiji");
		WebElement confmpassword=driver.findElement(By.id("ConfirmPassword"));
		confmpassword.sendKeys("jijiji");
		WebElement submit=driver.findElement(By.id("register-button"));
		String regtxt=submit.getAttribute("Value");
		System.out.println(regtxt);
		submit.click();*/


	}

}
