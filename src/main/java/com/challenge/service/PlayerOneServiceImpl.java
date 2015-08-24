package com.challenge.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dao.PlayerOneDAO;
import com.challenge.model.PlayerOne;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Implementation Service PlayerOne
 */
@Service
@Resource
public class PlayerOneServiceImpl implements PlayerOneService{

	@Autowired 
	private PlayerOneDAO playerOneDAO;
	@Override
	public void addPlayerOne(PlayerOne playerOne) {
		playerOneDAO.addPlayerOne(playerOne);
	}

	@Override
	public void updatePlayerOne(PlayerOne playerOne) {
		playerOneDAO.updatePlayerOne(playerOne);
	}

	@Override
	public PlayerOne getPlayerOne(Integer idPlayerOne) {
		return playerOneDAO.getPlayerOne(idPlayerOne);
	}

	@Override
	public void deletePlayerOne(Integer idPlayerOne) {
		playerOneDAO.deletePlayerOne(idPlayerOne);		
	}

	@Override
	public List<PlayerOne> getPlayersOne() {
		// TODO Auto-generated method stub
		return playerOneDAO.getPlayersOne();
	}

}
