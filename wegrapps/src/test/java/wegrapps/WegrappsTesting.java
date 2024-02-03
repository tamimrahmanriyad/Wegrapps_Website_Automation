package wegrapps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WegrappsTesting {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver Initialization
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://wegrapps.com/");
		driver.manage().window().maximize();
		
		//URL Check
		
		String ExpectedURL = "https://wegrapps.com/";
		String ActualURL=driver.getCurrentUrl();
		System.out.println("ActualURL : " + ActualURL);
		
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("URL match");	
		}
		else {
			System.out.println("URL doesn't match");
		}
		
		//Title Check
		
		String ExpectedTitle = "WEGRAPPS";
		String ActualTitle=driver.getTitle();
		System.out.println("ActualTitle : " + ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title match");
		}
		else {
			System.out.println("Title doesn't match");
		}
		
		driver.findElement(By.id("contact"));
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Tamim Rahman Riyad");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("subject")).sendKeys("POS Software");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@data-msg=\"Please write something for us\"]")).sendKeys("Hello, I need a POS Software.User Authentication and Access Control,Inventory Management,Sales Processing,Customer Management,Reporting and Analytics,Integration with Other Systems,Multi-Store Support,Security Features,User-Friendly Interface,Customization and Scalability,Technical Support and Updates.");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"button button-a button-big button-rouded\"]")).click();  
		
		driver.quit();
		
	}

}
