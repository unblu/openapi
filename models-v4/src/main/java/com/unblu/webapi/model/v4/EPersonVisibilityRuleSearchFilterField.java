
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonVisibilityRuleSearchFilterField
 */
public enum EPersonVisibilityRuleSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * AGENT_LABEL_SELECTION: Filter by the &#39;agentLabelSelection&#39; attribute
	 */
	AGENT_LABEL_SELECTION("AGENT_LABEL_SELECTION"),

	/**
	 * VISITOR_LABEL_SELECTION: Filter by the &#39;visitorLabelSelection&#39; attribute
	 */
	VISITOR_LABEL_SELECTION("VISITOR_LABEL_SELECTION");

	private String value;

	EPersonVisibilityRuleSearchFilterField(String value) {
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
	public static EPersonVisibilityRuleSearchFilterField fromValue(String value) {
		for (EPersonVisibilityRuleSearchFilterField b : EPersonVisibilityRuleSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
