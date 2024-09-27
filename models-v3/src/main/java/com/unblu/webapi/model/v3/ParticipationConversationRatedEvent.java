
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
 * An event triggered every time a participant rates a conversation
 */
@ApiModel(description = "An event triggered every time a participant rates a conversation")

@JsonPropertyOrder({
	ParticipationConversationRatedEvent.JSON_PROPERTY_$_TYPE,
	ParticipationConversationRatedEvent.JSON_PROPERTY_TIMESTAMP,
	ParticipationConversationRatedEvent.JSON_PROPERTY_EVENT_TYPE,
	ParticipationConversationRatedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ParticipationConversationRatedEvent.JSON_PROPERTY_PARTICIPATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ParticipationConversationRatedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PARTICIPATIONCONVERSATIONRATEDEVENT("ParticipationConversationRatedEvent");

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
			return TypeEnum.PARTICIPATIONCONVERSATIONRATEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PARTICIPATIONCONVERSATIONRATEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_PARTICIPATION = "participation";
	@JsonProperty(JSON_PROPERTY_PARTICIPATION)
	private ConversationParticipationData participation = null;

	public ParticipationConversationRatedEvent $type(TypeEnum $type) {
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

	public ParticipationConversationRatedEvent timestamp(Long timestamp) {
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

	public ParticipationConversationRatedEvent eventType(String eventType) {
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

	public ParticipationConversationRatedEvent accountId(String accountId) {
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

	public ParticipationConversationRatedEvent participation(ConversationParticipationData participation) {
		this.participation = participation;
		return this;
	}

	/**
	 * Get participation
	 * 
	 * @return participation
	 **/
	@ApiModelProperty(value = "")
	public ConversationParticipationData getParticipation() {
		return participation;
	}

	public void setParticipation(ConversationParticipationData participation) {
		this.participation = participation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ParticipationConversationRatedEvent participationConversationRatedEvent = (ParticipationConversationRatedEvent) o;
		return Objects.equals(this.$type, participationConversationRatedEvent.$type) &&
				Objects.equals(this.timestamp, participationConversationRatedEvent.timestamp) &&
				Objects.equals(this.eventType, participationConversationRatedEvent.eventType) &&
				Objects.equals(this.accountId, participationConversationRatedEvent.accountId) &&
				Objects.equals(this.participation, participationConversationRatedEvent.participation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, participation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ParticipationConversationRatedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
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