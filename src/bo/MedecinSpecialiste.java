package bo;

import java.util.List;

public class MedecinSpecialiste extends Medecin{

    private String specialite;
    private int tarif;


    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }

//    @Override
//    public void afficher() {
//        super.toString();
//        System.out.printf("Spécialité : %s%n", this.specialite);
//        System.out.printf("Tarif : %d%n", this.tarif);
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()) // Inclure les informations de la classe parente
                .append("\n")
                .append("MedecinSpecialiste:\n")
                .append("  Spécialité: ").append(specialite).append("\n")
                .append("  Tarif: ").append(tarif).append("€\n");
        return sb.toString();
    }

}
