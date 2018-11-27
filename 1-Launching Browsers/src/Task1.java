import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver","../chromedriver");
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.amazon.com/");
		
		d1.close();
		d1.quit();
		
		
		System.setProperty("webdriver.gecko.driver", "../geckodriver");
		FirefoxDriver d2=new FirefoxDriver();
		d2.get("https://www.bestbuy.com/");
		
		d2.close();
		d2.quit();
		
	}

}
