package com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.model.Persona;
import com.challenge.service.PersonaService;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 */
@Controller
@RequestMapping(value="/challenge")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPersonaPage() {
		ModelAndView modelAndView = new ModelAndView("add-persona-form2");
		modelAndView.addObject("persona", new Persona());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingPersona(@ModelAttribute Persona persona) {
		
		ModelAndView modelAndView = new ModelAndView("home");

		personaService.addPersona(persona);
		
		String message = "Persona agregada con exito.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editPersonaPage(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView("edit-persona-form2");
		Persona persona = personaService.getPersona(id);
		modelAndView.addObject("persona",persona);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView edditingPersona(@ModelAttribute Persona persona, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		personaService.updatePersona(persona);
		
		String message = "Persona editada con exito.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deletePersona(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView("home");
		personaService.deletePersona(id);
		String message = "Persona eliminada con exito.";
		modelAndView.addObject("message", message);
		return modelAndView;
	} 
	
	@RequestMapping(value="/list")
	public ModelAndView listOfPersonas() {
		ModelAndView modelAndView = new ModelAndView("list-of-personas");
		
		List<Persona> personas = personaService.getPersonas();
		modelAndView.addObject("personas", personas);
		
		return modelAndView;
	}
}
