package UF2.notas;

public class Main {
    public static void main(String[] args) {
         RegistreNotes s = new RegistreNotes();
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double max = s.calcularMaxim(notes);
        double min = s.calcularMinim(notes);
        double mitjana = s.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}
