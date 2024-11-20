package bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MedecinGeneraliste extends Medecin {

    private static int tarif = 25;

    public MedecinGeneraliste(){
        super();
    }


    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
    }




    public int getTarif() {
        return tarif;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif; // Mise à jour du champ statique
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()) // Inclure les informations de la classe parente
                .append("\n")
                .append("MedecinGeneraliste:\n")
                .append("  Tarif: ").append(MedecinGeneraliste.tarif).append("€\n");
        return sb.toString();
    }

}
