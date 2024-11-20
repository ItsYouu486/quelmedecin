package test;

import java.time.LocalDate;
import java.time.LocalTime;

import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;
import bo.Patient;
import bo.RendezVous;

public class TestRDV {

	public static void main(String[] args) {
		Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);

		// Ajout des créneaux pour le médecin
		new Creneau(LocalTime.of(9, 15), 15, melanie);
		new Creneau(LocalTime.of(9, 30), 15, melanie);
		new Creneau(LocalTime.of(9, 45), 15, melanie);
		new Creneau(LocalTime.of(10, 30), 15, melanie);
		new Creneau(LocalTime.of(10, 45), 15, melanie);
		new Creneau(LocalTime.of(11, 15), 15, melanie);
		new Creneau(LocalTime.of(11, 30), 15, melanie);
		Creneau c1 = new Creneau(LocalTime.of(11, 45), 15, melanie);
		new Creneau(LocalTime.of(14, 0), 30, melanie);
		new Creneau(LocalTime.of(14, 30), 30, melanie);
		new Creneau(LocalTime.of(15, 0), 30, melanie);
		new Creneau(LocalTime.of(15, 30), 30, melanie);
		new Creneau(LocalTime.of(16, 0), 30, melanie);
		new Creneau(LocalTime.of(16, 30), 30, melanie);

		System.out.println("__________________________ Rendez-Vous ___________________________");

		// Création du patient
		Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
		Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142L,
				LocalDate.of(1992, 11, 21), null, nio);

		// Création et affichage du rendez-vous
		RendezVous rdv = new RendezVous(c1, adhemar, LocalDate.of(2020, 5, 23));
		System.out.println(rdv.toString()); // Remplacement de rdv.afficher() par toString()
	}
}
