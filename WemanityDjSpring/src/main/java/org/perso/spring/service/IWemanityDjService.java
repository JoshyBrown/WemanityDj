package org.perso.spring.service;

import java.util.List;

import org.perso.spring.model.Utilisateur;

public interface IWemanityDjService {
	
	public void addUtilisateur(Utilisateur u);
	public List<Utilisateur> listUtilisateurs();
	public void updateUtilisateur(Utilisateur u);
	public void deleteUtilisateur(int idUtilisateur);
	
}
