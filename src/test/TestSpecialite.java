package test;

import java.time.LocalDate;
import java.time.LocalTime;
import bo.*;

public class TestSpecialite {

	public static void main(String[] args) {
		// Création des adresses
		Adresse adresseSaintHerblain = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
		Adresse adresseNiort = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");

		// Création des médecins
		MedecinGeneraliste medecinGeneraliste = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", adresseSaintHerblain);
		MedecinSpecialiste medecinSpecialiste = new MedecinSpecialiste("OCENSEMAIME", "Céline", "0748159263", adresseSaintHerblain, "CARDIOLOGIE", 52);

		// Création d'un patient
		Patient patient = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142L, LocalDate.of(1992, 11, 21), null, adresseNiort);

		// Ajout des créneaux pour le médecin généraliste
		System.out.println("__________________________ Médecins généralistes ______________________________");
		ajouterCreneauxGeneriques(medecinGeneraliste);
		System.out.println(medecinGeneraliste.toString()); // Utilisation de toString()
		medecinGeneraliste.afficherAdresseEtCreneaux(); // Conserve l'affichage des créneaux

		// Ajout des créneaux pour le médecin spécialiste
		System.out.println("__________________________ Médecins spécialistes __________________________");
		ajouterCreneauxSpecifiques(medecinSpecialiste);
		System.out.println(medecinSpecialiste.toString()); // Utilisation de toString()
		medecinSpecialiste.afficherAdresseEtCreneaux(); // Conserve l'affichage des créneaux

		// Création et affichage d'un rendez-vous avec le médecin généraliste
		System.out.println("__________________________ Rendez-Vous avec médecin généraliste ___________________________");
		RendezVous rdvGeneraliste = new RendezVous(medecinGeneraliste.getCreneauList().get(0), patient, LocalDate.of(2023, 4, 10));
		System.out.println(rdvGeneraliste.toString()); // Utilisation de toString()

		// Création et affichage d'un rendez-vous avec le médecin spécialiste
		System.out.println("__________________________ Rendez-Vous avec médecin spécialiste ___________________________");
		RendezVous rdvSpecialiste = new RendezVous(medecinSpecialiste.getCreneauList().get(0), patient, LocalDate.of(2023, 6, 17));
		System.out.println(rdvSpecialiste.toString()); // Utilisation de toString()
	}

	/**
	 * Ajoute des créneaux au médecin généraliste
	 */
	private static void ajouterCreneauxGeneriques(MedecinGeneraliste medecin) {
		medecin.getCreneauList().add(new Creneau(LocalTime.of(9, 0), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(9, 15), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(9, 30), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(9, 45), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(10, 30), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(10, 45), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(11, 15), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(11, 30), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(11, 45), 15, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(14, 0), 30, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(14, 30), 30, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(15, 0), 30, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(15, 30), 30, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(16, 0), 30, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(16, 30), 30, medecin));
	}

	/**
	 * Ajoute des créneaux au médecin spécialiste
	 */
	private static void ajouterCreneauxSpecifiques(MedecinSpecialiste medecin) {
		medecin.getCreneauList().add(new Creneau(LocalTime.of(14, 0), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(14, 20), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(14, 40), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(15, 0), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(15, 20), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(15, 40), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(16, 0), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(16, 20), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(16, 40), 20, medecin));
		medecin.getCreneauList().add(new Creneau(LocalTime.of(17, 0), 20, medecin));
	}
}
