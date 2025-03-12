
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of issues a branch client can have
 */
public enum EBranchClientIssueType {

	/**
	 * MAIN_CAMERA: There is an issue with the main camera, for example label of the configured device doesn&#39;t match any camera connected to the branch client
	 */
	MAIN_CAMERA("MAIN_CAMERA"),

	/**
	 * AUXILIARY_CAMERA: There is an issue with one or more auxiliary cameras, for example, the label of the configured device doesn&#39;t match any camera
	 * connected to the branch client
	 */
	AUXILIARY_CAMERA("AUXILIARY_CAMERA"),

	/**
	 * MICROPHONE: There is an issue with the microphone, for example, the label of the configured device doesn&#39;t match any microphone connected to the branch
	 * client
	 */
	MICROPHONE("MICROPHONE"),

	/**
	 * OTHER: There is a general issue with the branch client
	 */
	OTHER("OTHER");

	private String value;

	EBranchClientIssueType(String value) {
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
	public static EBranchClientIssueType fromValue(String value) {
		for (EBranchClientIssueType b : EBranchClientIssueType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
