package UF2.Gestio;

import UF2.notas.RegistreNotes;

public class CalculInt {
    public static void main(String[] args) {
        RegistreNotes programa = new RegistreNotes();
        programa.inici();
    }
        public void inici(){
            int[] notes = {2,5,7,3,9,8,7,7};
            int max = calcularMaxim(notes);
            int min = calcularMinim(notes);
            int mitjana = calcularMitjana(notes);
            System.out.println("La nota màxima és " + max + ".");
            System.out.println("La nota mínima és " + min + ".");
            System.out.println("La mitjana de les notes és " + mitjana + ".");
        }
        public int calcularMaxim(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        }
        public int calcularMinim(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
        public int calcularMitjana(int[] array) {
            int suma = 0;
            for (int i = 0; i < array.length; i++) {
                suma = suma + array[i];
            }
            return suma/array.length;
        }
    }
