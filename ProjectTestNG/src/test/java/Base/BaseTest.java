package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseTest extends BasePage {

	public static String getProperty() throws IOException {
		FileReader reader = new FileReader("environement.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String URL = properties.getProperty("Url");
		return URL;
	}

	public static WebDriver getDriver() {
		return app;
	}

}
