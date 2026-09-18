
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of a file which is/was uploaded to the Collaboration Server
 */
public enum EConversationFileStatus {

	/**
	 * UPLOADING: The file is being transferred to the Collaboration Server
	 */
	UPLOADING("UPLOADING"),

	/**
	 * COMPLETED: The file was uploaded successfully and can be downloaded
	 */
	COMPLETED("COMPLETED"),

	/**
	 * CANCELED: The upload was aborted before it finished
	 */
	CANCELED("CANCELED"),

	/**
	 * FAILED: The upload ended with an error
	 */
	FAILED("FAILED"),

	/**
	 * DELETED: The file was removed from the Collaboration Server
	 */
	DELETED("DELETED"),

	/**
	 * SCANNING: The uploaded file is being checked by the virus scanner
	 */
	SCANNING("SCANNING"),

	/**
	 * REJECTED: The file was refused, for example because the virus scanner flagged it
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
