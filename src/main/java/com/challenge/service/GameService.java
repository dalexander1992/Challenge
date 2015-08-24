package com.challenge.service;

import java.util.List;

import com.challenge.model.Game;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 */
public interface GameService {
	public void addGame(Game game);
	public void updateGame(Game game);
	public Game getGame(Integer id);
	public void deleteGame(Integer id);
	public List<Game> getGames();
}
