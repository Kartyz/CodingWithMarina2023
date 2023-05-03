package UF4.Objectes;

public class Cercle {
    private  double radi;
    private String color;

    public Cercle(double rd, String col){
        radi = rd;
        color = col;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
