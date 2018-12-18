package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CategorieRepository;

import com.example.demo.entities.Categorie;


@RestController
public class CategorieRestService {
	@Autowired
	private CategorieRepository categorieRepository;

	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public List <Categorie> getCategorie(){
		return categorieRepository.findAll();
	}

	@RequestMapping(value="/categories/{id}",method=RequestMethod.GET)
	public Categorie getCategorie(@PathVariable Long id){
		return categorieRepository.getOne(id);
	}

	@RequestMapping(value="/categories",method=RequestMethod.POST)
	public Categorie save(@RequestBody Categorie cat){
		return categorieRepository.save(cat);
	}

	@RequestMapping(value="/categories/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		categorieRepository.deleteById(id);
		 return true;
	}

	@RequestMapping(value="/categories/{id}",method=RequestMethod.PUT)
	public Categorie save(@PathVariable Long id,@RequestBody Categorie cat){
		//Contact c = contactRepository.findOne(id);
		//if(contact.getPhoto()==null)
		//	contact.setPhoto(c.getPhoto());
		cat.setIdCategorie(id);
		return categorieRepository.save(cat);
	}

	/*@RequestMapping(value="/cherchercontact",method=RequestMethod.GET)
	public Page<Categorie>  getContact(@RequestParam(name = "mc",defaultValue="")String mc
			,@RequestParam(name = "page",defaultValue="0")int page,
			@RequestParam(name = "size",defaultValue="5")int size){
		return categorieRepository.Chercher("%"+mc+"%", new PageRequest(page, size));
	}

*/
}
