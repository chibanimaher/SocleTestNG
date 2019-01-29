package Page;

import org.openqa.selenium.By;

import Base.BasePage;

public class DeposerAnnonceBonCoin extends BasePage {

	public static By a_deposer_annonce = By.xpath("//a[contains(text(),'Déposer une annonce')]");
	public static By select_categorie = By.xpath("//select[@id='category']");
	public static By id_demandes = By.xpath("//input[@id='rk']");
	public static By input_titre = By.xpath("//input[@id='subject']");
	public static By textarea_texte = By.xpath("//textarea[@id='body']");
	public static By input_prix = By.xpath("//input[@id='price']");

	public void je_clique_sur_le_bouton_deposoer_annonce() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(a_deposer_annonce);
	}

	public void je_choisie_la_categorie() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.selectionnerOptionParTexte(select_categorie, "Voitures");
	}
	
	public void je_choisie_le_type_annonce() throws Throwable{
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(id_demandes);
	}
	
	public void je_saisie_le_titre_annonce() throws Throwable{
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.saisirChampSansClear(input_titre,"BOW");
	}
	
	public void je_saisie_le_text_annonce() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.saisirChampSansClear(textarea_texte, "BOWBOWBOWBOWBOWBOWBOWBOWBOWBOW");
	}
	
	public void je_saisie_le_prix() throws Throwable{
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.scrollToElement(input_prix);
		super.saisirChampSansClear(input_prix, "5000000");
	}
	
	
	
	

}
