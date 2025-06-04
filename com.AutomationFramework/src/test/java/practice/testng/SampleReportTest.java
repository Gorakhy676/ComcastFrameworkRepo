package practice.testng;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {

    ExtentReports report;

    @BeforeSuite
    public void configBS() {
        // Spark report config
        ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
        spark.config().setDocumentTitle("CRM TEST SUITE RESULT");
        spark.config().setReportName("CRM Report");
        spark.config().setTheme(Theme.DARK);

        // Add environment info and attach reporter
        report = new ExtentReports();
        report.attachReporter(spark);
        report.setSystemInfo("OS", "Windows-10");
        report.setSystemInfo("Browser", "Chrome-100");
    }

    @AfterSuite
    public void configAS() {
        report.flush();
    }

    @Test
    public void createContactTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://49.249.28.218:8888/"); 
        TakesScreenshot tks = (TakesScreenshot) driver;
        String filepath = tks.getScreenshotAs(OutputType.BASE64);



        driver.close();
    }

    @Test
    public void createContactWithOrg() {
        ExtentTest test = report.createTest("createContactWithOrg");

        test.log(Status.INFO, "Login to app");
        test.log(Status.INFO, "Navigate to contact page");
        test.log(Status.INFO, "Create contact with org");

        if ("HDFC".equals("HDFC")) {
            test.log(Status.PASS, "Contact with org created successfully");
        } else {
            test.log(Status.FAIL, "Contact with org creation failed");
        }
    }

    @Test
    public void createContactWithPhoneNumber() {
        ExtentTest test = report.createTest("createContactWithPhoneNumber");

        test.log(Status.INFO, "Login to app");
        test.log(Status.INFO, "Navigate to contact page");
        test.log(Status.INFO, "Create contact with phone number");

        if ("HDFC".equals("HDFC")) {
            test.log(Status.PASS, "Contact with phone number created successfully");
        } else {
            test.log(Status.FAIL, "Contact with phone number creation failed");
        }
    }
}
