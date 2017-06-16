package com.scujcc.farm.entity;

import javax.persistence.*;

/**
 * Created by David on 16/06/2017.
 */
@Entity
@Table(name = "field")
public class Field {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "temp")
	private int temp;
	@Column(name = "humidity")
	private int humidity;
	@Column(name = "ph")
	private int ph;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPh() {
		return ph;
	}

	public void setPh(int ph) {
		this.ph = ph;
	}
}
