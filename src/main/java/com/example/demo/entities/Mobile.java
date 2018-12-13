package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile extends Utilisateur implements observateur,Serializable {
	@Id 	@GeneratedValue
	private Long id; 
	@OneToOne(cascade = CascadeType.ALL)
	Angular observable;
	public Mobile() {
		super();
		
	}

	@Override
	public void actualiser(observable o) {
		if(o instanceof Angular){
		observable=(Angular) o;
		// le 1er element 
		//this.getCategories().get(0).setSondage(observable.getCategories().get(0).getSondage());
		}
	}

}
