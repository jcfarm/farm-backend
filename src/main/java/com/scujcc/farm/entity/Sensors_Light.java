package com.scujcc.farm.entity;

import javax.persistence.*;

/**
 * Created by David on 16/06/2017.
 */
@Entity
@Table(name = "sensors_light")
public class Sensors_Light {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "c")
	private double c;
	@Column(name = "ph")
	private double ph;
	@Column(name = "lux")
	private int lux;

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

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public int getLux() {
		return lux;
	}

	public void setLux(int lux) {
		this.lux = lux;
	}
}
