package SBI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	static WebDriver driver;
	static Properties or = null;
	
	public static void clickToLogin() throws IOException {
		
		try {
		
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(or.getProperty("btnClickToContinue")))));
			
			driver.findElement(By.xpath(or.getProperty("btnClickToContinue"))).click();
		}catch(Exception e) {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File desFile = new File("C:\\Users\\hp\\eclipse-workspace\\OnlineBachFour\\src\\screeenshots\\"+now()+".png");
			FileUtils.copyFile(srcFile, desFile);
		}
	}
	
	private static String now() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void enterUserName() throws InterruptedException {
		driver.findElement(By.xpath(or.getProperty("txtUserName"))).click();
		//driver.findElement(By.xpath("//*[@id='username']")).click();
		////Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("username");
		driver.findElement(By.xpath(or.getProperty("txtUserName"))).sendKeys("username");
	}
	
	public static void enterPassword() throws InterruptedException {
		driver.findElement(By.name("password")).click();
		//Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("password");
	}
	
	public static void selectVirtualKeyyboard() {
		
		if(true == driver.findElement(By.xpath("//*[@id='chkbox']")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id='chkbox']")).click();
			
			/*if(true == driver.findElement(By.id("//*[@id='keypad']")).isDisplayed()) {
				System.out.println("Virtual Keyboard Visible");
			}*/
		}
	}
	
	public static void selectAudioOption() throws InterruptedException {
		
		if(true == driver.findElement(By.xpath("(//*[@id='capOption'])[1]")).isSelected()) {
			//Thread.sleep(1000);
			if(true == driver.findElement(By.xpath("(//*[@id='capOption'])[2]")).isEnabled()) {
			
				driver.findElement(By.xpath("(//*[@id='capOption'])[2]")).click();
			}
			
		}else {
			System.out.println("not selected");
		}
	}
	
	public static void ClickOnSubmit() {
		driver.findElement(By.xpath("//*[@id='Button2']")).click();
	}
	
	public static void ClickOnForgotLoginPassword() {
		driver.findElement(By.xpath("//*[@id=\"login_fields\"]/div[1]/div[2]/ul/li[2]/a")).click();
	}
	
	public static void SelectForgotPasswordReason() {
	  
	  Select select = new Select(driver.findElement(By.xpath("//*[@id=\"com_container\"]/div[3]/div/div/select")));
	  //select.selectByValue("ForgotUsername");
	  //select.selectByVisibleText("Forgot Username");
	  select.selectByIndex(1);
	}
	
	public static void ClickOnNewUser() {
		driver.findElement(By.xpath("//*[@id=\"login_fields\"]/div[1]/div[2]/ul/li[1]/a")).click();
	}
	
	public static void SelectActivationValue() {
		  
		  Select select = new Select(driver.findElement(By.xpath("//select[@name='issueCode']")));
		  //select.selectByValue("registerHere");
		  select.selectByVisibleText("Activation Of Username");
		  //select.selectByIndex(1);
		}
	
	public static void ClickOnNext() {
		driver.findElement(By.xpath("//*[@id=\"nextStep\"]")).click();
	}
	
	public static void SendTempUserName() {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"tempUserName\"]"))));
		
		driver.findElement(By.xpath("//*[@id=\"tempUserName\"]")).sendKeys("temp user");
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "W:\\chromedriver.exe");
		//open browser
		 driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		or = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\OnlineBachFour\\src\\SBI\\OR.properties");		
		or.load(fis);
		
		//navigate any url
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		
		
		 //driver.navigate().to("https://www.google.com/");
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//back
		driver.navigate().back();
		//forward
		driver.navigate().forward();
		
		String strPageSource = driver.getPageSource();
		System.out.println("============================");
		//System.out.println(strPageSource);
		
		//System.out.println(driver.getTitle());
		
		//driver.close();*/
		
		clickToLogin();
		//Thread.sleep(2000);
		
		/*enterUserName();
		//Thread.sleep(2000);
		
		enterPassword();
		//Thread.sleep(2000);
		
		selectVirtualKeyyboard();
		//Thread.sleep(2000);
		
		selectAudioOption();
		//Thread.sleep(2000);
		
		ClickOnSubmit();
		//Thread.sleep(2000);*/
		
		
		/*
		ClickOnForgotLoginPassword();
		//Thread.sleep(2000);
		
		String oldWindowId = driver.getWindowHandle();
		
		Set<String> windowids = driver.getWindowHandles();
		
		for (String windowid : windowids) {
			
			if(false == windowid.equalsIgnoreCase(oldWindowId)) {
				driver.switchTo().window(windowid);
			}
		}
		
		SelectForgotPasswordReason();
		//Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(oldWindowId);
		
		enterUserName();
		//Thread.sleep(2000);*/
		
		ClickOnNewUser();
		//Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		//alert.dismiss();
		alert.accept();
		
		//Thread.sleep(2000);
		
		String oldWindowId = driver.getWindowHandle();
		
		Set<String> windowids = driver.getWindowHandles();
		
		for (String windowid : windowids) {
			
			if(false == windowid.equalsIgnoreCase(oldWindowId)) {
				driver.switchTo().window(windowid);
			}
		}
		
		SelectActivationValue();
		ClickOnNext();
		SendTempUserName();
		
		driver.close();
		driver.switchTo().window(oldWindowId);
		
		//Thread.sleep(2000);
		driver.quit();
	}
}
