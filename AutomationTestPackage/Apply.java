package AutomationTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Apply {
	
	public static void main(String[] args) {
			
			String ExpectedTitle="News | NSW Government";
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jayavas\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.nsw.gov.au/news");
			driver.manage().window().maximize();
			String ActualTitle=driver.getTitle();
			System.out.println("The Title of the Application is: "+ActualTitle);
			Object Assert;
			//Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement button= driver.findElement(By.className("search-filter__toggle"));
		button.click();

		WebElement checkbox1= driver.findElement(By.id("edit-field-topic-target-id-21"));
		By.xpath("//*[@id='edit-field-topic-target-id-21']/*[contains(text(),'\"Transport\")]");
		checkbox1.click();
		//Validating Transport filter applied by Verifying new list item
		WebElement VerifyText= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='nsw-list-item__label"]/*[contains(text(),'\"Transport\")]")));
		
	

		WebElement checkbox2= driver.findElement(By.id("edit-field-topic-target-id-14"));
		By.xpath("//*[@id='edit-field-topic-target-id-14']/*[contains(text(),'\"Tourism\")]");
		checkbox2.click();
			//Validating Tourism filter applied by Verifying new list item
		WebElement VerifyText= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='nsw-list-item__label"]/*[contains(text(),'\"Tourism\")]")));
		
		driver.findElement(By.className("search-filter__toggle")).click();

		driver.quit();

			
		}
}

