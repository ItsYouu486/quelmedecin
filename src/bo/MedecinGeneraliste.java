package bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MedecinGeneraliste extends Personne {

    private static int tarif = 25;

    private Adresse adresse;

    private List<Creneau> creneauList = new ArrayList<>();



    public MedecinGeneraliste(){
        super();
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone);
        this.adresse = adresse;
    }

    public int getTarif() {
        return tarif;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif; // Mise à jour du champ statique
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

        if (creneauList.size()<=15){
            this.creneauList = creneauList;
        }else
            System.out.println("La liste de peut pas dépasser 15 créneaux");

    }

    public void afficher(){
        super.afficher();
        System.out.printf("Tarif : %d%n", MedecinGeneraliste.tarif);
    }

    public void afficherAdresseEtCreneaux(){
        this.adresse.afficher();
        if (this.creneauList == null || this.creneauList.isEmpty()){
            System.out.println("Créneaux : aucun créneau");
        }else {
            System.out.println("Créneaux : ");
            for (Creneau creneau : creneauList) {
                creneau.afficher();
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
