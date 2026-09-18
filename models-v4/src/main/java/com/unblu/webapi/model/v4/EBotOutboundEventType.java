
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The outbound events a custom dialog bot can receive. &lt;p&gt; Each constant declares everything the delivery layer branches on: the wire event type, whether
 * the event is mandatory or selectable per bot, the lowest web API version able to carry it. &lt;p&gt; Which optional events a given bot receives is data, not
 * code: it is stored on the bot. Optional events are delivered only when enabled on the bot (&#x60;optionalOutboundEvents&#x60;). &lt;p&gt; Some mandatory
 * events occur only while a corresponding bot setting is active; see the individual events.
 */
public enum EBotOutboundEventType {

	/**
	 * ONBOARDING_OFFER: Sent when a person matching the bot&#39;s onboarding filter joins a conversation. Only occurs when the onboarding filter is set.
	 */
	ONBOARDING_OFFER("ONBOARDING_OFFER"),

	/**
	 * REBOARDING_OFFER: Sent when a person writes a message to an unassigned conversation. Only occurs when reboarding is enabled on the bot.
	 */
	REBOARDING_OFFER("REBOARDING_OFFER"),

	/**
	 * OFFBOARDING_OFFER: Sent when a person matching the bot&#39;s offboarding filter leaves a conversation or the conversation ends. Only occurs when the
	 * offboarding filter is set.
	 */
	OFFBOARDING_OFFER("OFFBOARDING_OFFER"),

	/**
	 * DIALOG_MESSAGE_STATE: Sent on each message state update of a previously accepted bot dialog. Only occurs when message state is handled externally.
	 */
	DIALOG_MESSAGE_STATE("DIALOG_MESSAGE_STATE"),

	/**
	 * DIALOG_OPENED: Delivered when a previously accepted bot dialog starts.
	 */
	DIALOG_OPENED("DIALOG_OPENED"),

	/**
	 * DIALOG_MESSAGE: Delivered on each message of a previously accepted bot dialog.
	 */
	DIALOG_MESSAGE("DIALOG_MESSAGE"),

	/**
	 * DIALOG_CLOSED: Delivered when a previously accepted bot dialog closes.
	 */
	DIALOG_CLOSED("DIALOG_CLOSED"),

	/**
	 * DIALOG_COUNTERPART_CHANGED: Delivered when the counterpart person of a dialog changes during the dialog.
	 */
	DIALOG_COUNTERPART_CHANGED("DIALOG_COUNTERPART_CHANGED"),

	/**
	 * DIALOG_ABORT_ANSWER: Delivered when the counterpart aborts an answer the bot is waiting for.
	 */
	DIALOG_ABORT_ANSWER("DIALOG_ABORT_ANSWER"),

	/**
	 * DIALOG_MESSAGE_DELETED: Delivered when a message of a previously accepted bot dialog is deleted, whether for all participants or only for individual
	 * participants.
	 */
	DIALOG_MESSAGE_DELETED("DIALOG_MESSAGE_DELETED");

	private String value;

	EBotOutboundEventType(String value) {
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
	public static EBotOutboundEventType fromValue(String value) {
		for (EBotOutboundEventType b : EBotOutboundEventType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
