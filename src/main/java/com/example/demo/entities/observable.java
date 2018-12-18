package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;

@Entity 
//@DiscriminatorValue("observable")
public  class observable extends Utilisateur  implements Serializable {
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "observable")
	protected List <observateur> observateurs=new ArrayList<observateur>();
	   
	public observable() {
		super();
		// TODO Auto-generated constructor stub
	}
		//methods to register and unregister observers
		public void ajouterObservateur(observateur obj) {
		}
		public void supprimerObservateur(observateur obj) {
		}
		
		//method to notify observers of change
		public void notifierObservateurs() {
		}
}
