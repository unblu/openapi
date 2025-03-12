
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientAuxiliaryCameraType
 */
public enum EBranchClientAuxiliaryCameraType {

	/**
	 * DOCUMENT: Document camera
	 */
	DOCUMENT("DOCUMENT"),

	/**
	 * ROOM: Room camera
	 */
	ROOM("ROOM"),

	/**
	 * OTHER: Any other camera type
	 */
	OTHER("OTHER");

	private String value;

	EBranchClientAuxiliaryCameraType(String value) {
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
	public static EBranchClientAuxiliaryCameraType fromValue(String value) {
		for (EBranchClientAuxiliaryCameraType b : EBranchClientAuxiliaryCameraType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
