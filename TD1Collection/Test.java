package TD1Collection;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Compte c1 = new Compte(1);
		Compte c2 = new Compte(2);
		Compte c3 = new Compte(3);
		System.out.println("le compte a l'instruction  :\n" + c1.toString());

		c1.depot(100);
		System.out.println("le compte c1   apres depot:\n" + c1.toString());

		c1.retrait(10);
		System.out.println("le compte  aprés retrait :\n" + c1.toString());

		Titulaire t1 = new Titulaire("Rawen");

		t1.ajoutCompte(c2);
		t1.ajoutCompte(c1);
		System.out.println("le titulaire  a l'instruction :");
		t1.afficheTitulaire();

		t1.effectuerRetrait(1, 70);
		System.out.println("le titulaire  aprés retrait :");

		t1.afficheTitulaire();

		t1.effectuerDepot(3,700);
		System.out.println("le titulaire  aprés depot :");

		t1.afficheTitulaire();

		Banque b1 = new Banque("BOUDHINA");
		b1.AjouterCompte(c1);
		b1.AjouterCompte(c2);
		b1.AjouterCompte(c3);

		b1.Affiche();

		System.out.println("le numéro de compte ayant le maximum solde " + t1.trouverCompteSoldeMax());

		System.out.println("Comptes avant le tri :");
		b1.Affiche();

		b1.trierComptes();

		System.out.println("\n Comptes après  triés :");
		b1.Affiche();
	}

}
