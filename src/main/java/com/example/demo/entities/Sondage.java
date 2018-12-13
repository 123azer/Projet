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

@Entity
public class Sondage implements observableS,Serializable {
	@Id 	@GeneratedValue
	private Long idSondage;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sondage")
	private List <Avis> avis;
	@Transient
	private List <observateurS> observateurs;
	@JoinColumn(referencedColumnName = "idCategorie")
	@ManyToOne(optional = false)
	protected Categorie categorie;
	
	
	
	
	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}
	
	public void ajouterAvis(Avis avis) {
		this.avis.add(avis);
		notifierObservateurs();
	}
	
	public void supprimerAvis(Avis avis) {
		this.avis.remove(avis);
		notifierObservateurs();
	}
	

	public Sondage() {
		this.observateurs=new ArrayList<>();
		this.avis=new ArrayList<>();
	}

	@Override
	public void ajouterObservateur(observateurS obj) {
		observateurs.add(obj);
	}

	@Override
	public void supprimerObservateur(observateurS obj) {
		observateurs.remove(obj);
	}

	@Override
	public void notifierObservateurs() {
		for (observateurS obj : observateurs) {
			obj.actualiser(this);
		}
		
	}
	

}
