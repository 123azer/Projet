package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UtilisateurRepository;
import com.example.demo.entities.Utilisateur;

@RestController
public class UtilisateurRestService {
@Autowired
private UtilisateurRepository utilisateurRepository;

@RequestMapping(value="/user",method=RequestMethod.GET)
public List <Utilisateur> getContact(){
	return utilisateurRepository.findAll();
}

@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
public Utilisateur getContact(@PathVariable Long id){
	return utilisateurRepository.getOne(id);
}

@RequestMapping(value="/user",method=RequestMethod.POST)
public Utilisateur save(@RequestBody Utilisateur user){
	return utilisateurRepository.save(user);
}

@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
public boolean supprimer(@PathVariable Long id){
	utilisateurRepository.deleteById(id);
	 return true;
}

@RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
public Utilisateur save(@PathVariable Long id,@RequestBody Utilisateur user){
	//Contact c = contactRepository.findOne(id);
	//if(contact.getPhoto()==null)
	//	contact.setPhoto(c.getPhoto());
	user.setId(id);
	return utilisateurRepository.save(user);
}

@RequestMapping(value="/chercheruser",method=RequestMethod.GET)
public Page<Utilisateur>  getContact(@RequestParam(name = "mc",defaultValue="")String mc
		,@RequestParam(name = "page",defaultValue="0")int page,
		@RequestParam(name = "size",defaultValue="5")int size){
	return utilisateurRepository.Chercher("%"+mc+"%", new PageRequest(page, size));
}

}
