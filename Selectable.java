package Week4;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--default-notifications");
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		WebElement findElement1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement findElement4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement findElement7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL)
		.click(findElement1)
		.click(findElement4)
		.click(findElement7)
		.perform();

	}

}
