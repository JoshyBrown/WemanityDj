package org.perso.spring.lanceur;

import org.perso.spring.config.ApplicationConfig;
import org.perso.spring.model.Loisir;
import org.perso.spring.model.Utilisateur;
import org.perso.spring.service.IWemanityDjService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lanceur {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		IWemanityDjService service = context.getBean("service", IWemanityDjService.class);
		service.listUtilisateurs();
		service.addUtilisateur(new Utilisateur("Jumeline", "Alexandre", new Loisir("Surf")));
		service.addUtilisateur(new Utilisateur("Florian", "Boyer", new Loisir("Poterie")));
		
		System.out.println("mon test standard" + service.listUtilisateurs());
		
		((ConfigurableApplicationContext)(context)).close();
		
	}

}
