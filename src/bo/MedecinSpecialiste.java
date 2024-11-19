package bo;

public class MedecinSpecialiste extends MedecinGeneraliste{

    private String specialite;
    private int tarif;

    public MedecinSpecialiste(){
        super();
    }

    public MedecinSpecialiste(String specialite, int tarif) {
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }
}
