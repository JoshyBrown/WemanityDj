package org.perso.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.perso.spring.dao.CrudUtilisateurDao;
import org.perso.spring.model.Loisir;
import org.perso.spring.model.Utilisateur;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class WemanityDjServiceImplCrud implements IWemanityDjService {
	private static final Logger LOGGER = LoggerFactory.getLogger(WemanityDjServiceImplCrud.class);

	@Autowired
	private CrudUtilisateurDao crudUtilisateurDao;
	
	@PostConstruct
	public void createSomeUtilisateur() {
		addUtilisateur(new Utilisateur("Jumeline", "Alexandre", new Loisir("Surf")));
		addUtilisateur(new Utilisateur("Florian", "Boyer", new Loisir("Poterie")));
	}
	
	@Override
	public void addUtilisateur(Utilisateur u) {
		crudUtilisateurDao.save(u);
	}

	@Override
	public List<Utilisateur> listUtilisateurs() {
		LOGGER.debug("lister utilisateurs");
		LOGGER.info("info");
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
