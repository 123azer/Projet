package com.example.demo.entities;

public interface observable {
	
	   //methods to register and unregister observers
		public void ajouterObservateur(observateur obj);
		public void supprimerObservateur(observateur obj);
		
		//method to notify observers of change
		public void notifierObservateurs();
}
