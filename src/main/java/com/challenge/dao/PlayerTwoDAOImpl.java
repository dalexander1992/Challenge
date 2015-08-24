package com.challenge.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.challenge.model.PlayerOne;
import com.challenge.model.PlayerTwo;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Implementation of PlayerTwoDAO 
 */
@Repository
public class PlayerTwoDAOImpl implements PlayerTwoDAO{

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
	 * Method to add a PlayerTwo Object 
	 * @see com.challenge.dao.PlayerTwoDAO#addPlayerTwo(com.challenge.model.PlayerTwo)
	 */
	@Override
	public void addPlayerTwo(PlayerTwo playerTwo) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(playerTwo);
		session.getTransaction().commit();
		session.close();		
	}

	/*
	 * Method to update the PlayerTwo Object data
	 * @see com.challenge.dao.PlayerTwoDAO#updatePlayerTwo(com.challenge.model.PlayerTwo)
	 */
	@Override
	public void updatePlayerTwo(PlayerTwo playerTwo) {
		Session session = sessionFactory.openSession();
		PlayerTwo playerTwoToUpdate = getPlayerTwo(playerTwo.getIdplayertwo());
		playerTwoToUpdate.setName(playerTwo.getName());
		playerTwoToUpdate.setStrategy(playerTwo.getStrategy());
		session.beginTransaction();
		session.update(playerTwoToUpdate);
		session.getTransaction().commit();
		session.close();	
		
	}
	/*
	 * Method to findByID a specific PlayerTwo Object
	 * @see com.challenge.dao.PlayerTwoDAO#getPlayerTwo(java.lang.Long)
	 */
	@Override
	public PlayerTwo getPlayerTwo(Integer idPlayerTwo) {
		// TODO Auto-generated method stub
		PlayerTwo playerTwo = (PlayerTwo) getCurrentSession().get(PlayerOne.class,idPlayerTwo);
		return playerTwo;
	}

	/*
	 * Method to Delete a specific PlayerTwo Object
	 * @see com.challenge.dao.PlayerTwoDAO#deletePlayerOne(java.lang.Long)
	 */
	@Override
	public void deletePlayerOne(Integer idPlayerTwo) {
		Session session = sessionFactory.openSession();
		PlayerTwo playerTwo = getPlayerTwo(idPlayerTwo);
		session.beginTransaction();
		session.delete(playerTwo);
		session.getTransaction().commit();
		session.close();
		
	}

	/*
	 * Method to findAll PlayerTwo Objects
	 * @see com.challenge.dao.PlayerTwoDAO#getPlayersTwo()
	 */
	@Override
	public List<PlayerTwo> getPlayersTwo() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from com.challenge.model.PlayerTwo").list();
	}

}
