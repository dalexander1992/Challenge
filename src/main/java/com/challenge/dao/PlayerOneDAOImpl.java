package com.challenge.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.challenge.model.PlayerOne;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Implementation of PlayerOneDAO 
 */
@Repository
public class PlayerOneDAOImpl implements PlayerOneDAO{
	
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
	/*
	 * Method to add a PlayerOne Object 
	 * @see com.challenge.dao.PlayerOneDAO#addPlayerOne(com.challenge.model.PlayerOne)
	 */
	@Override
	public void addPlayerOne(PlayerOne playerOne) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(playerOne);
		session.getTransaction().commit();
		session.close();
	}

	/*
	 * Method to update the PlayerOne Object data
	 * @see com.challenge.dao.PlayerOneDAO#updatePlayerOne(com.challenge.model.PlayerOne)
	 */
	@Override
	public void updatePlayerOne(PlayerOne playerOne) {
		Session session = sessionFactory.openSession();
		PlayerOne playerOneToUpdate = getPlayerOne(playerOne.getIdplayerone());
		playerOneToUpdate.setName(playerOne.getName());
		playerOneToUpdate.setStrategy(playerOne.getStrategy());
		session.beginTransaction();
		session.update(playerOneToUpdate);
		session.getTransaction().commit();
		session.close();	
	}

	/*
	 * Method to findByID a specific PlayerOne Object
	 * @see com.challenge.dao.PlayerOneDAO#getPlayerOne(java.lang.Long)
	 */
	@Override
	public PlayerOne getPlayerOne(Integer idPlayerOne) {
		PlayerOne playerOne = (PlayerOne) getCurrentSession().get(PlayerOne.class,idPlayerOne);
		return playerOne;
	}

	/*
	 * Method to Delete a specific PlayerOne Object
	 * @see com.challenge.dao.PlayerOneDAO#getPlayerOne(java.lang.Long)
	 */
	@Override
	public void deletePlayerOne(Integer idPlayerOne) {
		Session session = sessionFactory.openSession();
		PlayerOne playerOne = getPlayerOne(idPlayerOne);
		session.beginTransaction();
		session.delete(playerOne);
		session.getTransaction().commit();
		session.close();		
	}

	/*
	 * Method to findAll PlayeOne Objects 
	 * @see com.challenge.dao.PlayerOneDAO#getPlayersOne()
	 */
	@Override
	public List<PlayerOne> getPlayersOne() {
		return getCurrentSession().createQuery("from com.challenge.model.PlayerOne").list();
	}

}
