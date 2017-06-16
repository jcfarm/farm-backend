package com.scujcc.farm.entity;

import javax.persistence.*;

/**
 * Created by David on 16/06/2017.
 */
@Entity
@Table(name = "sensors_water")
public class Sensors_Water {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "c")
	private double c;
	@Column(name = "pe")
	private double pe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getPe() {
		return pe;
	}

	public void setPe(double pe) {
		this.pe = pe;
	}
}
