package test;

import bo.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestPersonne {

	private static Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800,
			"Saint Herblain");
	// transtypage ascendant
	private static Personne malalaniche = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);

	private static Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
	private static Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142L,
			LocalDate.of(1992, 11, 21), null, nio);

	public static void main(String[] args) {
		System.out.println("__________________________ Affichage d'un médecin ______________________________");
		System.out.println(malalaniche.toString()); // Remplacement de afficher() par toString()

		// transtypage descendant
		MedecinGeneraliste melanie = (MedecinGeneraliste) malalaniche;
		System.out.println(melanie.toString()); // Affichage des informations du médecin
		melanie.afficherAdresseEtCreneaux(); // Utilisation de afficherAdresseEtCreneaux()

		System.out.println("__________________________ Affectation des creneaux au médecin ______________________________");
		// Ajouter des créneaux avec la méthode ajouterCreneau()
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

		// polymorphisme
		System.out.println(melanie.toString()); // Affichage des informations du médecin
		melanie.afficherAdresseEtCreneaux(); // Utilisation de afficherAdresseEtCreneaux()

		System.out.println("__________________________ Affichage d'un Patient ______________________________");
		System.out.println(adhemar.toString()); // Remplacement de afficher() par toString()

		System.out.println("__________________________ Afficher le rendez-vous du Patient ___________________________");
		RendezVous rdv = new RendezVous(melanie.getCreneauList().get(0), adhemar, LocalDate.of(2020, 5, 23));
		System.out.println(rdv.toString()); // Remplacement de afficher() par toString()
	}
}
