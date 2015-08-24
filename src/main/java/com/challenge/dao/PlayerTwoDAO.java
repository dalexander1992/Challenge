package com.challenge.dao;

import java.util.List;
/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Interface DAO PlayerTwo
 */
import com.challenge.model.PlayerTwo;

public interface PlayerTwoDAO {
	public void addPlayerTwo(PlayerTwo playerTwo);
	public void updatePlayerTwo(PlayerTwo playerTwo);
	public PlayerTwo getPlayerTwo(Integer idPlayerTwo);
	public void deletePlayerOne(Integer idPlayerTwo);
	public List<PlayerTwo> getPlayersTwo();
}
