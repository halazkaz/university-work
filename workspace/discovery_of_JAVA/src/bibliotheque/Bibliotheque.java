package bibliotheque;

import java.util.Arrays;

public class Bibliotheque {

	private int nbOuvrages = 0;
	private Ouvrage[] fonds;
	
	public Bibliotheque(int nbOuvragesMax) {
		fonds = new Ouvrage[nbOuvragesMax];
	}

	public int getNbOuvrages() {
		return nbOuvrages;
	}

	public Ouvrage[] getFonds() {
		return fonds;
	}
	
	public void setFonds(Ouvrage[] fonds) {
		this.fonds = fonds;
	}
	
	public boolean ajouterOuvrage(GenreLitteraire genreLitteraire, String titre, String auteur, String editeur, int annee, String isbn) {
		if(nbOuvrages < fonds.length) {
			fonds[nbOuvrages] = new Ouvrage(genreLitteraire, titre, auteur, editeur, annee, isbn, "/" + (nbOuvrages+1));
			System.out.println(fonds[nbOuvrages].toString());
			nbOuvrages++;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Bibliotheque [nbOuvrages=" + nbOuvrages + ", fonds=" + Arrays.toString(fonds) + "]";
	}
	
	public static void main(String[] args) {
		Bibliotheque maBibliotheque = new Bibliotheque(50);
		maBibliotheque.ajouterOuvrage(GenreLitteraire.S, "Beginning Software Engineering", "Rod Stephens", "wrox", 2015, "978-1-1118-969114-454500");
		Exemplaire bseAConsulter = new Exemplaire("C_BSE_1");
		System.out.println(bseAConsulter.toString());
		System.out.println(maBibliotheque.toString());
	}

}
