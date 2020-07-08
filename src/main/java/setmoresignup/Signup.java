package setmoresignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		driver.get("https://my.setmore.com/logout.do");
		System.out.println("Landed to Setmore Login page");
		driver.findElement(By.id("username")).sendKeys("rsakthi1994@gmail.com");
		System.out.println("Passed username");
		driver.findElement(By.id("password")).sendKeys("sakthi27");
		System.out.println("Passed Password");
		driver.findElement(By.id("login-now")).click();
		System.out.println("Logging in ");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@id='account_menu']/a[@class='right_nav_holder-loginid']")).click();
		driver.findElement(By.xpath("//ul[@class='nav-topsub-navigation active-dropdown']//li[@id='sign_out']/a")).click();
		System.out.println("Clicked on Logout");
		Thread.sleep(5000);
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equalsIgnoreCase("https://my.setmore.com/logout.do"))
		{
			System.out.println("Logged out successfully");
		}
		else
		{
			System.out.println("Logout fail");
		}
		
		
		
	}

}
