
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientType
 */
public enum EBranchClientType {

	/**
	 * RECEPTION
	 */
	RECEPTION("RECEPTION"),

	/**
	 * SELF_SERVICE
	 */
	SELF_SERVICE("SELF_SERVICE"),

	/**
	 * MEETING_ROOM
	 */
	MEETING_ROOM("MEETING_ROOM"),

	/**
	 * OTHER
	 */
	OTHER("OTHER");

	private String value;

	EBranchClientType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static EBranchClientType fromValue(String value) {
		for (EBranchClientType b : EBranchClientType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
