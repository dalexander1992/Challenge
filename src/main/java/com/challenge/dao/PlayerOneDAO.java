package com.challenge.dao;

import java.util.List;

import com.challenge.model.PlayerOne;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Interface DAO PlayerOne
 */
public interface PlayerOneDAO {
	public void addPlayerOne(PlayerOne playerOne);
	public void updatePlayerOne(PlayerOne playerOne);
	public PlayerOne getPlayerOne(Integer idPlayerOne);
	public void deletePlayerOne(Integer idPlayerOne);
	public List<PlayerOne> getPlayersOne();

}
