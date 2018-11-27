
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "../chromedriver");  //to interact with browser driver
//		ChromeDriver driver= new ChromeDriver();  //--> this class is in diff package,i need to import it
//		driver.get("https://www.amazon.com/");    //--> error because we dont have browser driver // first need to interact with browser driver which I did in the first line

		
		System.setProperty("webdriver.gecko.driver","../geckodriver");
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("https://www.amazon.com/");
		
		
		
	}

}


//System.setProperty("webdriver.chrome.driver","/Users⁩/kadriyetice⁩/Selenium/chromedriver"⁩);  --> doesnt work