package bagarre;

public class Chaudron {
	private int quantitePotion = 0;
	private int forcePotion = 0;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public int getQuantitePotion() {
		return quantitePotion;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}
	
	public void remplirChaudron(int quantite, int force) {
		quantitePotion += quantite;
		forcePotion = force;
	}
	
	public boolean restePotion() {
		return quantitePotion > 0;
	}
	
	public int prendreLouche() {
		if (!restePotion()) {
			System.out.println("Il ne reste plus de potion !");
			return 0;
		}
		quantitePotion -= 1;
		return 1;
	}
}
