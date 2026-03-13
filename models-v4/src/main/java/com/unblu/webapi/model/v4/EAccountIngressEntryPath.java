
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAccountIngressEntryPath
 */
public enum EAccountIngressEntryPath {

	/**
	 * PUBLIC: Public ingress entry path
	 */
	PUBLIC("PUBLIC"),

	/**
	 * INTERNAL: Internal ingress entry path
	 */
	INTERNAL("INTERNAL"),

	/**
	 * SYSTEM: System ingress entry path
	 */
	SYSTEM("SYSTEM"),

	/**
	 * WEBHOOK: Webhook ingress entry path
	 */
	WEBHOOK("WEBHOOK");

	private String value;

	EAccountIngressEntryPath(String value) {
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
	public static EAccountIngressEntryPath fromValue(String value) {
		for (EAccountIngressEntryPath b : EAccountIngressEntryPath.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
