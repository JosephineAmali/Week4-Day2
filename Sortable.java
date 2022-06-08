package Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--default-notifications");
		
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		
		WebElement findElement1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement findElement7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(findElement7, findElement1).perform();
		
		
		
		
				

	}

}
