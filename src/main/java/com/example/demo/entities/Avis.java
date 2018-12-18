package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Avis implements Serializable {
	@Id 	@GeneratedValue
	private Long idAvis;
	private String message;
	 
	@JoinColumn(referencedColumnName = "idSondage")
	@ManyToOne
	@JsonIgnore
	protected Sondage sondage;

	
	
	public Avis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avis(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Sondage getSondage() {
		return sondage;
	}

	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}
	
	
	

}
