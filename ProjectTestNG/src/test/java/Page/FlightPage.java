package Page;

import org.openqa.selenium.By;

import Base.BasePage;

public class FlightPage extends BasePage {

	public static By button_valider_page_des_vols = By.xpath("//button[@id='idValidateFormButtonFlight']");

	public void je_valide_la_page_des_vols() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(button_valider_page_des_vols);
	}

}
