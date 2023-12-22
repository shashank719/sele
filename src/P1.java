import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();
		WebElement move=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
		Actions a = new Actions(driver);
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(2000);
		
		
		
		/*
		 * driver.findElement(By.id("denyBtn")).click(); WebElement e =
		 * driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[3]/a"
		 * )); Actions a = new Actions(driver) ; a.moveToElement(e).build().perform();
		 */
	  driver.close();
	}

}
