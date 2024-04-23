
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source of a file upload
 */
public enum EFileUploadInterceptorSource {

	/**
	 * BOT
	 */
	BOT("BOT"),

	/**
	 * EXTERNAL_MESSENGER: The file is being upload as a file message via an external channel
	 */
	EXTERNAL_MESSENGER("EXTERNAL_MESSENGER"),

	/**
	 * CONVERSATION: The file is being uploaded as a file message through an external messenger
	 */
	CONVERSATION("CONVERSATION"),

	/**
	 * CALL_SNAPSHOT: The file is a snapshot from a call
	 */
	CALL_SNAPSHOT("CALL_SNAPSHOT"),

	/**
	 * CONVERSATION_RECORDING: The file is the recording of a conversation
	 */
	CONVERSATION_RECORDING("CONVERSATION_RECORDING"),

	/**
	 * CO_BROWSING_DOWNLOAD: The file is being uploaded to the conversation from a website participants are co-browsing
	 */
	CO_BROWSING_DOWNLOAD("CO_BROWSING_DOWNLOAD");

	private String value;

	EFileUploadInterceptorSource(String value) {
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
	public static EFileUploadInterceptorSource fromValue(String value) {
		for (EFileUploadInterceptorSource b : EFileUploadInterceptorSource.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
