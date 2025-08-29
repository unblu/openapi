
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Provides conversation context related to the assignment request
 */
public enum EAssignmentRequestType {

	/**
	 * INITIALLY_QUEUED: ConversationState: ONBOARDING -&gt; QUEUED
	 */
	INITIALLY_QUEUED("INITIALLY_QUEUED"),

	/**
	 * REBOARDING_QUEUED: ConversationState: REBOARDING -&gt; QUEUED
	 */
	REBOARDING_QUEUED("REBOARDING_QUEUED"),

	/**
	 * REQUEUED: ConversationState: ACTIVE/UNASSIGNED -&gt; QUEUED
	 */
	REQUEUED("REQUEUED");

	private String value;

	EAssignmentRequestType(String value) {
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
	public static EAssignmentRequestType fromValue(String value) {
		for (EAssignmentRequestType b : EAssignmentRequestType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
