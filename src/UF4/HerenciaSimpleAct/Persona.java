package UF4.HerenciaSimpleAct;

import java.sql.SQLOutput;

public class Persona {
    private int id;
    private int edat;
    private String Nom;
    private String Cognom;
    private String adreça;


    public int getId(){return id; }

    public void setId(int id) { this.id = id;}

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
       this.Nom = Nom;
    }

    public String getCognom() {
        return Cognom;
    }

    public void setCognom(String Cognom) {
        this.Cognom = Cognom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }
    public void visualitzar(){

        System.out.println("El id es...." + getId());
        System.out.println("Te l'edat de...."+getEdat());
        System.out.println("El nom es...."+getNom());
        System.out.println("El cognom es...."+getCognom());
        System.out.println("La se va direcció es...."+ getAdreça());
    }
}
