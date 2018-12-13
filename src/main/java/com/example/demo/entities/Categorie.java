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
@Entity
public class Categorie implements Serializable {
	@Id 	@GeneratedValue
	private Long idCategorie;
   private String nom;
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie")
   private List <Sondage> sondage;
   @JoinColumn(referencedColumnName = "idUser")
	@ManyToOne(optional = false)
   protected Utilisateur utilisateur;
   
   
public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public List<Sondage> getSondage() {
	return sondage;
}
public void setSondage(List<Sondage> sondage) {
	this.sondage = sondage;
}
   
   
   
}
