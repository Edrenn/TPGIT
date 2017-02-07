package core.Entities;

import java.util.ArrayList;

public class User {
	String nom;
	String prenom;
	String login;
	String motDePasse;
	ArrayList<Droits> droits = new ArrayList();
	
	public User() {
	} 

	public User(String nom, String prenom, String login, String motDePasse, ArrayList<Droits> droits) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.droits = droits;
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
	
	public void User(String nom,String prenom,String login,String motDePasse){
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.login = login;
		
	}

	
}
