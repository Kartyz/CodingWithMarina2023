package UF4.HerenciaMultiNivell;

public class Arona extends Seat{
    private String color;
    private int km;

    public Arona(){
        System.out.println("Seat modelo: Arona");
    }
    public void velocitat(){
        System.out.println("100km");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
