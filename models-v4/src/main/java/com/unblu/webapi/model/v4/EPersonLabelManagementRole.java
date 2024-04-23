
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The person type a person label can be managed by
 */
public enum EPersonLabelManagementRole {

	/**
	 * SUPERVISOR: Supervisor
	 */
	SUPERVISOR("SUPERVISOR"),

	/**
	 * AGENT: Agent
	 */
	AGENT("AGENT"),

	/**
	 * AUTHENTICATED_VISITOR: Authenticated visitor
	 */
	AUTHENTICATED_VISITOR("AUTHENTICATED_VISITOR"),

	/**
	 * ANONYMOUS_VISITOR: Anonymous visitor
	 */
	ANONYMOUS_VISITOR("ANONYMOUS_VISITOR");

	private String value;

	EPersonLabelManagementRole(String value) {
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
	public static EPersonLabelManagementRole fromValue(String value) {
		for (EPersonLabelManagementRole b : EPersonLabelManagementRole.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
