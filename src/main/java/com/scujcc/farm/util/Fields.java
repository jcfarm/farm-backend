package com.scujcc.farm.util;

import com.scujcc.farm.entity.Field;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by David on 16/06/2017.
 */
@Component
public class Fields {
	private List<Field> fields;

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
}
