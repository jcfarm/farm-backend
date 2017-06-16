package com.scujcc.farm.util;

import org.springframework.stereotype.Component;

/**
 * Created by David on 16/06/2017.
 */
@Component
public class MqttJson {
	private int id;
	private Sensors sensors;
	private Controls controls;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sensors getSensors() {
		return sensors;
	}

	public void setSensors(Sensors sensors) {
		this.sensors = sensors;
	}

	public Controls getControls() {
		return controls;
	}

	public void setControls(Controls controls) {
		this.controls = controls;
	}
}
