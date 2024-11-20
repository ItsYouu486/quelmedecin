package bo;

import java.time.format.DateTimeFormatter;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;

    public Personne() {
        super();
    }

    public Personne(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personne:\n")
                .append("  Prénom: ").append(prenom).append("\n")
                .append("  Nom: ").append(nom).append("\n")
                .append("  Téléphone: ").append(numeroDeTelephone != null ? numeroDeTelephone : "[non renseigné]").append("\n");
        return sb.toString();
    }

}
