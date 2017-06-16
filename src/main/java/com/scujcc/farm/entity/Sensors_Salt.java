package com.scujcc.farm.entity;

import javax.persistence.*;

/**
 * Created by David on 16/06/2017.
 */
@Entity
@Table(name = "sensors_salt")
public class Sensors_Salt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "us")
	private int us;
	@Column(name = "mg")
	private int mg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUs() {
		return us;
	}

	public void setUs(int us) {
		this.us = us;
	}

	public int getMg() {
		return mg;
	}

	public void setMg(int mg) {
		this.mg = mg;
	}
}
