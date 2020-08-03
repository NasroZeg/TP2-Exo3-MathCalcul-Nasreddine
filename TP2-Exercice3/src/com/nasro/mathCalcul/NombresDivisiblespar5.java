package com.nasro.mathCalcul;

public class NombresDivisiblespar5 {

	public static void main(String[] args) {
		// Initialisation.
		String Collect = "";
		System.out.print("Les nombres de 1 à 100 qui sont divisibles par 5 sont: ");
		for (int i = 1; i < 101; i++) {
			// Vérifier si le nombre est divisible par 5
			if (i % 5 == 0) {
				// Incrémentation et affectation
				Collect = Collect + "  " + i;
			}
		}
		// Affichage le resultat.
		System.out.println(" " + Collect);
	}
}
