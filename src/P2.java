import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2 {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement  w = d.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions a = new Actions(d);
		a.contextClick(w).perform();
	}

}
