package test;

import java.time.LocalTime;

import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;

public class TestCreneau {
	public static void main(String[] args) {
		Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800,
				"Saint Herblain");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);
		melanie.ajouterCreneau(LocalTime.of(9, 0), 15);
		melanie.ajouterCreneau(LocalTime.of(9, 15), 15);
		melanie.ajouterCreneau(LocalTime.of(9, 30), 15);
		melanie.ajouterCreneau(LocalTime.of(9, 45), 15);
		melanie.ajouterCreneau(LocalTime.of(10, 30), 15);
		melanie.ajouterCreneau(LocalTime.of(10, 45), 15);
		melanie.ajouterCreneau(LocalTime.of(11, 15), 15);
		melanie.ajouterCreneau(LocalTime.of(11, 30), 15);
		melanie.ajouterCreneau(LocalTime.of(11, 45), 15);
		melanie.ajouterCreneau(LocalTime.of(14, 0), 30);
		melanie.ajouterCreneau(LocalTime.of(14, 30), 30);
		melanie.ajouterCreneau(LocalTime.of(15, 0), 30);
		melanie.ajouterCreneau(LocalTime.of(15, 30), 30);
		melanie.ajouterCreneau(LocalTime.of(16, 0), 30);
		melanie.ajouterCreneau(LocalTime.of(16, 30), 30);

		System.out.println("__________________________________________________________________");
		System.out.println("__________________________ Créneaux ______________________________");
		melanie.afficher();
	}
}
