
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Operator types corresponding to operators defined by &#x60;IdListOperator&#x60;
 */
public enum EIdListOperatorType {

	/**
	 * ALL_OF: Checks if all of the values are present in the value list provided by the operator.
	 */
	ALL_OF("ALL_OF"),

	/**
	 * ANY_OF: Checks if any of the values is equal to any of the values in the list provided by the operator.
	 */
	ANY_OF("ANY_OF"),

	/**
	 * ALL_EQUAL: Check if the lists are of the same length and contain same values.
	 */
	ALL_EQUAL("ALL_EQUAL");

	private String value;

	EIdListOperatorType(String value) {
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
	public static EIdListOperatorType fromValue(String value) {
		for (EIdListOperatorType b : EIdListOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
