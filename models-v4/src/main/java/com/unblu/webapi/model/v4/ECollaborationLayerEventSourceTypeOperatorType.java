
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Operator types corresponding to operators defined by &#x60;CollaborationLayerEventSourceTypeOperator&#x60;
 */
public enum ECollaborationLayerEventSourceTypeOperatorType {

	/**
	 * EQUALS: Check if the value is equal to the one provided in the operator
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS: Check if the value is different from the one provided in the operator
	 */
	NOT_EQUALS("NOT_EQUALS"),

	/**
	 * IN: Check if the value is one of the ones provided in the operator
	 */
	IN("IN"),

	/**
	 * NOT_IN: Check if the value is none of the ones provided in the operator
	 */
	NOT_IN("NOT_IN");

	private String value;

	ECollaborationLayerEventSourceTypeOperatorType(String value) {
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
	public static ECollaborationLayerEventSourceTypeOperatorType fromValue(String value) {
		for (ECollaborationLayerEventSourceTypeOperatorType b : ECollaborationLayerEventSourceTypeOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
