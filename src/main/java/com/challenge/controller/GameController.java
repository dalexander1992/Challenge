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

import com.challenge.model.Game;
import com.challenge.service.GameService;

/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * Controller for the Class PlayerOne
 */
@RestController
@RequestMapping(value="/challenge")
public class GameController {
	@Autowired
	private GameService gameService;
	
	@RequestMapping(value = "/game/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> findAll(){
		List<Game> gamesList = gameService.getGames();	
		return new ResponseEntity<List<Game>>(gamesList, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/game/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> findById(@PathVariable final Integer id){
		Game game = gameService.getGame(id);
		return new ResponseEntity<Game>(game, HttpStatus.OK);
	}
	
	@RequestMapping(value="/game", method= {RequestMethod.POST,RequestMethod.PUT})
	public ResponseEntity<?> saveGame(@RequestBody final Game game, HttpServletResponse response){
		try {
			gameService.addGame(game);
		} catch (Exception e) {
			e.printStackTrace();
		}
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		return new ResponseEntity<Game>(HttpStatus.OK);		
	}
}
