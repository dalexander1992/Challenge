package com.challenge.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dao.GameDAO;
import com.challenge.model.Game;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Implementation Service Game
 */
@Service
@Resource
public class GameServiceImpl implements GameService{

	@Autowired 
	private GameDAO gameDAO;
	
	@Override
	public void addGame(Game game) {
		gameDAO.addGame(game);
	}

	@Override
	public void updateGame(Game game) {
		gameDAO.updateGame(game);
	}

	@Override
	public Game getGame(Integer id) {
		return gameDAO.getGame(id);
	}

	@Override
	public void deleteGame(Integer id) {
		gameDAO.deleteGame(id);
	}

	@Override
	public List<Game> getGames() {
		return gameDAO.getGames();
	}

}
