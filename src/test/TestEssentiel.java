package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bo.Adresse;
import bo.Medecin;
import bo.MedecinGeneraliste;
import bo.MedecinSpecialiste;

public class TestEssentiel {

	//instanciation des adresses
	private static Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
	
	//instanciation d'un medecin generaliste
	private static MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);
	
	//instanciation des medecins specialistes
	private static MedecinSpecialiste edmond = new MedecinSpecialiste("Bosapin", "Edmond", "02.28.03.17.24", sh);
	private static MedecinSpecialiste benoit = new MedecinSpecialiste("De Cajou", "Benoit", "02.28.03.17.23", sh);
	private static MedecinSpecialiste anne = new MedecinSpecialiste("Aimone", "Anne", "02.28.03.17.26", sh);
	private static MedecinSpecialiste sylvan = new MedecinSpecialiste("Tourne", "Sylvan", "02.28.03.17.21", sh);
	private static MedecinSpecialiste remy = new MedecinSpecialiste("Sion", "Remy", "02.28.03.17.25", sh);

	
	public static void main(String[] args) {
		System.out.println("__________________________ Médecins géneralistes ______________________________");
		System.out.println(melanie);
		
		System.out.println("__________________________ Médecins spécialistes ______________________________");
		edmond.setSpecialite("CARDIOLOGIE");
		edmond.setTarif(52);
		System.out.println(edmond);
		benoit.setSpecialite("ANGIOLOGIE");
		benoit.setTarif(57);
		System.out.println(benoit);
		anne.setSpecialite("STOMATOLOGIE");
		anne.setTarif(55);
		System.out.println(anne);
		sylvan.setSpecialite("PEDIATRIE");
		sylvan.setTarif(52);
		System.out.println(sylvan);
		remy.setSpecialite("GYNECOLOGIE OBSTETRIQU");
		remy.setTarif(55);
		System.out.println(remy);

		System.out.println("_________ trier la liste des Médecins spécialistes  ___________");
		List<MedecinSpecialiste> liste = new ArrayList<MedecinSpecialiste>();
		liste.add(edmond);
		liste.add(benoit);
		liste.add(anne);
		liste.add(sylvan);
		liste.add(remy);
		
		System.out.println("======== affichage de la collection dans l'ordre d'insertion =======");
		for (MedecinSpecialiste ms : liste) {
			System.out.print(liste.indexOf(ms)+" - "+ ms);
		}
		System.out.println();
		
		Collections.sort(liste);
		System.out.println("====== affichage de la collection triee dans l'ordre croissant des tarifs =====");
		for (MedecinSpecialiste ms : liste) {
			System.out.print(liste.indexOf(ms)+" - "+ ms);
		}
		System.out.println();

		/*
		 * Que faudrait-il rajouter afin de trier notre collection dans l'ordre decroissant des tarifs ?
		 */
		Collections.sort(liste);
		System.out.println("===== affichage de la collection triee dans l'ordre decroissant des tarifs =====");
		for (MedecinSpecialiste ms : liste) {
			System.out.print(liste.indexOf(ms)+" - "+ ms);
		}
		System.out.println();

	}
}
