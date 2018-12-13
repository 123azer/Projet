package com.example.demo.entities;

public interface observableS {
	
	   //methods to register and unregister observers
		public void ajouterObservateur(observateurS obj);
		public void supprimerObservateur(observateurS obj);
		
		//method to notify observers of change
		public void notifierObservateurs();
}
