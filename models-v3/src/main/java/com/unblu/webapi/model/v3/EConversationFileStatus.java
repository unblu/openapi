
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of a file which is/was uploaded to the collaboration server
 */
public enum EConversationFileStatus {

	/**
	 * IN_PROGRESS
	 */
	IN_PROGRESS("IN_PROGRESS"),

	/**
	 * COMPLETED
	 */
	COMPLETED("COMPLETED"),

	/**
	 * CANCELED
	 */
	CANCELED("CANCELED"),

	/**
	 * FAILED
	 */
	FAILED("FAILED"),

	/**
	 * DELETED
	 */
	DELETED("DELETED");

	private String value;

	EConversationFileStatus(String value) {
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
	public static EConversationFileStatus fromValue(String value) {
		for (EConversationFileStatus b : EConversationFileStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
