package bo;

import java.time.LocalTime;

public class Creneau {

    private LocalTime heureDebut;
    private int duree;

    private Medecin medecin;

    public Creneau() {

    }

    public Creneau(LocalTime heureDebut, int duree, Medecin medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
    }

    public Creneau(LocalTime heureDebut, int duree) {
        this.heureDebut = heureDebut;
        this.duree = duree;
    }


    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecinGeneraliste(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LocalTime heureFin = this.heureDebut.plusMinutes(this.duree);
        sb.append("Creneau: \n")
                .append("  Heure de début: ").append(heureDebut).append("\n")
                .append("  Heure de fin: ").append(heureFin).append("\n")
                .append("  Durée: ").append(duree).append(" minutes\n")
                .append("  Médecin: ").append(medecin).append("\n");
        return sb.toString();
    }

}
