package bo;

import java.time.format.DateTimeFormatter;

public class MedecinGeneraliste {

    private String nom;
    private String prenom;
    private String numeroDeTelephone;

    private static int tarif = 25;

    public MedecinGeneraliste(){

    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }



    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getNumeroDeTelephone(){
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone){
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public int getTarif() {
        return tarif;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif; // Mise à jour du champ statique
    }

    public void afficher(){
        System.out.println(this.prenom + " " + this.nom);
        System.out.printf("Téléphone : %s%n",this.numeroDeTelephone);
        System.out.printf("Tarif : %d%n", MedecinGeneraliste.tarif);

    }
}