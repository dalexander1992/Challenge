package com.challenge.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dao.PersonaDAO;
import com.challenge.model.Persona;
/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 */
@Service
@Resource
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaDAO personaDAO;

	@Override
	public void addPersona(Persona persona) {
		// TODO Auto-generated method stub
		personaDAO.addPersona(persona);
	}

	@Override
	public void updatePersona(Persona persona) {
		// TODO Auto-generated method stub
		personaDAO.updatePersona(persona);
	}

	@Override
	public Persona getPersona(String id) {
		// TODO Auto-generated method stub
		return	personaDAO.getPersona(id);
	}

	@Override
	public void deletePersona(String id) {
		// TODO Auto-generated method stub
		 personaDAO.deletePersona(id);
	}

	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		return personaDAO.getPersonas();
	}
	

}
