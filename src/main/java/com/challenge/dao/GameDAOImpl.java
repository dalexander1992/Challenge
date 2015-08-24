package com.challenge.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.challenge.model.Game;
import com.challenge.model.PlayerTwo;
import com.challenge.service.GameService;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Implementation Service Game
 */
@Repository
public class GameDAOImpl implements GameService{
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
	 * Method to add a Game Object 
	 * @see com.challenge.service.GameService#addGame(com.challenge.model.Game)
	 */
	@Override
	public void addGame(Game game) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(game);
		session.getTransaction().commit();
		session.close();	
	}

	/*
	 * Method to update Game
	 * @see com.challenge.service.GameService#updateGame(com.challenge.model.Game)
	 */
	@Override
	public void updateGame(Game game) {
		Session session = sessionFactory.openSession();
		Game gameToUpdate = getGame(game.getIdgame());
		gameToUpdate.setPlayerone(game.getPlayerone());
		gameToUpdate.setPlayertwo(game.getPlayertwo());
		gameToUpdate.setWinner(game.getWinner());
		session.beginTransaction();
		session.update(gameToUpdate);
		session.getTransaction().commit();
		session.close();	
	}

	/*
	 *  Method to findByID a specific Game Object
	 * @see com.challenge.service.GameService#getGame(java.lang.Integer)
	 */
	@Override
	public Game getGame(Integer id) {
		Game game = (Game) getCurrentSession().get(Game.class, id);
		return game;
	}

	@Override
	public void deleteGame(Integer id) {
		Session session = sessionFactory.openSession();
		Game game = getGame(id);
		session.beginTransaction();
		session.delete(game);
		session.getTransaction().commit();
		session.close();
		
	}

	/*
	 * Method to findAll Game Objects
	 * @see com.challenge.service.GameService#getGames()
	 */
	@Override
	public List<Game> getGames() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from com.challenge.model.Game").list();
	}

}
