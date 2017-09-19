package com.chiru.examples.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class OperationPrioritySerializer extends StdSerializer<OPERATION_PRIORITY> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperationPrioritySerializer() {
		super(OPERATION_PRIORITY.class);
	}
	protected OperationPrioritySerializer(Class<OPERATION_PRIORITY> t) {
		super(t);
	}

	@Override
	public void serialize(OPERATION_PRIORITY operationPriority, JsonGenerator generator, SerializerProvider agr2) throws IOException {
		generator.writeString(operationPriority.getToString());
	}

}
