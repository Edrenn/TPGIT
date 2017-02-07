package core.Entities;

public class Droits {

	int niveau;
	int severite;
	String nom;
	String societe;
	
	public Droits(int niveau, int sévérité, String nom, String société) {
		super();
		this.niveau = niveau;
		this.severite = sévérité;
		this.nom = nom;
		this.societe = société;
	}


	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int getSeverite() {
		return severite;
	}
	public void setSeverite(int severite) {
		this.severite = severite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
}