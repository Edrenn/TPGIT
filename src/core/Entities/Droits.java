package core.Entities;
import core.JsonManager;

public class Droits {

	int niveau;
	int severite;
	String nom;
	String societe;
	
	public Droits(int niveau, int severite, String nom, String societe) {
		super();
		this.niveau = niveau;
		this.severite = severite;
		this.nom = nom;
		this.societe = societe;
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


	@Override
	public String toString() {
		JsonManager jsonmanager = JsonManager.getInstance();
		jsonmanager.addItem("Droits [niveau=" + niveau + ", severite=" + severite + ", nom=" + nom + ", societe=" + societe + "]");
		return jsonmanager.toJSON();
	}
	
	
	
	
}