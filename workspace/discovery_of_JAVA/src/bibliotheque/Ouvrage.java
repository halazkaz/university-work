package bibliotheque;

public class Ouvrage {
	
	private static final int NB_MAX_EXEMPLAIRES = 50;
	private Exemplaire[] lesExemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES];
	private String titre;
	private String auteur;
	private String editeur;
	private String isbn;
	private String prefixeCote;
	private int annee;
	private int nbExemplaires;
	private GenreLitteraire genreLitteraire;
	
	public Ouvrage(GenreLitteraire genreLitteraire, String titre, String auteur, String editeur, int annee, String isbn, String prefixeCote) {
		this.lesExemplaires= new Exemplaire[NB_MAX_EXEMPLAIRES];
		this.genreLitteraire = genreLitteraire;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.isbn = isbn;
		this.annee = annee;
		this.prefixeCote = prefixeCote;
	}
	
	public boolean ajouterExemplaire() {
		if (nbExemplaires < NB_MAX_EXEMPLAIRES) {
			lesExemplaires[nbExemplaires] = new Exemplaire(prefixeCote + "_" + (nbExemplaires + 1));
			nbExemplaires++;
			return true;
		}
		return false;
	}
	
	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public static int getNbMaxExemplaires() {
		return NB_MAX_EXEMPLAIRES;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getAnnee() {
		return annee;
	}
	
	public String getPrefixeCote() {
		return prefixeCote;
	}
	
	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur + ", isbn=" + isbn + ", annee="
				+ annee + ", nbExemplaires=" + nbExemplaires + "]";
	}

}
