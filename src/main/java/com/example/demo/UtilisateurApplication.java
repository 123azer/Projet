package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.UtilisateurRepository;
import com.example.demo.entities.Utilisateur;

@SpringBootApplication
public class UtilisateurApplication implements CommandLineRunner  {
	
	@Autowired
    private UtilisateurRepository utilisateurRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UtilisateurApplication.class, args);
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		/*DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		utilisateurRepository.save(new Utilisateur("badr", "el kantouri",df.parse("12/01/1999"),"badr@gmail.com",new Long(65098),"p1.jpg"));
		utilisateurRepository.save(new Utilisateur("amine", "el amrani",df.parse("12/08/1998"),"amine@gmail.com",new Long(65098),"p2.jpg"));
		utilisateurRepository.save(new Utilisateur("adil", "el taqi",df.parse("12/01/2000"),"adil@gmail.com",new Long(65098),"p3.jpg"));
		utilisateurRepository.findAll().forEach(c->{
      			System.out.println(c.getNom());
      		});*/
      		
	}
}
