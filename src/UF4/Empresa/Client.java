package UF4.Empresa;

public class Client {
    private String nom;
    private String adreca;
    private String telefon;
    private String email;

    public Client(){
        Client C = new Client();

    }
    public void assignarEncarrec(Encarrec e){}
    public void anularEncarrec(Encarrec e){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
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
