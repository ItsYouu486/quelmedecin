package bo;

public class Adresse {
    public String mentionsCompl;
    public int numero;
    public String complNumero;
    public String rue;
    public int cp;
    public String ville;

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

    public void afficher(){

        if (this.mentionsCompl != null) {

            System.out.println(this.mentionsCompl);
        }
        System.out.printf("%d %s%n",this.numero,this.rue);
        System.out.println(this.cp + " " + this.ville);
    }
}
