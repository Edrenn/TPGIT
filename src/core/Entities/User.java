package core.Entities;

import java.util.ArrayList;
import core.JsonManager;

public class User {
	String nom;
	String prenom;
	String login;
	String motDePasse;
	int numerodEmployeUnique;
	ArrayList<Droits> droits = new ArrayList();
	
	public User() {
	} 

	public User(String nom, String prenom, String login, String motDePasse, ArrayList<Droits> droits, int numerodEmployeUnique) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.droits = droits;
		this.numerodEmployeUnique = numerodEmployeUnique;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public void User() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", numerodEmployeUnique="
				+ numerodEmployeUnique + ", droits=" + droits + "]";
	}

	public String toJson() {
		JsonManager jsonmanager = JsonManager.getInstance();
		jsonmanager.addItem("User [nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", numerodEmployeUnique="
				+ numerodEmployeUnique + ", droits=" + droits + "]");
		
		return jsonmanager.toJSON();
	}

	public void User(String nom,String prenom,String login,String motDePasse){
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.login = login;
		
	}

	
}
