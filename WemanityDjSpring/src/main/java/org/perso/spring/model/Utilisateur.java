package org.perso.spring.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Utilisateur extends Personne {
	
	private String login;
	private String motDePasse;
	@Autowired
	@Embedded
	private Loisir loisir;
	
	public Utilisateur(int id, String nom, String prenom, String login, String motDePasse,
			Loisir loisir) {
		super(id, nom, prenom);
		this.login = login;
		this.motDePasse = motDePasse;
		this.loisir = loisir;
	}

	public Utilisateur(String nom, String prenom, Loisir loisir) {
		super(nom, prenom);
		this.loisir = loisir;
	}

	public Utilisateur() {
		super();
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

	public Loisir getloisir() {
		return loisir;
	}

	public void setloisir(Loisir loisir) {
		this.loisir = loisir;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", motDePasse=" + motDePasse + ", loisir=" + loisir + "]";
	}

}
