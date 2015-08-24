package com.challenge.service;

import java.util.List;

import com.challenge.model.PlayerTwo;
/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Interface Service PlayerTwo
 */
public interface PlayerTwoService {
	public void addPlayerTwo(PlayerTwo playerTwo);
	public void updatePlayerTwo(PlayerTwo playerTwo);
	public PlayerTwo getPlayerTwo(Integer idPlayerTwo);
	public void deletePlayerOne(Integer idPlayerTwo);
	public List<PlayerTwo> getPlayersTwo();
}
