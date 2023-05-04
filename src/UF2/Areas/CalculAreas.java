package UF2.Areas;

import java.util.Scanner;

public class CalculAreas {

    private double area = 0;
    private String figura = "";

    public static void main (String args[]) {
        CalculAreas programa = new CalculAreas();
        programa.inici();
    }

    public void inici(){
        MostrarMenu();
        TractarFigura();
        CalculArea();
        Imprimir();
    }

    private void Imprimir(){System.out.println(" L'area del  "  + figura + " es " + area);
    }

    public void MostrarMenu(){
        Scanner s = new Scanner(System.in);

        System.out.println("Quina figura vols calcula");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
        figura = s.nextLine();
    }

    public void TractarFigura(){


        if (figura.equalsIgnoreCase("triangle")) {
            CalculArea();
        }
        else if (figura.equalsIgnoreCase("quadrat")) {
            CalculArea();
        }
        else if (figura.equalsIgnoreCase("rectangle")) {
            CalculArea();
        }
        else if (figura.equalsIgnoreCase("trapezi")) {
            CalculArea();
        }
        else if (figura.equalsIgnoreCase("rombe")) {
            CalculArea();
        }
        else if (figura.equalsIgnoreCase("paralelogram")) {
            CalculArea();
        }
        else if (figura.equalsIgnoreCase("cercle")) {
            CalculArea();
        }
        else {
            System.out.println("Opció incorrecta!\n");
        }
    }


    public void CalculArea(){
        if (figura.equalsIgnoreCase("triangle")){
            double b = 23.0;
            double h = 8.0;
            area = (b*h)/2;
        }
        else if (figura.equalsIgnoreCase("quadrat")){
            double r = 37.0;
            //funció matemàtica que eleva a 2 el radi
            area = Math.pow(r, 2);
        }
        else if (figura.equalsIgnoreCase("rectangle")){
            double a = 68.0;
            double b = 39.0;
            area = a * b;
        }
        else if (figura.equalsIgnoreCase("trapezi")){
            double a = 35.0;
            double b = 16.0;
            double h = 5.0;
            area = ((a*b)*h)/2;
        }
        else if (figura.equalsIgnoreCase("rombe")){
            double dM = 75.0;
            double dm = 30.0;
            area = (dM*dm)/2;
        }
        else if (figura.equalsIgnoreCase("paralelogram")){
            double b = 45.0;
            double h = 13.0;
            area = b*h;
        }
        else if (figura.equalsIgnoreCase("cercle")){
            Scanner s = new Scanner(System.in);
            System.out.println("Quin es el radi del cercle?");
            double r = s.nextDouble();
            area = Math.pow(r, 2)*Math.PI;
        }
    }
}

