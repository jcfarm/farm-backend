package com.scujcc.farm.controller;

import com.scujcc.farm.service.FieldServiceImpl;
import com.scujcc.farm.service.SAndCServiceImpl;
import com.scujcc.farm.util.Fields;
import com.scujcc.farm.util.MqttJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by David on 16/06/2017.
 */
@Controller
public class FieldController {

	@Autowired
	FieldServiceImpl fieldServiceImpl;

	@Autowired
	SAndCServiceImpl sAndCServiceImpl;

	@ResponseBody
	@RequestMapping(value = "/fields/showall", method = RequestMethod.GET)
	public Fields showAll() {
		Fields fields = fieldServiceImpl.getALLFileds();
		return fields;
	}

	@ResponseBody
	@RequestMapping(name = "/fields/mqttjson", method = RequestMethod.GET)
	public MqttJson mqttJson() {
		MqttJson mqttJson = sAndCServiceImpl.pushJsonToAndroid();
		return mqttJson;
	}

}
