package org.perso.spring.dao;

import java.util.List;

import org.perso.spring.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudUtilisateurDao extends JpaRepository<Utilisateur, Integer>{

	List<Utilisateur> findAllUtilisateurByNom(String nom);
	
}
