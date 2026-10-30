
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of a key encryption key or one of its versions.
 */
public enum EKeyEncryptionKeyStatus {

	/**
	 * ACTIVE: The key encryption key is the active key of the account. New data encryption keys are wrapped with this key.
	 */
	ACTIVE("ACTIVE"),

	/**
	 * DRAINING: The key encryption key is being phased out. Data encryption keys wrapped with this key are re-wrapped with the active key.
	 */
	DRAINING("DRAINING"),

	/**
	 * DECOMMISSIONED: The key encryption key is no longer used by any data encryption key and can be removed.
	 */
	DECOMMISSIONED("DECOMMISSIONED");

	private String value;

	EKeyEncryptionKeyStatus(String value) {
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
	public static EKeyEncryptionKeyStatus fromValue(String value) {
		for (EKeyEncryptionKeyStatus b : EKeyEncryptionKeyStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
