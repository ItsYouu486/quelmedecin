package bo;

import java.time.LocalTime;

public class Creneau {

    private LocalTime heureDebut;
    private int duree;

    private MedecinGeneraliste medecinGeneraliste;

    public Creneau() {

    }

    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecinGeneraliste) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecinGeneraliste = medecinGeneraliste;
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

    public MedecinGeneraliste getMedecinGeneraliste() {
        return medecinGeneraliste;
    }

    public void setMedecinGeneraliste(MedecinGeneraliste medecinGeneraliste) {
        this.medecinGeneraliste = medecinGeneraliste;
    }

    public void afficher() {
        LocalTime heureFin = this.heureDebut.plusMinutes(this.duree); // Calcul de l'heure de fin
        System.out.printf("%s - %s (%d minutes)%n", this.heureDebut, heureFin, this.duree);
    }

}
