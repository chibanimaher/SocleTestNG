package testNG;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Base.BaseTest;
import Selenium.SeleniumDriver;

import static org.apache.commons.lang.StringEscapeUtils.escapeHtml;

public class TestngSocle {

	public static Logger LOGGER = LoggerFactory.getLogger(TestngSocle.class);

	@BeforeTest
	public void TestNGbeforeTest() throws Exception {
	}

	@AfterTest
	public void TestNGafterTest() throws Exception {
	}

	@BeforeMethod
	public void TestNGbeforeMethod(ITestContext context, Method m) throws Exception {
		String testName = context.getCurrentXmlTest().getName();
		AppendReporter("==================================================================>> TEST: " + testName
				+ " / ETAPE: " + m.getName());

		String URL = BaseTest.getProperty();
		SeleniumDriver.startApp(URL);
		SeleniumDriver.deleteCookies();
	}

	@AfterMethod
	public void TestNGafterMethod() throws Exception {
		SeleniumDriver.stopApp();
	}

	public static void AppendReporter(String message) throws Exception {
		Reporter.log(utilsGetTimeValue() + " " + escapeHtml(message) + "<BR>");
		LOGGER.info(utilsGetTimeValue() + " " + message);
	}

	public static String utilsGetTimeValue() throws Exception {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Calendar cal = Calendar.getInstance();
		return df.format(cal.getTime());
	}

}
