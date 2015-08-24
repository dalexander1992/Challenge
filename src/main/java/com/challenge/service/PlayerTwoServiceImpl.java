package com.challenge.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dao.PlayerOneDAO;
import com.challenge.dao.PlayerTwoDAO;
import com.challenge.model.PlayerTwo;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Implementation Service PlayerTwo
 */
@Service
@Resource
public class PlayerTwoServiceImpl implements PlayerTwoService{
	@Autowired 
	private PlayerTwoDAO playerTwoDAO;
	@Override
	public void addPlayerTwo(PlayerTwo playerTwo) {
		playerTwoDAO.addPlayerTwo(playerTwo);		
	}

	@Override
	public void updatePlayerTwo(PlayerTwo playerTwo) {
		playerTwoDAO.updatePlayerTwo(playerTwo);
	}

	@Override
	public List<PlayerTwo> getPlayersTwo() {
		// TODO Auto-generated method stub
		return playerTwoDAO.getPlayersTwo();
	}

	@Override
	public PlayerTwo getPlayerTwo(Integer idPlayerTwo) {
		// TODO Auto-generated method stub
		return playerTwoDAO.getPlayerTwo(idPlayerTwo);
	}

	@Override
	public void deletePlayerOne(Integer idPlayerTwo) {
		// TODO Auto-generated method stub
		
	}
	

}
