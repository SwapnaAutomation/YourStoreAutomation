package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/executables/chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://demo.opencart.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();
	}

}
