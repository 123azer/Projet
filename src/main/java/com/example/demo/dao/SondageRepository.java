package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Sondage;


public interface SondageRepository extends JpaRepository<Sondage, Long> {
	

}
