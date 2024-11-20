package bo;

import java.time.LocalDate;

public class FichierMedical {

    private int poids;
    private int taille;
    private String tension;
    private int oxygenation;
    private int pulsation;
    private String probleme;
    private String prescription;
    private LocalDate dateSoin;

    private Patient patient;
    private Medecin medecin;

    public FichierMedical(int poids, int taille, String tension, int oxygenation, int pulsation, String probleme, String prescription, LocalDate dateSoin, Patient patient, Medecin medecin) {
        this.poids = poids;
        this.taille = taille;
        this.tension = tension;
        this.oxygenation = oxygenation;
        this.pulsation = pulsation;
        this.probleme = probleme;
        this.prescription = prescription;
        this.dateSoin = dateSoin;
        this.patient = patient;
        this.medecin = medecin;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        if (!tension.matches("\\d+/\\d+")) {
            throw new IllegalArgumentException("Le format de la tension doit être deux chiffres séparés par '/'. Exemple : 12/8");
        }
        this.tension = tension;
    }

    public int getOxygenation() {
        return oxygenation;
    }

    public void setOxygenation(int oxygenation) {
        this.oxygenation = oxygenation;
    }

    public int getPulsation() {
        return pulsation;
    }

    public void setPulsation(int pulsation) {
        this.pulsation = pulsation;
    }

    public String getProbleme() {
        return probleme;
    }

    public void setProbleme(String probleme) {
        this.probleme = probleme;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public LocalDate getDateSoin() {
        return dateSoin;
    }

    public void setDateSoin(LocalDate dateSoin) {
        this.dateSoin = dateSoin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FichierMedical:\n")
                .append("  Poids: ").append(poids).append(" kg\n")
                .append("  Taille: ").append(taille).append(" cm\n")
                .append("  Tension: ").append(tension).append(" cmHg\n")
                .append("  Oxygenation: ").append(oxygenation).append(" %\n")
                .append("  Pulsation: ").append(pulsation).append(" bpm\n")
                .append("  Problème: ").append(probleme).append("\n")
                .append("  Prescription: ").append(prescription).append("\n")
                .append("  Date du soin: ").append(dateSoin).append("\n")
                .append("  Patient: ").append(patient).append("\n")
                .append("  Médecin: ").append(medecin).append("\n");
        return sb.toString();
    }


    public void affichageSpecifique(){
        System.out.println("Fichier médical de :");

    }
}
