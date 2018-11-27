import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abcnews.go.com/");
		driver.manage().window().maximize();
		
		WebElement box=driver.findElement(By.cssSelector("#row-1 ul.headlines-ul"));
		List<WebElement> links=box.findElements(By.tagName("li"));
		
		for(int i=0;i<links.size();i++) {
			links.get(i).click();
			driver.navigate().back();
			box=driver.findElement(By.cssSelector("#row-1 ul.headlines-ul"));
			links=box.findElements(By.tagName("li"));
			
			
		}
		
		driver.close();
		driver.quit();
	}

}
