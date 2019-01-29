package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import testNG.TestngSocle;

public class SeleniumDriver extends TestngSocle {

	public static WebDriver app ;
	public static WebDriverWait wait;

	public static void startApp(String URL) throws Exception {
		
		app = new ChromeDriver();
		app.get(URL);
		app.manage().window().maximize();
	}

	public static void deleteCookies() throws Exception {
		app.manage().deleteAllCookies();
	}
	

	public static void stopApp() throws Exception {
		app.close();
	}

}
