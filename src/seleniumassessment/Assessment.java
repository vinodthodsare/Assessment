package seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assessment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incoginto");
		driver.get("https://in.bookmyshow.com/explore/home/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.xpath("//*[text()='Bengaluru']"));
		city.click();
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath("//*[text()='Sign in']"));
		signin.click();
		Thread.sleep(2000);
		WebElement contniuewithemail = driver.findElement(By.xpath("//*[text()='Continue with Email']"));
		contniuewithemail.click();
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id='emailId']"));
		textbox.sendKeys("testusersel@yopmail.com");
		Thread.sleep(2000);
		WebElement contniuebutton = driver.findElement(By.xpath("//*[text()='Continue']"));
		contniuebutton.click();
		
		driver.get("https://yopmail.com/");
		Thread.sleep(2000);
		WebElement yopmaibox = driver.findElement(By.xpath("//*[@id='login']"));
		yopmaibox.click();
		yopmaibox.sendKeys("testusersel@yopmail.com");
		
		WebElement Arrowbutton = driver.findElement(By.xpath("//*[@class='material-icons-outlined f36']"));
		Arrowbutton.click();
		
		
	    Actions action = new Actions(driver);
	    WebElement otpfield = driver.findElement(By.xpath("//*[@style='text-decoration: none; color: rgba(51, 51, 51, 1); font-size: 24px; font-weight: 600']"));
        action.doubleClick(otpfield).build().perform();
		
		
	}

}
