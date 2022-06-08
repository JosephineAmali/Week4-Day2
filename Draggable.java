package Week4;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--default-notifications");
		
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		WebElement frameEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		int x= frameEle.getLocation().getX();
		int y= frameEle.getLocation().getY();
		System.out.println(x+"and"+y);
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(frameEle, 800, 400).perform();
		

	}

}
