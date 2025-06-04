package LearningDataDriven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromPropertyFile {
	static String path="./src/main/resources/Data.properties";
	static WebDriver driver;
	public static void main(String[]args) throws IOException {
		String browser=FileUtility.getDataFromProperty(path, "browser");
		String url=FileUtility.getDataFromProperty(path, "url");
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
				
		
		
	}

}
