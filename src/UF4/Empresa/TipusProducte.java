package UF4.Empresa;

public class TipusProducte {
    private String nom;
    private int codiIdentificador;
    private float preu;
    private int estoc;
    private boolean aLaVenda;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodiIdentificador() {
        return codiIdentificador;
    }

    public void setCodiIdentificador(int codiIdentificador) {
        this.codiIdentificador = codiIdentificador;
    }
    public float getPreu() {
        return preu;
    }
    public void setPreu(float preu) {
        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }

    public void setaLaVenda(boolean aLaVenda) {
        this.aLaVenda = aLaVenda;
    }
}
