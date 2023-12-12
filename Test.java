package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		String baseUrl="https://www.snatchjobs.id";
		driver.get(baseUrl);
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='other']/div/div/div/div[4]/a[1]")).click();
	     driver.findElement(By.cssSelector("header.header-wrap.header-white:nth-child(3) div.container div.header-block div.display-flex.align-center div.header-action-block > "
	     		+ "a.black-btn.hide-on-mobile.reset-lead-login")).click();
	     Thread.sleep(1000);
		
	}

}
