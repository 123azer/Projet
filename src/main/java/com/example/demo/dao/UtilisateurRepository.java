package com.example.demo.dao;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Utilisateur;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	@Query("select c from Utilisateur c where c.nom like :x")
	public Page<Utilisateur> Chercher(@Param("x") String mc,Pageable pageable);
}
