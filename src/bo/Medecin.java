package bo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Medecin extends Personne{

    private Adresse adresse;

    private List<Creneau> creneauList = new ArrayList<>();

    public Medecin() {
    }


    public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone);
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Creneau> getCreneauList() {
        return creneauList;
    }

    public void setCreneauList(List<Creneau> creneauList) {
        this.creneauList = creneauList;
    }

    public void afficherAdresseEtCreneaux() {
        System.out.println(this.adresse.toString());

        if (this.creneauList == null || this.creneauList.isEmpty()) {
            System.out.println("Créneaux : aucun créneau");
        } else {
            System.out.println("Créneaux : ");
            for (Creneau creneau : creneauList) {
                System.out.println(creneau.toString()); // Utilisation de toString() pour chaque créneau
            }
        }
    }


    public void ajouterCreneau(LocalTime heureDebut, int duree){
        if (this.creneauList.size()<15){
            Creneau creneau = new Creneau(heureDebut, duree);
            this.creneauList.add(creneau);
        } else
            System.out.println("Impossible d'ajouter plus de 15 créneaux.");
    }
}
