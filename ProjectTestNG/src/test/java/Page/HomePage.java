package Page;

import org.openqa.selenium.By;

import Base.BasePage;

public class HomePage extends BasePage {
	public static By cookies = By.xpath("//button[@class='cookiebar-agree-button-agree']");
	private String xpath_generique_date = "//td[@id='calendar--DATE_A_REMPLACER']";
	public static By button_date_depart = By.xpath("//button[@id='minibe__button--calendar_out']");
	public static By button_date_retour = By.xpath("//button[@id='minibe__button--calendar_in']");
	public static By input_ville_depart = By.xpath("//input[@id='minibe__od--out']");
	public static By input_ville_retour = By.xpath("//input[@id='minibe__od--in']");
	public static By button_valider_page_accueil = By.xpath("//button[@id='minibe__button--search']");

	public void je_ferme_popup() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(cookies);
	}
	
	public void je_choisie_ville_aller_retour(String ville_aller , String ville_retour) throws Throwable{
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.saisirChampSansClear(input_ville_depart, ville_aller);
		super.saisirChampSansClear(input_ville_retour, ville_retour);
	}

	public void je_choisie_date_depart() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(button_date_depart);
		String date_aller = super.date_aller();
		super.cliquer(By.xpath(xpath_generique_date.replace("DATE_A_REMPLACER", date_aller)));
	}

	public void je_choisie_date_retour() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(button_date_retour);
		String date_retour = super.date_retour();
		super.cliquer(By.xpath(xpath_generique_date.replace("DATE_A_REMPLACER", date_retour)));
	}
	
	public void je_valide_la_page_accueil() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(button_valider_page_accueil);
	}
	
	

}
