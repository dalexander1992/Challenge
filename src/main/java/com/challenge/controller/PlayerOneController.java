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
import com.challenge.service.PlayerOneService;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Controller for the Class PlayerOne
 */
@RestController
@RequestMapping(value="/challenge")
public class PlayerOneController {
	@Autowired
	private PlayerOneService playerOneService;
	
	@RequestMapping(value = "/playerone/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> findAll(){
		List<PlayerOne> playersOneList = playerOneService.getPlayersOne();	
		return new ResponseEntity<List<PlayerOne>>(playersOneList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/playerone/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> findById(@PathVariable final Integer id){
		PlayerOne playerOne = playerOneService.getPlayerOne(id);
		return new ResponseEntity<PlayerOne>(playerOne, HttpStatus.OK);
	}
	
	@RequestMapping(value="/playerone", method= {RequestMethod.POST,RequestMethod.PUT})
	public ResponseEntity<?> savePlayerOne(@RequestBody final PlayerOne playerOne, HttpServletResponse response){
		try {
			playerOneService.addPlayerOne(playerOne);
		} catch (Exception e) {
			e.printStackTrace();
		}
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		return new ResponseEntity<PlayerOne>(HttpStatus.OK);		
	}

}
