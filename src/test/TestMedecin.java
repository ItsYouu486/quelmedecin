package test;

import bo.MedecinGeneraliste;

public class TestMedecin {

	public static void main(String[] args) {
		System.out.println("__________________________ Médecins ______________________________");

		MedecinGeneraliste melanie = new MedecinGeneraliste();
		melanie.setNom("Malalaniche");
		melanie.setPrenom("Mélanie");
		melanie.setNumeroDeTelephone("02.28.03.17.28");

		MedecinGeneraliste edmond = new MedecinGeneraliste();
		edmond.setNom("Bosapin");
		edmond.setPrenom("Edmond");
		edmond.setNumeroDeTelephone("+33 2 17 18 19 20");

		MedecinGeneraliste djemila = new MedecinGeneraliste();
		djemila.setNom("Table");
		djemila.setPrenom("Djémila");
		djemila.setNumeroDeTelephone("03-04-05-06-07");

		// Afficher les informations des médecins
		System.out.println(melanie.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(edmond.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(djemila.toString());

		System.out.println("--------------- Changement du numéro de ce médecin ---------------");
		djemila.setNumeroDeTelephone("07-06-05-04-03");
		System.out.printf("Nouveau numéro du Dr %s : %s%n", djemila.getNom(), djemila.getNumeroDeTelephone());

		System.out.println("-------------- Changement du prix de la consultation -------------");
		MedecinGeneraliste.setTarif(23);
		System.out.println(melanie.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(edmond.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(djemila.toString());
	}
}
