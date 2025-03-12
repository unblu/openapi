
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchLinkType
 */
public enum EBranchLinkType {

	/**
	 * PHONE_NUMBER
	 */
	PHONE_NUMBER("PHONE_NUMBER"),

	/**
	 * TIME
	 */
	TIME("TIME"),

	/**
	 * TEAM
	 */
	TEAM("TEAM"),

	/**
	 * EXTERNAL_APPLICATION
	 */
	EXTERNAL_APPLICATION("EXTERNAL_APPLICATION"),

	/**
	 * INFO
	 */
	INFO("INFO"),

	/**
	 * OTHER
	 */
	OTHER("OTHER");

	private String value;

	EBranchLinkType(String value) {
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
	public static EBranchLinkType fromValue(String value) {
		for (EBranchLinkType b : EBranchLinkType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
