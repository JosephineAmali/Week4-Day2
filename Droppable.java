package Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--default-notifications");
		
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		WebElement dragEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropEle = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragEle, dropEle).perform();
	}

}
