package com.scujcc.farm.service;

import com.scujcc.farm.repo.*;
import com.scujcc.farm.util.Controls;
import com.scujcc.farm.util.MqttJson;
import com.scujcc.farm.util.Sensors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by David on 16/06/2017.
 */
@Service
public class SAndCServiceImpl implements SAndCService {

	@Autowired
	MqttJson mqttJson;
	@Autowired
	Controls controls;
	@Autowired
	Sensors sensors;

	@Autowired
	CBlowerRepo cBlowerRepo;
	@Autowired
	CLampRepo cLampRepo;
	@Autowired
	CNmembraneRepo cNmembraneRepo;
	@Autowired
	CPumpRepo cPumpRepo;
	@Autowired
	CTmembraneRepo cTmembraneRepo;
	@Autowired
	CWebRepo cWebRepo;

	@Autowired
	SCo2Repo sCo2Repo;
	@Autowired
	SLightRepo sLightRepo;
	@Autowired
	SSaltRepo sSaltRepo;
	@Autowired
	SWaterRepo sWaterRepo;


	@Override
	public MqttJson pushJsonToAndroid() {

		mqttJson.setId(1);

		List listOfBlower = new ArrayList();
		Iterator iterator1 = cBlowerRepo.findAll().iterator();
		while (iterator1.hasNext())
			listOfBlower.add(iterator1.next());
		controls.setBlower(listOfBlower);

		List listOfLamp = new ArrayList();
		Iterator iterator2 = cLampRepo.findAll().iterator();
		while (iterator2.hasNext())
			listOfLamp.add(iterator2.next());
		controls.setLamp(listOfLamp);

		List listOfNmembrane = new ArrayList();
		Iterator iterator3 = cNmembraneRepo.findAll().iterator();
		while (iterator3.hasNext())
			listOfNmembrane.add(iterator3.next());
		controls.setNmembrane(listOfNmembrane);

		List listOfPump = new ArrayList();
		Iterator iterator4 = cPumpRepo.findAll().iterator();
		while (iterator4.hasNext())
			listOfPump.add(iterator4.next());
		controls.setPump(listOfPump);

		List listOfTmembrane = new ArrayList();
		Iterator iterator5 = cTmembraneRepo.findAll().iterator();
		while (iterator5.hasNext())
			listOfTmembrane.add(iterator5.next());
		controls.setTmembrane(listOfTmembrane);

		List listOfWeb = new ArrayList();
		Iterator iterator6 = cWebRepo.findAll().iterator();
		while (iterator6.hasNext())
			listOfWeb.add(iterator6.next());
		controls.setWeb(listOfWeb);

		mqttJson.setControls(controls);

		List listOfCo2 = new ArrayList();
		Iterator i1 = sCo2Repo.findAll().iterator();
		while (i1.hasNext())
			listOfCo2.add(i1.next());
		sensors.setCo2(listOfCo2);

		List listOfLight = new ArrayList();
		Iterator i2 = sLightRepo.findAll().iterator();
		while (i2.hasNext())
			listOfLight.add(i2.next());
		sensors.setLight(listOfLight);

		List listOfSalt = new ArrayList();
		Iterator i3 = sSaltRepo.findAll().iterator();
		while (i3.hasNext())
			listOfSalt.add(i3.next());
		sensors.setSalt(listOfSalt);

		List listOfWater = new ArrayList();
		Iterator i4 = sWaterRepo.findAll().iterator();
		while (i4.hasNext())
			listOfWater.add(i4.next());
		sensors.setWater(listOfWater);

		mqttJson.setSensors(sensors);

		return mqttJson;
	}
}
