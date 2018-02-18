package org.perso.spring.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.perso.spring.config.ApplicationConfig;
import org.perso.spring.dao.CrudUtilisateurDao;
import org.perso.spring.model.Loisir;
import org.perso.spring.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ApplicationConfig.class})
public class UtilisateurServiceTest {

	@Autowired
	private CrudUtilisateurDao crudUtilisateurDao;
	
	@Test
	public void testUtilisateurService() {
		
		assertNotNull(crudUtilisateurDao);
		
		Loisir loisir = new Loisir("danse");
		Utilisateur utilisateur = new Utilisateur("Morane", "Bob", loisir);
		
		crudUtilisateurDao.save(utilisateur);
		List<Utilisateur> byNom = crudUtilisateurDao.findAllUtilisateurByNom("Morane");
		
		System.out.println(byNom);
		assertEquals(1, byNom.size());
		
	}
	
}
