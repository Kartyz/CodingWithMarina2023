package UF2.notas;

import UF2.Prediccio.PrediccioPersona;

import java.util.Scanner;
public class TransformarNotaaParaula {

    private float nota = 0;

    public static void main (String[] args) {
        TransformarNotaaParaula programa = new TransformarNotaaParaula();
        programa.inici();
    }
    private void inici(){
        MostrarMenu();
        LlegirNota();

    }
    public void MostrarMenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix la teva nota");
        nota = s.nextFloat();
    }
    public void LlegirNota(){
        System.out.println("La teva nota final es");
        if((nota >=9 )&&(nota <= 10)){
            System.out.println("Excel·lent.");
        }
        else if((nota >= 6.5)&&(nota < 9)){
            System.out.println("Notable");
        }
        else if ((nota >= 5)&&(nota < 6.5)) {
            System.out.println("Aprovat.");
        }
        else if(nota <5){
                System.out.println("Suspes");
        }
        else{
            System.out.println("Has posat una dada incorrecta");
        }
    }
}
