package com.scujcc.farm.util;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by David on 16/06/2017.
 */
@Component
public class Sensors {
	private List light;
	private List co2;
	private List water;
	private List salt;

	public List getLight() {
		return light;
	}

	public void setLight(List light) {
		this.light = light;
	}

	public List getCo2() {
		return co2;
	}

	public void setCo2(List co2) {
		this.co2 = co2;
	}

	public List getWater() {
		return water;
	}

	public void setWater(List water) {
		this.water = water;
	}

	public List getSalt() {
		return salt;
	}

	public void setSalt(List salt) {
		this.salt = salt;
	}
}
