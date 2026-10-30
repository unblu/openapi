
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Whether an encryption consumer could be reached while its key encryption key version usage was determined.
 */
public enum EKeyEncryptionKeyConsumerAvailability {

	/**
	 * AVAILABLE: The consumer answered, so its reported usage is accurate.
	 */
	AVAILABLE("AVAILABLE"),

	/**
	 * UNAVAILABLE: The consumer isn&#39;t registered, couldn&#39;t be reached, or failed to answer, so its usage is unknown and reported as &#x60;null&#x60;.
	 */
	UNAVAILABLE("UNAVAILABLE");

	private String value;

	EKeyEncryptionKeyConsumerAvailability(String value) {
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
	public static EKeyEncryptionKeyConsumerAvailability fromValue(String value) {
		for (EKeyEncryptionKeyConsumerAvailability b : EKeyEncryptionKeyConsumerAvailability.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
