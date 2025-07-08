
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Document co-browsing event action type for differentiating the triggering personId field
 */
public enum EDocumentActionType {

	/**
	 * DOCUMENT_OPENED: Document has been opened in a new tab, the triggering person is the one who opened it
	 */
	DOCUMENT_OPENED("DOCUMENT_OPENED"),

	/**
	 * DOCUMENT_SIGNED: Document has been signed, the triggering person is the one who signed it
	 */
	DOCUMENT_SIGNED("DOCUMENT_SIGNED");

	private String value;

	EDocumentActionType(String value) {
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
	public static EDocumentActionType fromValue(String value) {
		for (EDocumentActionType b : EDocumentActionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
