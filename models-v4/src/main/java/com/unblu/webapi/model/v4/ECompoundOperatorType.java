
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECompoundOperatorType
 */
public enum ECompoundOperatorType {

	/**
	 * AND: Links the child search filters with the logical AND operation
	 */
	AND("AND"),

	/**
	 * OR: Links the child search filters with the logical OR operation
	 */
	OR("OR");

	private String value;

	ECompoundOperatorType(String value) {
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
	public static ECompoundOperatorType fromValue(String value) {
		for (ECompoundOperatorType b : ECompoundOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
