
package com.unblu.webapi.model.v3;

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
 * Event sent when a person offboards a conversation, giving the bot a chance to participate in the offboarding of this person. &lt;p&gt; This may be triggered
 * by several things: &lt;ul&gt; &lt;li&gt;&lt;b&gt;A person leaves a conversation:&lt;/b&gt; A bot can participate in the offboarding process of this
 * person.&lt;/li&gt; &lt;li&gt;&lt;b&gt;A conversation is ended:&lt;/b&gt; A bot can participate in the offboarding process for every person in the
 * conversation.&lt;/li&gt; &lt;/ul&gt; A bot can accept or decline the dialog offer by responding via the bot web API with the given
 * &#x60;offboardingToken&#x60;. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;if the offboarding person does not fit the offboarding filter defined
 * in the &#x60;DialogBot&#x60; the webhook will not be sent to it&#39;s endpoint.&lt;/li&gt; &lt;li&gt;the bot MUST respond to this webhook or else the
 * offboarding person will have to wait for a timeout before it can proceed it&#39;s offboarding&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Event sent when a person offboards a conversation, giving the bot a chance to participate in the offboarding of this person. <p> This may be triggered by several things: <ul> <li><b>A person leaves a conversation:</b> A bot can participate in the offboarding process of this person.</li> <li><b>A conversation is ended:</b> A bot can participate in the offboarding process for every person in the conversation.</li> </ul> A bot can accept or decline the dialog offer by responding via the bot web API with the given `offboardingToken`. <p> <b>Note:</b> <ul> <li>if the offboarding person does not fit the offboarding filter defined in the `DialogBot` the webhook will not be sent to it's endpoint.</li> <li>the bot MUST respond to this webhook or else the offboarding person will have to wait for a timeout before it can proceed it's offboarding</li> </ul>")

@JsonPropertyOrder({
	BotOffboardingOfferEvent.JSON_PROPERTY_$_TYPE,
	BotOffboardingOfferEvent.JSON_PROPERTY_TIMESTAMP,
	BotOffboardingOfferEvent.JSON_PROPERTY_EVENT_TYPE,
	BotOffboardingOfferEvent.JSON_PROPERTY_ACCOUNT_ID,
	BotOffboardingOfferEvent.JSON_PROPERTY_OFFBOARDING_TOKEN,
	BotOffboardingOfferEvent.JSON_PROPERTY_OFFBOARDING_PERSON,
	BotOffboardingOfferEvent.JSON_PROPERTY_OFFBOARDING_REASON,
	BotOffboardingOfferEvent.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotOffboardingOfferEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTOFFBOARDINGOFFEREVENT("BotOffboardingOfferEvent");

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
			return TypeEnum.BOTOFFBOARDINGOFFEREVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTOFFBOARDINGOFFEREVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_OFFBOARDING_TOKEN = "offboardingToken";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_TOKEN)
	private String offboardingToken;

	public static final String JSON_PROPERTY_OFFBOARDING_PERSON = "offboardingPerson";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_PERSON)
	private PersonData offboardingPerson = null;

	public static final String JSON_PROPERTY_OFFBOARDING_REASON = "offboardingReason";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_REASON)
	private EOffboardingReason offboardingReason;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public BotOffboardingOfferEvent $type(TypeEnum $type) {
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

	public BotOffboardingOfferEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (unix time in millies) that the event was generated.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (unix time in millies) that the event was generated.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public BotOffboardingOfferEvent eventType(String eventType) {
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

	public BotOffboardingOfferEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BotOffboardingOfferEvent offboardingToken(String offboardingToken) {
		this.offboardingToken = offboardingToken;
		return this;
	}

	/**
	 * The unique offboarding token for this bot used to identify this offboarding via the bot web API.
	 * 
	 * @return offboardingToken
	 **/
	@ApiModelProperty(value = "The unique offboarding token for this bot used to identify this offboarding via the bot web API.")
	public String getOffboardingToken() {
		return offboardingToken;
	}

	public void setOffboardingToken(String offboardingToken) {
		this.offboardingToken = offboardingToken;
	}

	public BotOffboardingOfferEvent offboardingPerson(PersonData offboardingPerson) {
		this.offboardingPerson = offboardingPerson;
		return this;
	}

	/**
	 * Get offboardingPerson
	 * 
	 * @return offboardingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getOffboardingPerson() {
		return offboardingPerson;
	}

	public void setOffboardingPerson(PersonData offboardingPerson) {
		this.offboardingPerson = offboardingPerson;
	}

	public BotOffboardingOfferEvent offboardingReason(EOffboardingReason offboardingReason) {
		this.offboardingReason = offboardingReason;
		return this;
	}

	/**
	 * Get offboardingReason
	 * 
	 * @return offboardingReason
	 **/
	@ApiModelProperty(value = "")
	public EOffboardingReason getOffboardingReason() {
		return offboardingReason;
	}

	public void setOffboardingReason(EOffboardingReason offboardingReason) {
		this.offboardingReason = offboardingReason;
	}

	public BotOffboardingOfferEvent conversation(ConversationData conversation) {
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
		BotOffboardingOfferEvent botOffboardingOfferEvent = (BotOffboardingOfferEvent) o;
		return Objects.equals(this.$type, botOffboardingOfferEvent.$type) &&
				Objects.equals(this.timestamp, botOffboardingOfferEvent.timestamp) &&
				Objects.equals(this.eventType, botOffboardingOfferEvent.eventType) &&
				Objects.equals(this.accountId, botOffboardingOfferEvent.accountId) &&
				Objects.equals(this.offboardingToken, botOffboardingOfferEvent.offboardingToken) &&
				Objects.equals(this.offboardingPerson, botOffboardingOfferEvent.offboardingPerson) &&
				Objects.equals(this.offboardingReason, botOffboardingOfferEvent.offboardingReason) &&
				Objects.equals(this.conversation, botOffboardingOfferEvent.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, offboardingToken, offboardingPerson, offboardingReason, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotOffboardingOfferEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    offboardingToken: ").append(toIndentedString(offboardingToken)).append("\n");
		sb.append("    offboardingPerson: ").append(toIndentedString(offboardingPerson)).append("\n");
		sb.append("    offboardingReason: ").append(toIndentedString(offboardingReason)).append("\n");
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
