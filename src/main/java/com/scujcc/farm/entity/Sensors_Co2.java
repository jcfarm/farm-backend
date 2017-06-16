package com.scujcc.farm.entity;

import javax.persistence.*;

/**
 * Created by David on 16/06/2017.
 */
@Entity
@Table(name = "sensors_co2")
public class Sensors_Co2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "c")
	private double c;
	@Column(name = "ph")
	private double ph;
	@Column(name = "co2")
	private int co2;

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

	public int getCo2() {
		return co2;
	}

	public void setCo2(int co2) {
		this.co2 = co2;
	}
}
