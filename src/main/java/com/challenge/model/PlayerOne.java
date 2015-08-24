package com.challenge.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * The persistent class for the playerone database table.
 * 
 */
@SuppressWarnings("serial")
@Entity
@NamedQuery(name="PlayerOne.findAll", query="SELECT p FROM PlayerOne p")
public class PlayerOne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idplayerone;

	private String name;

	private String strategy;

	public PlayerOne() {
	}

	public int getIdplayerone() {
		return this.idplayerone;
	}

	public void setIdplayerone(int idplayerone) {
		this.idplayerone = idplayerone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}