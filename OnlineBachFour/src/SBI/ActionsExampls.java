package SBI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExampls {
	
    static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "W:\\chromedriver.exe");
		//open browser
		 driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate any url
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
		
		Actions a = new Actions(driver);
		
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"))).perform();
		//Thread.sleep(5000);
		//a.contextClick(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"))).perform();
		
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"))).contextClick().build().perform();
		
		//a.doubleClick(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"))).perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"))).doubleClick().build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.CONTROL).sendKeys("mobile").build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
