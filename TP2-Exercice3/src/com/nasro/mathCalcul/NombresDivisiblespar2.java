package com.nasro.mathCalcul;

public class NombresDivisiblespar2 {

	public static void main(String[] args) {
		// Initialisation.
		String Collect = "";
		System.out.print("Les nombres de 1 � 100 qui sont divisibles par 5 sont: ");
		for (int i = 1; i < 101; i++) {
			// V�rifier si le nombre est divisible par 5
			if (i % 2 == 0) {
				// Incr�mentation et affectation
				Collect = Collect + "  " + i;
			}
		}
		// Affichage le resultat.
		System.out.println(" " + Collect);
	}
}
