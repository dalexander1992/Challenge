package com.challenge.dao;

import java.util.List;

import com.challenge.model.Game;
/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 */
public interface GameDAO {
	public void addGame(Game game);
	public void updateGame(Game game);
	public Game getGame(Integer id);
	public void deleteGame(Integer id);
	public List<Game> getGames();
}
