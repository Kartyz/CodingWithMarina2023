package UF4.Empresa;

public class Sucursal {
    private String nom;
    private String adreça;
    private String telefon;
    private String email;

    public void descansa(Transportista T){}
    public void treballa(Transportista T){}
    public void altaClient(Client C){}
    public void baixaClient(Client C){}
    public void altaEncarrec(Client C,Transportista T,Encarrec E){}
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdreça() {
        return adreça;
    }
    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
