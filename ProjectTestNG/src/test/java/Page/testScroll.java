package Page;

import org.openqa.selenium.By;

import Base.BasePage;

public class testScroll extends BasePage {

	public static By test_xpath = By.xpath("//a[@id='fo_majeur_0']");
	public static By cookies = By.xpath("//button[@class='cookiebar-agree-button-agree']");

	public void test_scroll() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);

		super.cliquer(cookies);
		super.scrollToElement(test_xpath);
		super.cliquer(test_xpath);

	}

}