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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patient:\n");

        // Sexe
        if (this.sexe == 'M') {
            sb.append("  Sexe: Masculin\n");
        } else if (this.sexe == 'F') {
            sb.append("  Sexe: Féminin\n");
        } else {
            sb.append("  Sexe: Inconnu\n");
        }

        // Numéro de sécurité sociale
        sb.append("  Numéro de sécurité sociale: ").append(numSecu).append("\n");

        // Date de naissance
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        sb.append("  Date de naissance: ").append(dateNaissance.format(formatter)).append("\n");

        // Commentaires
        if (this.commentaires != null) {
            sb.append("  Commentaires: ").append(commentaires).append("\n");
        } else {
            sb.append("  Commentaires: [aucun commentaire]\n");
        }

        // Adresse
        if (this.adresse != null) {
            sb.append("  Adresse: ").append(adresse.toString()).append("\n");
        } else {
            sb.append("  Adresse: [aucune adresse]\n");
        }

        return sb.toString();
    }

}
