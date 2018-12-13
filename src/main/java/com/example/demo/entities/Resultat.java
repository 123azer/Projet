package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Resultat implements observateurS,Serializable {
	@Id 	@GeneratedValue
	private Long idResultat;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resultat")
	private List <Avis> avis;
	@OneToOne(cascade = CascadeType.ALL)
	protected Sondage observable;
	
	public Resultat() {
		super();
	}

	@Override
	public void actualiser(observableS o) {
		if(o instanceof Sondage){
		observable=(Sondage) o;
		this.avis= observable.getAvis();
		}
	}
	
	public void afficherResultat() {
		if(avis!=null)
		 for(Avis a:avis) {
			if (a!=null)
			System.out.println(a.getMessage());
		}
	}

}
