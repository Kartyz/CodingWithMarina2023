package UF4.Projecte;

public class Paralelogram extends Figura{

    private int b;
    private int h;

    public Paralelogram(){

    }

    public Paralelogram(int b, int h){
        this.b = b;
        this.h = h;
        setFigura("Pararllelogram");
    }
    public int getB() {return b;}

    public void setB(int b) {this.b = b;}

    public int getH() {return h;}

    public void setH(int h) {this.h = h;}

    @Override
    public double CalcularArea(){
        this.b = this.b * this.h;
        return this.b;
    }
}

