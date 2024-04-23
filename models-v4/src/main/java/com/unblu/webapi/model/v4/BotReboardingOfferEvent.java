
package com.unblu.webapi.model.v4;

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
 * Event sent when a person writes a message to an unassigned conversation, giving the bot a chance to participate in the person&#39;s reboarding. &lt;p&gt;
 * Bots must accept or decline the dialog offer by responding via the bot web API with the given &#x60;dialogToken&#x60;. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt;
 * &lt;ul&gt; &lt;li&gt;If the reboardingEnabled flag is disabled in &#x60;DialogBot&#x60;, the webhook isn&#39;t sent to the bot&#39;s endpoint.&lt;/li&gt;
 * &lt;li&gt;The bot MUST respond to the webhook. If it doesn&#39;t, the person has to wait for a timeout before their reboarding can proceed.&lt;/li&gt;
 * &lt;/ul&gt;
 */
@ApiModel(description = "Event sent when a person writes a message to an unassigned conversation, giving the bot a chance to participate in the person's reboarding. <p> Bots must accept or decline the dialog offer by responding via the bot web API with the given `dialogToken`. <p> <b>Note:</b> <ul> <li>If the reboardingEnabled flag is disabled in `DialogBot`, the webhook isn't sent to the bot's endpoint.</li> <li>The bot MUST respond to the webhook. If it doesn't, the person has to wait for a timeout before their reboarding can proceed.</li> </ul>")

@JsonPropertyOrder({
	BotReboardingOfferEvent.JSON_PROPERTY_$_TYPE,
	BotReboardingOfferEvent.JSON_PROPERTY_TIMESTAMP,
	BotReboardingOfferEvent.JSON_PROPERTY_EVENT_TYPE,
	BotReboardingOfferEvent.JSON_PROPERTY_ACCOUNT_ID,
	BotReboardingOfferEvent.JSON_PROPERTY_DIALOG_TOKEN,
	BotReboardingOfferEvent.JSON_PROPERTY_REBOARDING_PERSON,
	BotReboardingOfferEvent.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotReboardingOfferEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTREBOARDINGOFFEREVENT("BotReboardingOfferEvent");

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
			return TypeEnum.BOTREBOARDINGOFFEREVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTREBOARDINGOFFEREVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_REBOARDING_PERSON = "reboardingPerson";
	@JsonProperty(JSON_PROPERTY_REBOARDING_PERSON)
	private PersonData reboardingPerson = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public BotReboardingOfferEvent $type(TypeEnum $type) {
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

	public BotReboardingOfferEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public BotReboardingOfferEvent eventType(String eventType) {
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

	public BotReboardingOfferEvent accountId(String accountId) {
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

	public BotReboardingOfferEvent dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The dialog token for this bot, used to identify this reboarding via the bot web API
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The dialog token for this bot, used to identify this reboarding via the bot web API")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotReboardingOfferEvent reboardingPerson(PersonData reboardingPerson) {
		this.reboardingPerson = reboardingPerson;
		return this;
	}

	/**
	 * Get reboardingPerson
	 * 
	 * @return reboardingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getReboardingPerson() {
		return reboardingPerson;
	}

	public void setReboardingPerson(PersonData reboardingPerson) {
		this.reboardingPerson = reboardingPerson;
	}

	public BotReboardingOfferEvent conversation(ConversationData conversation) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotReboardingOfferEvent botReboardingOfferEvent = (BotReboardingOfferEvent) o;
		return Objects.equals(this.$type, botReboardingOfferEvent.$type) &&
				Objects.equals(this.timestamp, botReboardingOfferEvent.timestamp) &&
				Objects.equals(this.eventType, botReboardingOfferEvent.eventType) &&
				Objects.equals(this.accountId, botReboardingOfferEvent.accountId) &&
				Objects.equals(this.dialogToken, botReboardingOfferEvent.dialogToken) &&
				Objects.equals(this.reboardingPerson, botReboardingOfferEvent.reboardingPerson) &&
				Objects.equals(this.conversation, botReboardingOfferEvent.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, dialogToken, reboardingPerson, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotReboardingOfferEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    reboardingPerson: ").append(toIndentedString(reboardingPerson)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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
