package test;

import java.time.LocalDate;
import java.time.LocalTime;

import bo.*;

public class TestSpecialite {

	private static Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800,
			"Saint Herblain");
	private static Personne malalaniche = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);
	private static Personne ocensemaime = new MedecinSpecialiste("OCENSEMAIME", "Céline", "0748159263", sh, "CARDILOGIE", 52);

	private static Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
	private static Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142l,
			LocalDate.of(1992, 11, 21), null, nio);

	public static void main(String[] args) {
		MedecinGeneraliste melanie = (MedecinGeneraliste) malalaniche;
		System.out.println("__________________________ Médecins généralistes ______________________________");
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
		melanie.afficher();
		melanie.afficherAdresseEtCreneaux();

		MedecinSpecialiste celine = (MedecinSpecialiste) ocensemaime;
		System.out.println("__________________________ Médecins spécialistes __________________________");
		celine.ajouterCreneau(LocalTime.of(14, 0), 20);
		celine.ajouterCreneau(LocalTime.of(14, 20), 20);
		celine.ajouterCreneau(LocalTime.of(14, 40), 20);
		celine.ajouterCreneau(LocalTime.of(15, 0), 20);
		celine.ajouterCreneau(LocalTime.of(15, 20), 20);
		celine.ajouterCreneau(LocalTime.of(15, 40), 20);
		celine.ajouterCreneau(LocalTime.of(16, 0), 20);
		celine.ajouterCreneau(LocalTime.of(16, 20), 20);
		celine.ajouterCreneau(LocalTime.of(16, 40), 20);
		celine.ajouterCreneau(LocalTime.of(17, 0), 20);
		celine.afficher();
		celine.afficherAdresseEtCreneaux();
		
		
		System.out.println("__________________________ Rendez-Vous avec médecin generaliste ___________________________");
		RendezVous rdvGen = new RendezVous(melanie.getCreneauList().get(0), adhemar, LocalDate.of(2023, 4, 10));
		rdvGen.afficher();
		System.out.println("__________________________ Rendez-Vous avec médecin spécialiste ___________________________");
		RendezVous rdvSpe = new RendezVous(celine.getCreneauList().get(0), adhemar, LocalDate.of(2023, 6, 17));
		rdvSpe.afficher();
	}
}
