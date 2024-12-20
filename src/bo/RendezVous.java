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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        sb.append("Rendez-vous:\n")
                .append("  Date: ").append(date.format(formatter)).append("\n");

        // Informations sur le créneau
        if (creneau != null) {
            sb.append("  Créneau:\n")
                    .append("    ").append(creneau).append("\n");
            if (creneau.getMedecin() != null) {
                sb.append("  Médecin: Dr ").append(creneau.getMedecin().getNom()).append("\n");
            }
        } else {
            sb.append("  Créneau: [non défini]\n");
        }

        // Informations sur le patient
        if (patient != null) {
            sb.append("  Patient:\n")
                    .append("    ").append(patient).append("\n");
        } else {
            sb.append("  Patient: [non défini]\n");
        }

        return sb.toString();
    }

}
