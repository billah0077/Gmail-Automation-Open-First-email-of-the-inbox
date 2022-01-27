package Login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mustakim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();

		
		driver.get("https://accounts.google.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
		driver.findElement(By.id("identifierId")).sendKeys("Email Name");; //please enter email name
		
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();;
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.name("password")).sendKeys("password");; //please enter password
		
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/span")).click();;
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


		List<WebElement> mail = driver.findElements(By.xpath("//*[@class='yW']/span"));

		System.out.println("Total No. of Mails: " + mail.size());

		//logic

		for(int i=0;i<mail.size();i++){

		System.out.println(mail.get(i).getText());

		}

		mail.get(0).click();

		Thread.sleep(3000);

		driver.close();
		
	}

}


