package UF2.Recursivitat;

import java.util.Scanner;

public class Recursivitat{
	public static void main(String args[]) {
	    Recursivitat programa = new Recursivitat();
		inici();
	}

	public static void inici() {
		int x = leerDato();
		recursivitat(x);
	}

	public static int leerDato() {
		System.out.println("Quin número vols?");
		Scanner lec = new Scanner(System.in);
		int x = lec.nextInt();
		return x;
	}

	public static void recursivitat(int y) {
		if(y >= 1) {
			if (y % 2 == 0) {
				System.out.println("El nombre " + y + " és parell");
				//recursivitat(y - 1);
			} else {
				System.out.println("El nombre " + y + " és senar");
				//recursivitat(y - 1);
			}
			recursivitat(y-1);
		}
	}
}

