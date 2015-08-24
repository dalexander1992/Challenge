package com.challenge.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * @author David A. Artavia Cerdas 
 * dalexander1992@gmail.com
 * 87872624
 * The persistent class for the playertwo database table.
 * 
 */
@SuppressWarnings("serial")
@Entity
@NamedQuery(name="PlayerTwo.findAll", query="SELECT p FROM PlayerTwo p")
public class PlayerTwo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idplayertwo;

	private String name;

	private String strategy;

	public PlayerTwo() {
	}

	public int getIdplayertwo() {
		return this.idplayertwo;
	}

	public void setIdplayertwo(int idplayertwo) {
		this.idplayertwo = idplayertwo;
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