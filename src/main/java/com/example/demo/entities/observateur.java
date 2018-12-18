package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
//@DiscriminatorValue("observateur")
public  class observateur extends Utilisateur implements Serializable {
	 
	@JoinColumn(referencedColumnName = "idUser")
	@ManyToOne
	protected observable observable;
	
	
	public observateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void actualiser(observable o) {
	}
}
