package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotFullPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		//explicit type casting
		TakesScreenshot t=(TakesScreenshot)driver;
		
		//use getScreenshotAs()
		File src=t.getScreenshotAs(OutputType.FILE);
		//create new file
		File dest=new File("./Screenshot/swiggy.png");
		//copy
		Files.copy(src, dest);
		driver.close();
	}

}
