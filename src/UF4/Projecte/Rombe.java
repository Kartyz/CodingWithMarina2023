package UF4.Projecte;

public class Rombe extends Figura{
    private int DM;
    private int dm;
    public Rombe(){}
    public Rombe(int DM, int dm){
        this.DM = DM;
        this.dm = dm;
        setFigura("Rombe");
    }
    public int getDM() {return DM;}
    public void setDM(int DM) {this.DM = DM;}
    public int getDm() {
        return dm;
    }
    public void setDm(int dm) {
        this.dm = dm;
    }
    @Override
    public double CalcularArea(){
        this.DM = (this.DM * this.dm)/2;
        return this.DM;
    }
}

