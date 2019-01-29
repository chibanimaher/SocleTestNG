package Page;

import org.openqa.selenium.By;

import Base.BasePage;

public class CreationCompteBonCoin extends BasePage {

	public static By div_connexion = By.xpath("//div[text()='Se connecter']");
	public static By div_se_connecter = By.xpath("//button[text()='Créer un compte']");
	public static By a_particulier = By.xpath("//a[text()='Particulier']");
	public static By input_pseudo = By.xpath("//input[@data-qa-id='input-pseudo']");
	public static By input_mail = By.xpath("//input[@data-qa-id='input-email']");
	public static By input_mdp1 = By.xpath("//input[@data-qa-id='input-password']");
	public static By input_mdp2 = By.xpath("//input[@data-qa-id='input-confirm-password']");

	public void je_clique_sur_le_bouton_Connexion() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(div_connexion);
	}

	public void une_popUp_est_affiche_je_clique_sur_Creer_un_compte() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(div_se_connecter);
	}

	public void je_choisie_la_case_Particulier() throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.cliquer(a_particulier);
	}

	public void je_remplie_le_formulaire(String pseudo, String email, String mdp1, String mdp2)
			throws Throwable {
		String methodeName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		AppendReporter("STEP=" + methodeName);
		super.saisirChampSansClear(input_pseudo, pseudo);
		super.saisirChampSansClear(input_mail, email);
		super.saisirChampSansClear(input_mdp1, mdp1);
		super.saisirChampSansClear(input_mdp2, mdp2);

	}

}
