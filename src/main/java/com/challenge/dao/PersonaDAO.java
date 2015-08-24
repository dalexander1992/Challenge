package com.challenge.dao;

import java.util.List;

import com.challenge.model.Persona;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 */
public interface PersonaDAO {
	
	public void addPersona(Persona persona);
	public void updatePersona(Persona persona);
	public Persona getPersona(String id);
	public void deletePersona(String id);
	public List<Persona> getPersonas();

}
