package bo;

import java.util.List;

public class MedecinSpecialiste extends Medecin implements Comparable<MedecinSpecialiste>{

    private String specialite;
    private int tarif;


    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

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

    @Override
    public int compareTo(MedecinSpecialiste o) {
        return this.tarif - o.tarif;
    }
}
