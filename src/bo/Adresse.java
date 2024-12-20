package bo;

import java.util.List;

public class Adresse {
    private String mentionsCompl;
    private int numero;
    private String complNumero;
    private String rue;
    private int cp;
    private String ville;

    public Adresse(){

    }

    public Adresse(String mentionsCompl, int numero, String complNumero, String rue, int cp, String ville) {
        this.mentionsCompl = mentionsCompl;
        this.numero = numero;
        this.complNumero = complNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public Adresse(int numero, String complNumero, String rue, int cp, String ville) {
        this.numero = numero;
        this.complNumero = complNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.mentionsCompl = null;
    }

    public String getMentionsCompl() {
        return mentionsCompl;
    }

    public void setMentionsCompl(String mentionsCompl) {
        this.mentionsCompl = mentionsCompl;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplNumero() {
        return complNumero;
    }

    public void setComplNumero(String complNumero) {
        this.complNumero = complNumero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adresse:\n");

        // Mentions complémentaires
        if (this.mentionsCompl != null) {
            sb.append("  ").append(mentionsCompl).append("\n");
        }

        // Numéro et rue
        sb.append("  ").append(numero);
        if (complNumero != null && !complNumero.isEmpty()) {
            sb.append(" ").append(complNumero);
        }
        sb.append(" ").append(rue).append("\n");

        // Code postal et ville
        sb.append("  ").append(cp).append(" ").append(ville).append("\n");

        return sb.toString();
    }

}
