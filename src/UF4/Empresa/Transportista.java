package UF4.Empresa;

public class Transportista {
    private String nom;
    private String telefon;
    private int numllicencia;

    public void assignarEncarrec(Encarrec e){}
    public void anularEncarrec(Encarrec e){}
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getNumllicencia() {
        return numllicencia;
    }

    public void setNumllicencia(int numllicencia) {
        this.numllicencia = numllicencia;
    }
}
