
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchLinkType
 */
public enum EBranchLinkType {

	/**
	 * PHONE_NUMBER: A link to a phone number to call
	 */
	PHONE_NUMBER("PHONE_NUMBER"),

	/**
	 * TIME: A link to opening hours or another time-related resource
	 */
	TIME("TIME"),

	/**
	 * TEAM: A link to a team that can be contacted
	 */
	TEAM("TEAM"),

	/**
	 * EXTERNAL_APPLICATION: A link that opens an external application
	 */
	EXTERNAL_APPLICATION("EXTERNAL_APPLICATION"),

	/**
	 * INFO: A link to purely informational content
	 */
	INFO("INFO"),

	/**
	 * OTHER: A link that does not fall into any of the other categories
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
