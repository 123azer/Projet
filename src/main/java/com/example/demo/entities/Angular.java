package com.example.demo.entities;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Angular extends observable implements Serializable {
 
	
	public Angular() {
		super();
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
