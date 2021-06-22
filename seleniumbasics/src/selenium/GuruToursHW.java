package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruToursHW
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		WebElement register=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		        register.click();
		        WebElement firstname=driver.findElement(By.name("firstName"));
		        firstname.sendKeys("Ram");
		        WebElement lastname=driver.findElement(By.name("lastName"));
		        lastname.sendKeys("daniel");
		        WebElement phoneno=driver.findElement(By.name("phone"));
		        phoneno.sendKeys("987654");
		        WebElement email=driver.findElement(By.id("userName"));
		        email.sendKeys("ram4@gmail.com");
		        WebElement address=driver.findElement(By.name("address1"));
		        address.sendKeys("88");
		        WebElement cityin=driver.findElement(By.name("city"));
		        cityin.sendKeys("trivandrum");
		        WebElement statein=driver.findElement(By.name("state"));
		        statein.sendKeys("kerala");
		        WebElement pcode=driver.findElement(By.name("postalCode"));
		        pcode.sendKeys("698765");
		        WebElement userName=driver.findElement(By.id("email"));
		        userName.sendKeys("hiii");
		        WebElement password=driver.findElement(By.name("password"));
		        password.sendKeys("12345");
		        WebElement confmPassword=driver.findElement(By.name("confirmPassword"));
		        confmPassword.sendKeys("12345");
		        WebElement submit=driver.findElement(By.name("submit"));
		        submit.click();
		       
		       
		       
	}

}
