
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiReferenceLineDisplayType
 */
public enum EAnalyticsKpiReferenceLineDisplayType {

	/**
	 * SOLID: Solid line.
	 */
	SOLID("SOLID"),

	/**
	 * DOTTED: Dotted line.
	 */
	DOTTED("DOTTED"),

	/**
	 * DASHED: Dashed line.
	 */
	DASHED("DASHED");

	private String value;

	EAnalyticsKpiReferenceLineDisplayType(String value) {
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
	public static EAnalyticsKpiReferenceLineDisplayType fromValue(String value) {
		for (EAnalyticsKpiReferenceLineDisplayType b : EAnalyticsKpiReferenceLineDisplayType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
