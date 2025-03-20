package Selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class brokenLink {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://deadlinkcity.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no of links size"+links.size());
		for(WebElement link:links) {
			String hrefattributeValue=link.getAttribute("href");
			if(hrefattributeValue==null ||hrefattributeValue.isEmpty()) {
				System.out.println("href attribute value is null or empty so not possible to check");
				continue;
			}
			URL linkurl=new URL(hrefattributeValue);
			HttpURLConnection conn= (HttpURLConnection) linkurl.openConnection();
		}
		

	}

}
