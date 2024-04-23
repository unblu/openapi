
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECustomActionInvocationResponseType
 */
public enum ECustomActionInvocationResponseType {

	/**
	 * EXECUTED: The custom action was successfully executed
	 */
	EXECUTED("EXECUTED"),

	/**
	 * EXECUTION_STARTED: The custom action was started, but hasn&#39;t finished
	 */
	EXECUTION_STARTED("EXECUTION_STARTED"),

	/**
	 * ERROR: The custom action failed to execute
	 */
	ERROR("ERROR");

	private String value;

	ECustomActionInvocationResponseType(String value) {
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
	public static ECustomActionInvocationResponseType fromValue(String value) {
		for (ECustomActionInvocationResponseType b : ECustomActionInvocationResponseType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
