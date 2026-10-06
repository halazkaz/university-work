package tests;

import bagarre.Gaulois;
import bagarre.Romain;

public class TestGaulois {
	
	public static void main() {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix, Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("oui très bonne idée");
		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Minus.");
		while(minus.getForce() >= 1) {
			asterix.frapper(minus);
		}
	}
}
