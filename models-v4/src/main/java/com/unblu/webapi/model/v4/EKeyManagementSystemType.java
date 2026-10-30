
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of external key management system that a key encryption key lives in.
 */
public enum EKeyManagementSystemType {

	/**
	 * GCP_KMS: Google Cloud Key Management Service
	 */
	GCP_KMS("GCP_KMS"),

	/**
	 * IBM_KEY_PROTECT: IBM Key Protect
	 */
	IBM_KEY_PROTECT("IBM_KEY_PROTECT"),

	/**
	 * HASHICORP_VAULT: HashiCorp Vault transit secrets engine
	 */
	HASHICORP_VAULT("HASHICORP_VAULT");

	private String value;

	EKeyManagementSystemType(String value) {
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
	public static EKeyManagementSystemType fromValue(String value) {
		for (EKeyManagementSystemType b : EKeyManagementSystemType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
