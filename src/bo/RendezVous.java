package bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RendezVous {

    private Creneau creneau;
    private Patient patient;
    private LocalDate date;

    public RendezVous(){

    }

    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void afficher(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Rendez-vous du %s%n", this.date.format(formatter));
        creneau.afficher();
        System.out.println("pour ");
        patient.afficher();
    }
}
