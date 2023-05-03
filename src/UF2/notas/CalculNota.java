package UF2.notas;


import java.util.Scanner;

public class CalculNota {

    private int max = 0;
    private int min = 0;
    private int mitjana = 0;
    private int llistanum[] = new int[5];
    private int suma = 0;
    private int i= 0;

    public static void main(String[]args){

            CalculNota programa = new CalculNota();
            programa.inici();
    }
    public void inici(){
        mostrarMenu();
        llegirDades();
        calculaMax();
        calculaMin();
        calculaMitj();
        Imprimir();
    }
    public void mostrarMenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Escriu 5 valors reals");
        //te enseña el array
        for (int  i =0; i < llistanum.length; i++){
            llistanum[i] = s.nextInt();
            //te enseña el array
        }
    }
    public void llegirDades(){
        System.out.println("Ara et direm la nota mitjana, la maxima i la minima");
    }
    public void calculaMax(){
        for(int i = 0; i < llistanum.length; i++){
            if(llistanum[i] > max){
                max = llistanum[i];
            }
        }
    }
    public void calculaMin(){
        min = llistanum[0];
        for(int i = 1; i < llistanum.length; i++){
            if(llistanum[i] < min){
                min = llistanum[i];
            }
        }
    }
    public void calculaMitj(){
    suma=(llistanum[0] + llistanum[1] +llistanum[2] +llistanum[3] + llistanum[4]);
    mitjana= (suma/5);

    }
    public void Imprimir(){
    System.out.println("La mitjana es " + mitjana +".");
    System.out.println("La nota max es " + max +".");
    System.out.println("La nota min es " + min +".");
    }
}
