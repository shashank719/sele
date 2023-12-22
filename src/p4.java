import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p4 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement w = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/div[2]/div[2]/div[4]/div[1]/div/iframe"));
		driver.switchTo().frame(w);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/div[2]/div[2]/div[4]/div[1]/div/iframe")).click();
		driver.findElement(By.className("ytp-watch-later-icon")).click();
		
		
		
		
		
		
		
		JavascriptExecutor j =(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#chat-icon"))));
		WebElement e= driver.findElement(By.id("chat-icon"));
		j.executeScript("arguments[0].click(), e");
		
	}

}
