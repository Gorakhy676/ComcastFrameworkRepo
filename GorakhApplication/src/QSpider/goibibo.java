package QSpider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gbraid=0AAAAADrlxCe0YIIaA-1bMn8n6WQLRZ6nV&gclid=Cj0KCQjww-HABhCGARIsALLO6XzaHZwJX3MziX9mBcAxCmPG7uK1Ot7yQPYMe8PRZRqV2QX39Ci1GpoaAvTXEALw_wcB");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("lko");
		
	}

}
