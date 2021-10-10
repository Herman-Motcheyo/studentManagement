package com.herman.etudiant.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.herman.etudiant.repository.EtudiantRepository;

@Controller
@RequestMapping(value = "/etudiant")
public class EtudiantController {
	
	@Autowired
	private EtudiantRepository etudiantRepository ; 
    
	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	public String index() {
		return "etudiants";
	}
}
