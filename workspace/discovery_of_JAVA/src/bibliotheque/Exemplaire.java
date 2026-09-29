package bibliotheque;

public class Exemplaire {

	public String cote;
	public boolean empruntable = true;
	public boolean enLigne = true;
	
	public String getCote() {
		return cote;
	}
	
	public boolean isEmpruntable() {
		return empruntable;
	}

	public boolean isEnLigne() {
		return enLigne;
	}
	
	@Override
	public String toString() {
		return "Exemplaire [cote=" + cote + ", empruntable=" + empruntable + ", enLigne=" + enLigne + "]";
	}
	
	public Exemplaire(String cote) {
		this.cote = cote;
	}

}
