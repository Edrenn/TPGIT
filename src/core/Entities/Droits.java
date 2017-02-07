package core.Entities;

public class Droits {

	int niveau;
	int sévérité;
	String nom;
	String société;
	
	public Droits(int niveau, int sévérité, String nom, String société) {
		super();
		this.niveau = niveau;
		this.sévérité = sévérité;
		this.nom = nom;
		this.société = société;
	}


	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public int getSévérité() {
		return sévérité;
	}
	public void setSévérité(String sévérité) {
		this.sévérité = sévérité;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSociété() {
		return société;
	}
	public void setSociété(String société) {
		this.société = société;
	}
}