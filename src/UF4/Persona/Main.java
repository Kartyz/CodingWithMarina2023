package UF4.Persona;

public class Main {
    public static void main(String []args){
        Persona p = new Persona();
        p.setDni("333334532Y");
        p.setNom("Marina");
        p.setEdat(26);
        p.visualitzar();

        Persona p1 = new Persona();
        p1.setDni("3214532Y");
        p1.setNom("Manolo");
        p1.setEdat(26);
        p1.visualitzar();

        Persona p2 = new Persona();
        p2.setDni("23412343r");
        p2.setNom("Carlos");
        p2.setEdat(22);
        p2.visualitzar();

        Persona p3 = new Persona();
        p3.setDni("23414565e");
        p3.setNom("Carolina");
        p3.setEdat(19);
        p3.visualitzar();

        Persona p4 = new Persona();
        p4.setDni("23334343r");
        p4.setNom("Carla");
        p4.setEdat(28);
        p4.visualitzar();

        Persona p5 = new Persona();
        p5.setDni("23574343w");
        p5.setNom("Jaume");
        p5.setEdat(45);
        p5.visualitzar();
    }
}
