package org.formacio.mvc;

import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {

	@Autowired
	AgendaService agenda;
	
	@RequestMapping(path="/nombre")
	@ResponseBody
	public int obtenirNombre() {
		int num = agenda.nombreContactes();
		return num;
	}
	
	@RequestMapping(path="/telefon")
	@ResponseBody
	public String obtenirTelefon(String id) {
		String numTelef = agenda.recupera(id).getTelefon();
		return numTelef;
	}
	
	@RequestMapping(path="/contacte/{id}", produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public Persona obtenirContacte(@PathVariable String id) {
		Persona personita = agenda.recupera(id);
		return personita;
	}
	
	
}
