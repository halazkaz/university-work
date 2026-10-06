package bagarre;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public int getEffetPotion() {
		return effetPotion;
	}
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom = " + nom + ", force = " + force + "]";
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = force / 3;
		romain.recevoirCoup(nom, forceCoup);
	}
	
	public void boirePotion() {
		Chaudron chaudron = new Chaudron(effetPotion, force);
		this.effetPotion = chaudron.getForcePotion();
	}
	
	public static void main() {
		Gaulois Jean_Eudes_Frederic_Claude_Clovis = new Gaulois("Jean-Eudes Frédéric Claude Clovis", 5);
		System.out.println(Jean_Eudes_Frederic_Claude_Clovis.toString());
		Jean_Eudes_Frederic_Claude_Clovis.parler("je vais terrasser tous les ennemis de la République !");
	}
}
