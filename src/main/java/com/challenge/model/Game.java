package com.challenge.model;

import java.io.Serializable;

import javax.persistence.*;

import com.challenge.model.PlayerOne;
import com.challenge.model.PlayerTwo;


/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * The persistent class for the game database table.
 * 
 */
@SuppressWarnings("serial")
@Entity
@NamedQuery(name="Game.findAll", query="SELECT g FROM Game g")
public class Game implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idgame;

	private String winner;

	//bi-directional many-to-one association to PlayerOne
	@ManyToOne
	@JoinColumn(name="idplayerone")
	private PlayerOne playerone;

	//bi-directional many-to-one association to PlayerTwo
	@ManyToOne
	@JoinColumn(name="idplatertwo")
	private PlayerTwo playertwo;

	public Game() {
	}

	public int getIdgame() {
		return this.idgame;
	}

	public void setIdgame(int idgame) {
		this.idgame = idgame;
	}

	public String getWinner() {
		return this.winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public PlayerOne getPlayerone() {
		return this.playerone;
	}

	public void setPlayerone(PlayerOne playerone) {
		this.playerone = playerone;
	}

	public PlayerTwo getPlayertwo() {
		return this.playertwo;
	}

	public void setPlayertwo(PlayerTwo playertwo) {
		this.playertwo = playertwo;
	}

}