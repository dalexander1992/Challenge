package com.challenge.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.challenge.model.Persona;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 */
@Repository
public class PersonaDAOImpl implements PersonaDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
		
		Session session = null;
	    try { 
	        session = sessionFactory.getCurrentSession();
	    } catch ( HibernateException he ) {
	        session = sessionFactory.openSession();
	    }
	    return session;
	}
	@Override
	public void addPersona(Persona persona) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updatePersona(Persona persona) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Persona personaToUpdate = getPersona(persona.getId());
		personaToUpdate.setNombre(persona.getNombre());
		personaToUpdate.setApellidos(persona.getApellidos());
		personaToUpdate.setTelefono(persona.getTelefono());
		personaToUpdate.setDireccion(persona.getDireccion());
		personaToUpdate.setCorreo(persona.getCorreo());
		session.beginTransaction();
		session.update(personaToUpdate);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Persona getPersona(String id) {
		// TODO Auto-generated method stub
		Persona persona = (Persona) getCurrentSession().get(Persona.class,id);
		return persona;
	}

	@Override
	public void deletePersona(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Persona persona = getPersona(id);
		session.beginTransaction();
		session.delete(persona);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Persona> getPersonas() {
		return getCurrentSession().createQuery("from com.challenge.model.Persona").list();

	}
	

}
