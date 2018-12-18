package com.example.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.AvisRepository;
import com.example.demo.dao.CategorieRepository;
import com.example.demo.dao.MobileRepository;
import com.example.demo.dao.SondageRepository;
import com.example.demo.dao.UtilisateurRepository;
import com.example.demo.dao.observableRepository;
import com.example.demo.dao.observateurRepository;
import com.example.demo.entities.Avis;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Mobile;
import com.example.demo.entities.Sondage;
import com.example.demo.entities.Utilisateur;
import com.example.demo.entities.observable;
import com.example.demo.entities.observateur;

@SpringBootApplication
public class MicroPiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MicroPiApplication.class, args);
		UtilisateurRepository utilisateurRepository=ctx.getBean(UtilisateurRepository.class);
        
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Categorie cat = new Categorie();
			Utilisateur user =new Utilisateur("adil", "el taqi",df.parse("12/01/2000"),"adil@gmail.com",new Long(65098),"p3.jpg");
			
			user.setCategories(new ArrayList<>());
	       user.getCategories().add(cat);
	       cat.setUtilisateur(user);
			cat.setNom("categorie");
			utilisateurRepository.save(user);
			//MobileRepository mobile= ctx.getBean(MobileRepository.class);
			//mobile.save(new Mobile());
			//observateurRepository observateur= ctx.getBean(observateurRepository.class);
			//observateur.save(new observateur());
			CategorieRepository categorieRepository= ctx.getBean(CategorieRepository.class);
			
			Sondage a = new Sondage();
	        
			cat.setSondage(new ArrayList<>());
			cat.getSondage().add(a);
			a.setCategorie(cat);
			categorieRepository.save(cat);
			Avis av=new Avis("Avis1");
		//avisRepository.save(new );
		//avisRepository.save(new Avis("avis2"));
		//avisRepository.save(av);
			a.setAvis(new ArrayList<Avis>());
			a.getAvis().add(av);
			av.setSondage(a);
			SondageRepository sondageRepository= ctx.getBean(SondageRepository.class);
			sondageRepository.save(a);
			List <Sondage> l =sondageRepository.findAll();
		//	System.out.println(l.get(0).getAvis());		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

