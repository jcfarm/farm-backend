package com.scujcc.farm.service;

import com.scujcc.farm.entity.Field;
import com.scujcc.farm.repo.FieldRepository;
import com.scujcc.farm.util.Fields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by David on 16/06/2017.
 */
@Service
public class FieldServiceImpl implements FieldSerive {

	@Autowired
	FieldRepository fieldRepository;

	@Autowired
	Fields fields;

	@Override
	public Fields getALLFileds() {
		List<Field> list = new ArrayList<>();
		Iterator iterator = fieldRepository.findAll().iterator();
		while (iterator.hasNext())
			list.add((Field) iterator.next());
		fields.setFields(list);
		return fields;
	}
}
