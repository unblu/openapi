
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ESummarizationLanguageConfiguration
 */
public enum ESummarizationLanguageConfiguration {

	/**
	 * CONVERSATION_LANGUAGE: Summary will be generated using the conversation language.
	 */
	CONVERSATION_LANGUAGE("CONVERSATION_LANGUAGE"),

	/**
	 * DEFINED_LANGUAGE: Summary will be generated using the language defined with the &#x60;ConversationSummaryTemplate&#x60; specificGenerationLanguage field.
	 */
	DEFINED_LANGUAGE("DEFINED_LANGUAGE");

	private String value;

	ESummarizationLanguageConfiguration(String value) {
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
	public static ESummarizationLanguageConfiguration fromValue(String value) {
		for (ESummarizationLanguageConfiguration b : ESummarizationLanguageConfiguration.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
