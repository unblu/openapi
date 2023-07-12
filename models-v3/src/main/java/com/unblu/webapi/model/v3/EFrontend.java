
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * All the different Unblu conversation frontends users can interact with
 */
public enum EFrontend {

	/**
	 * VISITOR_SITE_INTEGRATION: Sites that integrate Unblu using the Floating Visitor UI
	 */
	VISITOR_SITE_INTEGRATION("VISITOR_SITE_INTEGRATION"),

	/**
	 * VISITOR_SITE_EMBEDDED: Sites that integrate Unblu using the Embedded Visitor UI
	 */
	VISITOR_SITE_EMBEDDED("VISITOR_SITE_EMBEDDED"),

	/**
	 * VISITOR_DESK: Sites for visitors to join a session, but the page isn&#39;t integrated into any other page
	 */
	VISITOR_DESK("VISITOR_DESK"),

	/**
	 * VISITOR_MOBILE: Sites for mobile visitor frontend and pop-out that display the Individual UI of the visitor site integration
	 */
	VISITOR_MOBILE("VISITOR_MOBILE"),

	/**
	 * VISITOR_POPOUT: Sites for site integration pop-outs
	 */
	VISITOR_POPOUT("VISITOR_POPOUT"),

	/**
	 * AGENT_DESK: The Agent Desk
	 */
	AGENT_DESK("AGENT_DESK"),

	/**
	 * AGENT_SINGLE_CONVERSATION_DESK: Single conversation page for the agent
	 */
	AGENT_SINGLE_CONVERSATION_DESK("AGENT_SINGLE_CONVERSATION_DESK"),

	/**
	 * AGENT_MOBILE: Sites for the mobile agent frontend that display the agent inbox and the conversation UI
	 */
	AGENT_MOBILE("AGENT_MOBILE");

	private String value;

	EFrontend(String value) {
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
	public static EFrontend fromValue(String value) {
		for (EFrontend b : EFrontend.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
