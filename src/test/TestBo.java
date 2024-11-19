package test;

import java.time.LocalDate;
import java.time.LocalTime;
import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;
import bo.Patient;
import bo.RendezVous;

public class TestBo {

	private static Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800,
			"Saint Herblain");
	private static MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);

	public static void main(String[] args) {
		VerifAssociationAdresse();
		VerifCreneaux();
		 VerifRendezVous();
	}

	private static void VerifAssociationAdresse() {
		Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
		Adresse comp = new Adresse(4, null, "Rue des Glatiniers", 2100, "Saint-Quentin");
		System.out.println("__________________________ Médecins ______________________________");
		MedecinGeneraliste edmond = new MedecinGeneraliste("Bosapin", "Edmond", "+33 2 17 18 19 20", nio);
		MedecinGeneraliste djemila = new MedecinGeneraliste("Table", "Djémila", "03-04-05-06-07", sh);

		melanie.afficher();
		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();

		System.out.println("__________________________________________________________________");
		System.out.println("__________________________ Patient _______________________________");
		Patient hillary = new Patient("Vambuce", "Hillary", "0123456789", 'F', 287060244010154l,
				LocalDate.of(1987, 6, 2), "Allergie aux arachides", comp);
		Patient ines = new Patient("Perret", "Inès", "0698745123", 'F', 245021067034521l, LocalDate.of(1945, 2, 10),
				null, nio);
		Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null, comp);

		hillary.afficher();
		System.out.println("------------------------------------------------------------------");
		ines.afficher();
		System.out.println("------------------------------------------------------------------");
		adhemar.afficher();
	}

	private static void VerifCreneaux() {
		// Ajout des créneaux à la liste de Mélanie via ajouterCreneau()
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

	private static void VerifRendezVous() {
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________ Rendez-Vous ___________________________");
		Creneau c1 = new Creneau(LocalTime.of(9, 0), 15, melanie);
		Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
		Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null, nio);
		// Créez et affichez un rendez-vous si nécessaire
		 RendezVous rdv = new RendezVous(c1, adhemar, LocalDate.of(2020, 5, 23));
		 rdv.afficher();
	}
}
