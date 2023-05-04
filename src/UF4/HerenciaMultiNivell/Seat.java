package UF4.HerenciaMultiNivell;

public class Seat extends Car{
    private String model;

    public Seat(){
        System.out.println("Class Seat");
    }
    public void marca(){
        System.out.println("Marca Seat");
    }
    public void velocitat(){
        System.out.println("Max 120KM");
    }
}
