package test;

import java.time.LocalDate;
import bo.Patient;

public class TestPatient {

	public static void main(String[] args) {
		System.out.println("__________________________ Patient _______________________________");

		// Création des objets Patient
		Patient hillary = new Patient();
		hillary.setNom("Vambuce");
		hillary.setPrenom("Hillary");
		hillary.setNumeroDeTelephone("0123456789");
		hillary.setSexe('F');
		hillary.setNumSecu(287060244010154L);
		hillary.setDateNaissance(LocalDate.of(1987, 6, 2));
		hillary.setCommentaires("Allergie aux arachides");

		Patient ines = new Patient();
		ines.setNom("Perret");
		ines.setPrenom("Inès");
		ines.setNumeroDeTelephone("0698745123");
		ines.setSexe('F');
		ines.setNumSecu(245021067034521L);
		ines.setDateNaissance(LocalDate.of(1945, 2, 10));
		ines.setCommentaires(null);

		Patient adhemar = new Patient();
		adhemar.setNom("Pamamobe");
		adhemar.setPrenom("Adhémar");
		adhemar.setNumeroDeTelephone("0753428619");
		adhemar.setSexe('M');
		adhemar.setNumSecu(192112192020142L);
		adhemar.setDateNaissance(LocalDate.of(1992, 11, 21));
		adhemar.setCommentaires(null);

		// Affichage des patients avec toString()
		System.out.println(hillary.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(ines.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(adhemar.toString());
	}
}
