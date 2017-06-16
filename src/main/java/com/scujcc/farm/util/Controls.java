package com.scujcc.farm.util;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by David on 16/06/2017.
 */
@Component
public class Controls {
	private List blower;
	private List lamp;
	private List web;
	private List nmembrane;
	private List tmembrane;
	private List pump;

	public List getBlower() {
		return blower;
	}

	public void setBlower(List blower) {
		this.blower = blower;
	}

	public List getLamp() {
		return lamp;
	}

	public void setLamp(List lamp) {
		this.lamp = lamp;
	}

	public List getWeb() {
		return web;
	}

	public void setWeb(List web) {
		this.web = web;
	}

	public List getNmembrane() {
		return nmembrane;
	}

	public void setNmembrane(List nmembrane) {
		this.nmembrane = nmembrane;
	}

	public List getTmembrane() {
		return tmembrane;
	}

	public void setTmembrane(List tmembrane) {
		this.tmembrane = tmembrane;
	}

	public List getPump() {
		return pump;
	}

	public void setPump(List pump) {
		this.pump = pump;
	}
}
