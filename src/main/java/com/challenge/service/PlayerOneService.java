package com.challenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.challenge.model.PlayerOne;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Interface Service PlayerOne
 */

public interface PlayerOneService {

	public void addPlayerOne(PlayerOne playerOne);
	public void updatePlayerOne(PlayerOne playerOne);
	public PlayerOne getPlayerOne(Integer idPlayerOne);
	public void deletePlayerOne(Integer idPlayerOne);
	public List<PlayerOne> getPlayersOne();
}
