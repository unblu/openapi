
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAriaDialogBotExternalConfigurationType
 */
public enum EAriaDialogBotExternalConfigurationType {

	/**
	 * MULTIFLOW
	 */
	MULTIFLOW("MULTIFLOW");

	private String value;

	EAriaDialogBotExternalConfigurationType(String value) {
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
	public static EAriaDialogBotExternalConfigurationType fromValue(String value) {
		for (EAriaDialogBotExternalConfigurationType b : EAriaDialogBotExternalConfigurationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
