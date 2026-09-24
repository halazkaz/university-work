package bagarre;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	public static void main() {
		Gaulois Jean_Eudes_Frederic_Claude_Clovis = new Gaulois("Jean- Eudes Frédéric Claude Clovis", 5);
		System.out.println(Jean_Eudes_Frederic_Claude_Clovis.toString());
		Jean_Eudes_Frederic_Claude_Clovis.parler("je vais terrasser tous les ennemis de la République !");
	}
}
