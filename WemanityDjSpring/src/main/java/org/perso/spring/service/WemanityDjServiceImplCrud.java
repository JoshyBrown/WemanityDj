package org.perso.spring.service;

import java.util.List;

import org.perso.spring.dao.CrudUtilisateurDao;
import org.perso.spring.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

public class WemanityDjServiceImplCrud implements IWemanityDjService {

	@Autowired
	private CrudUtilisateurDao crudUtilisateurDao;
	
	@Override
	public void addUtilisateur(Utilisateur u) {
		crudUtilisateurDao.save(u);
	}

	@Override
	public List<Utilisateur> listUtilisateurs() {
		return crudUtilisateurDao.findAll();
	}

	@Override
	public void updateUtilisateur(Utilisateur u) {
		crudUtilisateurDao.save(u);
	}

	@Override
	public void deleteUtilisateur(int idUtilisateur) {
		crudUtilisateurDao.delete(idUtilisateur);
	}

}
