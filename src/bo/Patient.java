package bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private Long numSecu;
    private LocalDate dateNaissance;
    private String commentaires;

    private Adresse adresse;

    public Patient() {

    }

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu, LocalDate dateNaissance, String commentaires, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
        this.adresse = adresse;
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

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public long getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(long numSecu) {
        this.numSecu = numSecu;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaire) {
        this.commentaires = commentaire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void afficher(){
        System.out.println(this.prenom + " " + this.nom);
        System.out.printf("Téléphone : %s%n",this.numeroDeTelephone);
        System.out.printf("Sexe : %s%n",this.sexe);
        System.out.printf("Numéro de sécurité sociale : %d%n",this.numSecu);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Date de naissance : %s%n",dateNaissance.format(formatter));
        System.out.printf("Commentaires : %s%n",this.commentaires);
        this.adresse.afficher();

    }
}
