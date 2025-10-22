
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of link used to navigate to the customer view of a person.
 */
public enum EPersonLinkType {

	/**
	 * AGENT_DESK_VISITOR_DETAILS: The agent link for the details view of an authenticated visitor
	 */
	AGENT_DESK_VISITOR_DETAILS("AGENT_DESK_VISITOR_DETAILS");

	private String value;

	EPersonLinkType(String value) {
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
	public static EPersonLinkType fromValue(String value) {
		for (EPersonLinkType b : EPersonLinkType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
