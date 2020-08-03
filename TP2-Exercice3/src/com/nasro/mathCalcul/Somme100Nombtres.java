package com.nasro.mathCalcul;

public class Somme100Nombtres {

	public static void main(String[] args) {
		// Initialisation.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			// Incrémentation et affectation
			sum = sum + i;
		}
		// Affichage le resultat.
		System.out.println("La somme des 100 premiers nombres: " + sum);
	}

}
