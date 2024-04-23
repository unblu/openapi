
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of a file which is/was uploaded to the collaboration server
 */
public enum EConversationFileStatus {

	/**
	 * UPLOADING
	 */
	UPLOADING("UPLOADING"),

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
	DELETED("DELETED"),

	/**
	 * SCANNING
	 */
	SCANNING("SCANNING"),

	/**
	 * REJECTED
	 */
	REJECTED("REJECTED");

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
