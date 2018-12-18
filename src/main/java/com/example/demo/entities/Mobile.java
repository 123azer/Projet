package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Mobile extends observateur implements Serializable { 
	
	
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
