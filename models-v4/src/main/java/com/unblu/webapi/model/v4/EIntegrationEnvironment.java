
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EIntegrationEnvironment
 */
public enum EIntegrationEnvironment {

	/**
	 * VISITOR_SITE_INTEGRATION: Site which integrates Unblu for their visitors using a floating UI
	 */
	VISITOR_SITE_INTEGRATION("VISITOR_SITE_INTEGRATION"),

	/**
	 * VISITOR_SITE_EMBEDDED: Site which integrates Unblu for their visitors using an embedded UI
	 */
	VISITOR_SITE_EMBEDDED("VISITOR_SITE_EMBEDDED"),

	/**
	 * VISITOR_DESK: Site for visitors which join a session, but the page was not integrated into any other page
	 */
	VISITOR_DESK("VISITOR_DESK"),

	/**
	 * VISITOR_POPOUT: Site for site integration pop-outs.
	 */
	VISITOR_POPOUT("VISITOR_POPOUT"),

	/**
	 * VISITOR_BRANCH_CLIENT: Site which integrates Unblu inside a branch client device using an embedded UI
	 */
	VISITOR_BRANCH_CLIENT("VISITOR_BRANCH_CLIENT"),

	/**
	 * AGENT_DESK: Site for the agent
	 */
	AGENT_DESK("AGENT_DESK"),

	/**
	 * TEAMS_AGENT_DESK: Site for the MS Teams agent
	 */
	TEAMS_AGENT_DESK("TEAMS_AGENT_DESK"),

	/**
	 * AGENT_SINGLE_CONVERSATION_DESK: Single conversation page for the agent
	 */
	AGENT_SINGLE_CONVERSATION_DESK("AGENT_SINGLE_CONVERSATION_DESK"),

	/**
	 * ACCOUNT_CONFIGURATION: Account configuration page
	 */
	ACCOUNT_CONFIGURATION("ACCOUNT_CONFIGURATION"),

	/**
	 * GLOBAL_CONFIGURATION: Global configuration page
	 */
	GLOBAL_CONFIGURATION("GLOBAL_CONFIGURATION"),

	/**
	 * VISITOR_MOBILE: Site for mobile visitor front end and pop-out. It contains the Individual UI of the visitor site integration.
	 */
	VISITOR_MOBILE("VISITOR_MOBILE"),

	/**
	 * AGENT_MOBILE: Site for mobile agent front end. It contains the agent inbox and the conversation UI.
	 */
	AGENT_MOBILE("AGENT_MOBILE"),

	/**
	 * EXTERNAL_MESSENGER_CHANNEL: Joined the conversation via a messenger channel.
	 */
	EXTERNAL_MESSENGER_CHANNEL("EXTERNAL_MESSENGER_CHANNEL"),

	/**
	 * CONVERSATION_RECORDER: Joined the conversation as conversation recorder for audio and video
	 */
	CONVERSATION_RECORDER("CONVERSATION_RECORDER"),

	/**
	 * CONVERSATION_RECORDER_AUDIO: Joined the conversation as conversation recorder for audio only
	 */
	CONVERSATION_RECORDER_AUDIO("CONVERSATION_RECORDER_AUDIO"),

	/**
	 * WHITEBOARD: Joined the conversation as whiteboard
	 */
	WHITEBOARD("WHITEBOARD");

	private String value;

	EIntegrationEnvironment(String value) {
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
	public static EIntegrationEnvironment fromValue(String value) {
		for (EIntegrationEnvironment b : EIntegrationEnvironment.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
