package com.example.demo.entities;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Sondage implements Serializable {
	@Id 	@GeneratedValue
	private Long idSondage;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sondage")
	private List <Avis> avis;
	 
	@JoinColumn(referencedColumnName = "idCategorie")
	@ManyToOne
	@JsonIgnore
	protected Categorie categorie;
	
	
	
	
	
	public Sondage(List<Avis> avis, Categorie categorie) {
		super();
		this.avis = avis;
		this.categorie = categorie;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}
	
	public void ajouterAvis(Avis avis) {
		this.avis.add(avis);
	
	}
	
	public void supprimerAvis(Avis avis) {
		this.avis.remove(avis);
	
	}
	

	public Sondage() {
		
		this.avis=new ArrayList<>();
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
	

}
