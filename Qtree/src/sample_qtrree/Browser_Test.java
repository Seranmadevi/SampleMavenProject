
//Launch Browser
package sample_qtrree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		//D:\\Drivers\\chromedriver.exe
		ChromeDriver driver=new ChromeDriver();
		String url="https://www.google.com";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("hello");
		//driver.close();
		///html/body/div[8]/div/div[8]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a
		
		

	}

}
