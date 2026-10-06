package bagarre;

public class Druide {
	private String nom;
	private int force;
	Chaudron chaudron = new Chaudron(0, 0);

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}	
	
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		parler("J'ai concocté " + quantite + " potions qui a une force de " + force);
		chaudron.remplirChaudron(quantite, forcePotion);
	}

	public void booster(Gaulois gaulois) {
		if (!chaudron.restePotion()) {
			System.out.println("il ne reste plus de potion !!");
			gaulois.setForce(0);
			return;
		}
		int forceGaulois = gaulois.getForce();
		int forcePotion = chaudron.getForcePotion();
		parler("Tiens" + gaulois.getNom() + "un peu de potion magique");
		int louche = chaudron.prendreLouche();
		gaulois.setForce(forceGaulois * forcePotion * louche);
	}
}
