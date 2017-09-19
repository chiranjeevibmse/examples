package com.chiru.examples.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class OperationPriorityDeSerializer extends StdDeserializer<OPERATION_PRIORITY> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperationPriorityDeSerializer() {
		super(OPERATION_PRIORITY.class);
	}

	protected OperationPriorityDeSerializer(Class<OPERATION_PRIORITY> vc) {
		super(vc);
	}

	@Override
	public OPERATION_PRIORITY deserialize(JsonParser jsonParser, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		String value = jsonParser.getValueAsString();
		switch (value) {
		case "Medium":
			return OPERATION_PRIORITY.MEDIUM;
		case "None":
			return OPERATION_PRIORITY.NONE;
		case "High":
			return OPERATION_PRIORITY.HIGH;
		case "Very High":
			return OPERATION_PRIORITY.VERYHIGH;
		case "Low":
			return OPERATION_PRIORITY.LOW;
		default:
			return OPERATION_PRIORITY.NONE;
		}
	}

}
