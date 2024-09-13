
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Operator types corresponding to operators defined by &#x60;PersonLabelsOperator&#x60;
 */
public enum EPersonLabelsOperatorType {

	/**
	 * ALL_OF: Checks if all of the label names provided by the operator are present on the persons returned.
	 */
	ALL_OF("ALL_OF"),

	/**
	 * ANY_OF: Checks if any of the label names provided by the operator are present on the persons returned.
	 */
	ANY_OF("ANY_OF"),

	/**
	 * NONE_OF: Check if none of the label names provided by the operator are present on the persons returned.
	 */
	NONE_OF("NONE_OF");

	private String value;

	EPersonLabelsOperatorType(String value) {
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
	public static EPersonLabelsOperatorType fromValue(String value) {
		for (EPersonLabelsOperatorType b : EPersonLabelsOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
