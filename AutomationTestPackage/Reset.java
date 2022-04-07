package AutomationTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reset {
	

	private static Object Assert;
	public static void main(String[] args) {
		
		String ExpectedTitle="News | NSW Government";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jayavas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nsw.gov.au/news");
		driver.manage().window().maximize();
		
		String ActualTitle=driver.getTitle();
		System.out.println("The Title of the Application is: "+ActualTitle);
	//	Assert.assertEquals(ActualTitle, ExpectedTitle);
	
	WebElement button= driver.findElement(By.className("search-filter__toggle"));
		button.click();

		WebElement checkbox1= driver.findElement(By.id("edit-field-topic-target-id-21"));
		checkbox1.click();

		WebElement checkbox2= driver.findElement(By.id("edit-field-topic-target-id-14"));
		checkbox2.click();

		driver.findElement(By.className("search-filter__toggle")).click();

		WebElement reset= driver.findElement(By.className("edit-reset"));
		reset.click();
		//Verify after reset shows back all news articles
		webElement Results = driver.findElement(By.xpath("//div[@class='search-grid__info' and contains(text(), 'Showing 12 of 1505 news articles')]);
		
		
		driver.quit();

	}
}

