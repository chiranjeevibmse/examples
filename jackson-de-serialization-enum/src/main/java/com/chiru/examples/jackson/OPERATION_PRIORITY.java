package com.chiru.examples.jackson;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(using=OperationPriorityDeSerializer.class)
@JsonSerialize(using=OperationPrioritySerializer.class)
public enum OPERATION_PRIORITY {
	NONE(0),
	VERYHIGH(4),
	HIGH(3),
	MEDIUM(2),
	LOW(1);
	private  int level = 0;
	private OPERATION_PRIORITY(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public String getToString() {
		switch (level) {
		case 0:
			return "None";
		case 1:
			return "Very High";
		case 2:
			return "High";
		case 3:
			return "Medium";
		case 4:
			return "Low";
		default:
			return "";
		}
	}
}
