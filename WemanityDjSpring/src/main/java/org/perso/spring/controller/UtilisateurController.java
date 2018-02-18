package org.perso.spring.controller;

import java.util.List;

import org.perso.spring.dao.CrudUtilisateurDao;
import org.perso.spring.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UtilisateurController {

	@Autowired
	private CrudUtilisateurDao crudUtilisateurDao;
	
	@RequestMapping(value="/displayUtilisateurs", method=RequestMethod.GET)
	public ModelAndView listUtilisateurs() {
		
		List<Utilisateur> utilisateurs = crudUtilisateurDao.findAll();
		return new ModelAndView("displayUtilisateurs", "utilisateurs", utilisateurs);
	}
	
}
