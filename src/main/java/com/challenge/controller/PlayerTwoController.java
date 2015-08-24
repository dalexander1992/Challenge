package com.challenge.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.PlayerOne;
import com.challenge.model.PlayerTwo;
import com.challenge.service.PlayerTwoService;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Controller for the Class PlayerTwo
 */
@RestController
@RequestMapping(value="/challenge")
public class PlayerTwoController {
	@Autowired
	private PlayerTwoService playerTwoService;
	
	@RequestMapping(value = "/playertwo/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> findAll(){
		List<PlayerTwo> playersTwoList = playerTwoService.getPlayersTwo();	
		return new ResponseEntity<List<PlayerTwo>>(playersTwoList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/playertwo/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> findById(@PathVariable final Integer id){
		PlayerTwo playerTwo = playerTwoService.getPlayerTwo(id);
		return new ResponseEntity<PlayerTwo>(playerTwo, HttpStatus.OK);
	}
	
	@RequestMapping(value="/playertwo", method= {RequestMethod.POST,RequestMethod.PUT})
	public ResponseEntity<?> savePlayerTwo(@RequestBody final PlayerTwo playerTwo, HttpServletResponse response){
		try {
			playerTwoService.addPlayerTwo(playerTwo);
		} catch (Exception e) {
			e.printStackTrace();
		}
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		return new ResponseEntity<PlayerOne>(HttpStatus.OK);		
	}

}
