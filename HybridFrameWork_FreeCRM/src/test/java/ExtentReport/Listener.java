package ExtentReport;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter  {
    public ExtentHtmlReporter htmlReporter;//Look and Feel of Reports
    public ExtentReports extent;//Enviornment Setting OS,Browser,Project Name, Host Name, User
    public ExtentTest test;//Log the Testcase status (Pass/Fail/Skip)

    public void onStart(ITestContext testContext) {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "//Reports//ooReport.html");
//System.out.println(System.getProperty("user.dir")+"/Reports/myReport.html");
        System.out.println("On start");
        htmlReporter.config().setDocumentTitle("Test Report");
        htmlReporter.config().setReportName("Testing Report");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host name", "localhost");
        extent.setSystemInfo("Enviornment", "QA");
        extent.setSystemInfo("Project Name", "Orange HRM");
        extent.setSystemInfo("user", "Sampada");

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success");
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Case Passed" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Case Failed is:" + result.getName());
        test.log(Status.FAIL, "Test Case Failed is:" + result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Case Skipped is:" + result.getName());
    }

    public void onFinish(ITestContext testContext) {
        System.out.println("On Finish");
        extent.flush();
    }
}