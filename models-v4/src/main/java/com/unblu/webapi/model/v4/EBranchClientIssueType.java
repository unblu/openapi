
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
	 * MAIN_CAMERA_ACCESS_NOT_GRANTED: The main camera is configured, but the Branch client hasn&#39;t been granted camera access, so the configured device
	 * can&#39;t be looked up.
	 */
	MAIN_CAMERA_ACCESS_NOT_GRANTED("MAIN_CAMERA_ACCESS_NOT_GRANTED"),

	/**
	 * AUXILIARY_CAMERA_ACCESS_NOT_GRANTED: One or more auxiliary cameras are configured, but the Branch client hasn&#39;t been granted camera access, so the
	 * configured devices can&#39;t be looked up.
	 */
	AUXILIARY_CAMERA_ACCESS_NOT_GRANTED("AUXILIARY_CAMERA_ACCESS_NOT_GRANTED"),

	/**
	 * MICROPHONE_ACCESS_NOT_GRANTED: The microphone is configured, but the Branch client hasn&#39;t been granted microphone access, so the configured device
	 * can&#39;t be looked up.
	 */
	MICROPHONE_ACCESS_NOT_GRANTED("MICROPHONE_ACCESS_NOT_GRANTED"),

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
