
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonVisibilityLabelSelection
 */
public enum EPersonVisibilityLabelSelection {

	/**
	 * ALL: Any person matches the selection
	 */
	ALL("ALL"),

	/**
	 * UNLABELED: Only a person without any assigned labels matches the selection
	 */
	UNLABELED("UNLABELED"),

	/**
	 * DEFINED_LABELS: Only a person with all of the defined labels matches the selection
	 */
	DEFINED_LABELS("DEFINED_LABELS");

	private String value;

	EPersonVisibilityLabelSelection(String value) {
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
	public static EPersonVisibilityLabelSelection fromValue(String value) {
		for (EPersonVisibilityLabelSelection b : EPersonVisibilityLabelSelection.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
