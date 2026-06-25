
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An event triggered every time a &#x60;BotThread&#x60; is started during onboarding
 */
@ApiModel(description = "An event triggered every time a `BotThread` is started during onboarding")

@JsonPropertyOrder({
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_$_TYPE,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_TIMESTAMP,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_EVENT_TYPE,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_ACCOUNT_ID,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_BOT_THREAD_ID,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_CONVERSATION,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_COUNTERPART_PERSON_ID,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_START_TIMESTAMP,
	BotThreadOnboardingStartedEvent.JSON_PROPERTY_PARTICIPATING_DIALOG_BOTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotThreadOnboardingStartedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTTHREADONBOARDINGSTARTEDEVENT("BotThreadOnboardingStartedEvent");

		private String value;

		TypeEnum(String value) {
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
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.BOTTHREADONBOARDINGSTARTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTTHREADONBOARDINGSTARTEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_BOT_THREAD_ID = "botThreadId";
	@JsonProperty(JSON_PROPERTY_BOT_THREAD_ID)
	private String botThreadId;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_COUNTERPART_PERSON_ID = "counterpartPersonId";
	@JsonProperty(JSON_PROPERTY_COUNTERPART_PERSON_ID)
	private String counterpartPersonId;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_PARTICIPATING_DIALOG_BOTS = "participatingDialogBots";
	@JsonProperty(JSON_PROPERTY_PARTICIPATING_DIALOG_BOTS)
	private List<BotDialogStateData> participatingDialogBots = null;

	public BotThreadOnboardingStartedEvent $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public BotThreadOnboardingStartedEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The server time (Unix timestamp in ms) when the event occurred.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The server time (Unix timestamp in ms) when the event occurred.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public BotThreadOnboardingStartedEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public BotThreadOnboardingStartedEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BotThreadOnboardingStartedEvent botThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
		return this;
	}

	/**
	 * The bot thread ID
	 * 
	 * @return botThreadId
	 **/
	@ApiModelProperty(value = "The bot thread ID")
	public String getBotThreadId() {
		return botThreadId;
	}

	public void setBotThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
	}

	public BotThreadOnboardingStartedEvent conversation(ConversationData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationData conversation) {
		this.conversation = conversation;
	}

	public BotThreadOnboardingStartedEvent counterpartPersonId(String counterpartPersonId) {
		this.counterpartPersonId = counterpartPersonId;
		return this;
	}

	/**
	 * The bot thread counterpart person ID
	 * 
	 * @return counterpartPersonId
	 **/
	@ApiModelProperty(value = "The bot thread counterpart person ID")
	public String getCounterpartPersonId() {
		return counterpartPersonId;
	}

	public void setCounterpartPersonId(String counterpartPersonId) {
		this.counterpartPersonId = counterpartPersonId;
	}

	public BotThreadOnboardingStartedEvent startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * The bot thread start timestamp
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "The bot thread start timestamp")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public BotThreadOnboardingStartedEvent participatingDialogBots(List<BotDialogStateData> participatingDialogBots) {
		this.participatingDialogBots = participatingDialogBots;
		return this;
	}

	public BotThreadOnboardingStartedEvent addParticipatingDialogBotsItem(BotDialogStateData participatingDialogBotsItem) {
		if (this.participatingDialogBots == null) {
			this.participatingDialogBots = new ArrayList<>();
		}
		this.participatingDialogBots.add(participatingDialogBotsItem);
		return this;
	}

	/**
	 * The dialog bot state data of all bots belonging to the bot thread. Bots are displayed in order they were executed.
	 * 
	 * @return participatingDialogBots
	 **/
	@ApiModelProperty(value = "The dialog bot state data of all bots belonging to the bot thread. Bots are displayed in order they were executed.")
	public List<BotDialogStateData> getParticipatingDialogBots() {
		return participatingDialogBots;
	}

	public void setParticipatingDialogBots(List<BotDialogStateData> participatingDialogBots) {
		this.participatingDialogBots = participatingDialogBots;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotThreadOnboardingStartedEvent botThreadOnboardingStartedEvent = (BotThreadOnboardingStartedEvent) o;
		return Objects.equals(this.$type, botThreadOnboardingStartedEvent.$type) &&
				Objects.equals(this.timestamp, botThreadOnboardingStartedEvent.timestamp) &&
				Objects.equals(this.eventType, botThreadOnboardingStartedEvent.eventType) &&
				Objects.equals(this.accountId, botThreadOnboardingStartedEvent.accountId) &&
				Objects.equals(this.botThreadId, botThreadOnboardingStartedEvent.botThreadId) &&
				Objects.equals(this.conversation, botThreadOnboardingStartedEvent.conversation) &&
				Objects.equals(this.counterpartPersonId, botThreadOnboardingStartedEvent.counterpartPersonId) &&
				Objects.equals(this.startTimestamp, botThreadOnboardingStartedEvent.startTimestamp) &&
				Objects.equals(this.participatingDialogBots, botThreadOnboardingStartedEvent.participatingDialogBots);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, botThreadId, conversation, counterpartPersonId, startTimestamp, participatingDialogBots);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotThreadOnboardingStartedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    botThreadId: ").append(toIndentedString(botThreadId)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    counterpartPersonId: ").append(toIndentedString(counterpartPersonId)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    participatingDialogBots: ").append(toIndentedString(participatingDialogBots)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
