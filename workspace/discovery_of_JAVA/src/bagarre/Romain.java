package bagarre;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main() {
		Romain rapistus = new Romain("Rapistus", 5);
		System.out.println(rapistus.toString());
		rapistus.parler("je suis prêt à battre le record de Jeffrey Epstein !");
	}

}
