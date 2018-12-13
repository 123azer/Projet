package com.example.demo.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Utilisateur implements Serializable{
	@Id 	@GeneratedValue
	private Long idUser; 
	private String nom;
	private String prenom;
	LocalDate date;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
    private String email;
    private Long tel;
    private String photo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private List <Categorie> categories;
    
    
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur (String nom, String prenom, Date dateNaissance, String email, Long tel, String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.tel = tel;
		this.photo = photo;
	}
	
	public Long getId() {
		return idUser;
	}
	public void setId(Long id) {
		this.idUser = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/*public List<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}*/
	@Override
	public String toString() {
		return "Contact [id=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", email=" + email + ", tel=" + tel + ", photo=" + photo + "]";
	}
    
    

}
