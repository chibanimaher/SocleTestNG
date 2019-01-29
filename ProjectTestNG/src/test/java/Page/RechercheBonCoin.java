package Page;

import org.openqa.selenium.By;

import Base.BasePage;

public class RechercheBonCoin extends BasePage {

	private String xpath_generique_departement = "//a[@title='DEPARTEMENT_A_REMPLACER']";
	public static By input_filtre = By.xpath("//input[@data-qa-id='input-searchtext']");
	public static By div_submit = By.xpath("//div[@data-qa-id='input-search_button']");

	public void je_choisie_Le_departement(String departement) throws Throwable {
		String methodeName = new Object() {			
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(By.xpath(xpath_generique_departement.replace("DEPARTEMENT_A_REMPLACER", departement)));

	}

	public void je_saisie_dans_le_filtre_ma_recherche(String maRecherche) throws Throwable {
		String methodeName = new Object() {			
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.saisirChampSansClear(input_filtre, maRecherche);
	}

	public void je_clique_sur_le_bouton_Rechercher() throws Throwable {
		String methodeName = new Object() {			
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(div_submit);
	}

}
