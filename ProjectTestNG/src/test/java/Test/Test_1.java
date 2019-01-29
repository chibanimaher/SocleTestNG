package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Page.CreationCompteBonCoin;
import Page.HomePage;
import Page.DeposerAnnonceBonCoin;
import Page.FlightPage;
import Page.RechercheBonCoin;
import Page.testScroll;

public class Test_1 extends BaseTest {

	@Test(priority=1)
	public void Test_Recherche_Bon_Coin_test1() throws Throwable {
		RechercheBonCoin pageRBC = new RechercheBonCoin();
		pageRBC.je_choisie_Le_departement("Alsace");
		pageRBC.je_saisie_dans_le_filtre_ma_recherche("Velo");
		pageRBC.je_clique_sur_le_bouton_Rechercher();
	}

	@Test(priority=2)
	public void Test_Creation_Compte_Bon_Coin() throws Throwable {
		CreationCompteBonCoin pageCCBC = new CreationCompteBonCoin();
		pageCCBC.je_clique_sur_le_bouton_Connexion();
		pageCCBC.une_popUp_est_affiche_je_clique_sur_Creer_un_compte();
		pageCCBC.je_choisie_la_case_Particulier();
		pageCCBC.je_remplie_le_formulaire("pseudo", "email", "mdp1", "mdp2");
	}

	@Test(enabled = false)
	public void Test_Deposer_Annonce_Bon_Coin() throws Throwable {
		DeposerAnnonceBonCoin pageDABC = new DeposerAnnonceBonCoin();
		pageDABC.je_clique_sur_le_bouton_deposoer_annonce();
		pageDABC.je_choisie_la_categorie();
		pageDABC.je_choisie_le_type_annonce();
		pageDABC.je_saisie_le_titre_annonce();
		pageDABC.je_saisie_le_text_annonce();
		pageDABC.je_saisie_le_prix();
	}

	@Test(enabled = false)
	public void Test_Scroll() throws Throwable {
		testScroll bla = new testScroll();
		bla.test_scroll();
	}

	@Test(enabled = false)
	public void Test_Creation_Pnr_AF() throws Throwable {
		// HOME PAGE
		HomePage pageHP = new HomePage();
		pageHP.je_ferme_popup();
		pageHP.je_choisie_ville_aller_retour("TLS", "MRS");
		pageHP.je_choisie_date_depart();
		pageHP.je_choisie_date_retour();
		pageHP.je_valide_la_page_accueil();
		// FLIGHT PAGE
		FlightPage pageFP = new FlightPage();
		pageFP.je_valide_la_page_des_vols();
	}

}
