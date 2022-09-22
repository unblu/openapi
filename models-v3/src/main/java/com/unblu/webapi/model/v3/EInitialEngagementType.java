
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The initial type of a conversation. The type used at creation time of the conversation determines the conversation template that is used.
 */
public enum EInitialEngagementType {

	/**
	 * CHAT_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming chat conversation.
	 */
	CHAT_REQUEST("CHAT_REQUEST"),

	/**
	 * OFFLINE_CHAT_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming chat conversation while all agents are offline.
	 */
	OFFLINE_CHAT_REQUEST("OFFLINE_CHAT_REQUEST"),

	/**
	 * VIDEO_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming video conversation.
	 */
	VIDEO_REQUEST("VIDEO_REQUEST"),

	/**
	 * AUDIO_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming audio conversation.
	 */
	AUDIO_REQUEST("AUDIO_REQUEST"),

	/**
	 * HEADLESS_BROWSER_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming universal co-browsing conversation.
	 */
	HEADLESS_BROWSER_REQUEST("HEADLESS_BROWSER_REQUEST"),

	/**
	 * DOMCAP_BROWSER_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming embedded co-browsing conversation.
	 */
	DOMCAP_BROWSER_REQUEST("DOMCAP_BROWSER_REQUEST"),

	/**
	 * MOBILE_COBROWSING_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming mobile co-browsing conversation.
	 */
	MOBILE_COBROWSING_REQUEST("MOBILE_COBROWSING_REQUEST"),

	/**
	 * SCREEN_SHARING_REQUEST: (Visitor initiated, visitor centered) A visitor creates an incoming screen sharing conversation.
	 */
	SCREEN_SHARING_REQUEST("SCREEN_SHARING_REQUEST"),

	/**
	 * VISITOR_COBROWSING: (Api initiated, visitor centered) A visitor creates a conversation via API which is not added to the queue and where he can invite other
	 * visitor to do embedded
	 */
	VISITOR_COBROWSING("VISITOR_COBROWSING"),

	/**
	 * HEADLESS_PIN: (Agent initiated, visitor centered) An agent creates a conversation with a PIN invitation for the visitor to join an universal co-browsing
	 * conversation.
	 */
	HEADLESS_PIN("HEADLESS_PIN"),

	/**
	 * DOMCAP_PIN: (Agent initiated, visitor centered) An agent creates a conversation with a PIN invitation for the visitor to join an embedded co-browsing
	 * conversation.
	 */
	DOMCAP_PIN("DOMCAP_PIN"),

	/**
	 * MOBILE_PIN: (Agent initiated, visitor centered) An agent creates a conversation with a PIN invitation for the visitor to join a mobile co-browsing
	 * conversation.
	 */
	MOBILE_PIN("MOBILE_PIN"),

	/**
	 * SCREEN_SHARING_PIN: (Agent initiated, visitor centered) An agent creates a conversation with a PIN invitation for the visitor to join a screen sharing
	 * conversation.
	 */
	SCREEN_SHARING_PIN("SCREEN_SHARING_PIN"),

	/**
	 * CHAT_INVITE: (Agent initiated, agent centered) An agent creates a chat conversation (this is the recommended initial engagement type for conversation created
	 * with the Web API).
	 */
	CHAT_INVITE("CHAT_INVITE"),

	/**
	 * HEADLESS_INVITE: (Agent initiated, agent centered) An agent creates universal co-browsing conversation and invites customer later.
	 */
	HEADLESS_INVITE("HEADLESS_INVITE"),

	/**
	 * SCREEN_SHARING_INVITE: (Agent initiated, agent centered) An agent creates screen sharing conversation and invites customer later.
	 */
	SCREEN_SHARING_INVITE("SCREEN_SHARING_INVITE");

	private String value;

	EInitialEngagementType(String value) {
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
	public static EInitialEngagementType fromValue(String value) {
		for (EInitialEngagementType b : EInitialEngagementType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
