package bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient extends Personne {

    private char sexe;
    private long numSecu;
    private LocalDate dateNaissance;
    private String commentaires;

    private Adresse adresse;

    public Patient() {
        super();

    }



    public Patient(String nom, String prenom, String numeroDeTelephone,char sexe, Long numSecu, LocalDate dateNaissance, String commentaires, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone);
        this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
        this.adresse = adresse;
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
        super.afficher();

        if (this.sexe == 'M'){
            System.out.printf("Sexe : Masculin %n");
        } else if (this.sexe == 'F'){
            System.out.println("Sexe : Feminin %n");
        }else System.out.println("Sexe inconnu");

        System.out.printf("Numéro de sécurité sociale : %d%n",this.numSecu);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Date de naissance : %s%n",dateNaissance.format(formatter));

        if (this.commentaires != null){
            System.out.printf("Commentaires : %s%n",this.commentaires);
        }else System.out.println("Commentaires : [aucun commentaire]");

        this.adresse.afficher();

    }
}
