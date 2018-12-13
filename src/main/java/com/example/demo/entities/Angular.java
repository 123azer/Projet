package com.example.demo.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Angular extends Utilisateur implements observable,Serializable {
	@Id 	@GeneratedValue
	private Long id; 
	@Transient
	private List <observateur> observateurs;
	
	
	
	public Angular() {
		super();
	}

	public Angular(String nom, String prenom, Date dateNaissance, String email, Long tel, String photo) {
		super(nom, prenom, dateNaissance, email, tel, photo);
		// TODO Auto-generated constructor stub
	}

	public void ajouterSondage(Sondage sondage) {
		// le 1 er element il faut id la cat
		//this.getCategories().get(0).getSondage().add(sondage);
		notifierObservateurs();
	}
	
	public void supprimerSondage(Sondage sondage) {
		// le 1 er element il faut id la cat
		//this.getCategories().get(0).getSondage().remove(sondage);
		notifierObservateurs();
	}



	@Override
	public void ajouterObservateur(observateur obj) {
		observateurs.add(obj);
	}

	@Override
	public void supprimerObservateur(observateur obj) {
		observateurs.remove(obj);
	}

	@Override
	public void notifierObservateurs() {
		for (observateur obj : observateurs) {
			obj.actualiser(this);
		}
	}
	

}
