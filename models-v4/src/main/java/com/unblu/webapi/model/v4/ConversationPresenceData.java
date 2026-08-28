
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
 * Model of a conversation presence.&lt;br&gt; A conversation presence represents the time span during which a person was actively connected to a conversation
 * with a specific device. This means a single person can have multiple parallel conversation presences if they are connected to the same conversation with
 * multiple devices.
 */
@ApiModel(description = "Model of a conversation presence.<br> A conversation presence represents the time span during which a person was actively connected to a conversation with a specific device. This means a single person can have multiple parallel conversation presences if they are connected to the same conversation with multiple devices.")

@JsonPropertyOrder({
	ConversationPresenceData.JSON_PROPERTY_$_TYPE,
	ConversationPresenceData.JSON_PROPERTY_ID,
	ConversationPresenceData.JSON_PROPERTY_ACCOUNT_ID,
	ConversationPresenceData.JSON_PROPERTY_PERSON_PRESENCE,
	ConversationPresenceData.JSON_PROPERTY_CONVERSATION_ID,
	ConversationPresenceData.JSON_PROPERTY_JOINED_TIMESTAMP,
	ConversationPresenceData.JSON_PROPERTY_LEFT_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationPresenceData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONPRESENCEDATA("ConversationPresenceData");

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
			return TypeEnum.CONVERSATIONPRESENCEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONPRESENCEDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_PERSON_PRESENCE = "personPresence";
	@JsonProperty(JSON_PROPERTY_PERSON_PRESENCE)
	private PersonPresenceData personPresence = null;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_JOINED_TIMESTAMP = "joinedTimestamp";
	@JsonProperty(JSON_PROPERTY_JOINED_TIMESTAMP)
	private Long joinedTimestamp;

	public static final String JSON_PROPERTY_LEFT_TIMESTAMP = "leftTimestamp";
	@JsonProperty(JSON_PROPERTY_LEFT_TIMESTAMP)
	private Long leftTimestamp;

	public ConversationPresenceData $type(TypeEnum $type) {
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

	public ConversationPresenceData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationPresenceData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account that an entity belongs to.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account that an entity belongs to.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ConversationPresenceData personPresence(PersonPresenceData personPresence) {
		this.personPresence = personPresence;
		return this;
	}

	/**
	 * Get personPresence
	 * 
	 * @return personPresence
	 **/
	@ApiModelProperty(value = "")
	public PersonPresenceData getPersonPresence() {
		return personPresence;
	}

	public void setPersonPresence(PersonPresenceData personPresence) {
		this.personPresence = personPresence;
	}

	public ConversationPresenceData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Conversation ID that an entity belongs to.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Conversation ID that an entity belongs to.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationPresenceData joinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the device of the person connected to the conversation.
	 * 
	 * @return joinedTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the device of the person connected to the conversation.")
	public Long getJoinedTimestamp() {
		return joinedTimestamp;
	}

	public void setJoinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
	}

	public ConversationPresenceData leftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the device of the person disconnected from the conversation. &#x60;null&#x60; while the person is still connected to the
	 * conversation.
	 * 
	 * @return leftTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the device of the person disconnected from the conversation. `null` while the person is still connected to the conversation.")
	public Long getLeftTimestamp() {
		return leftTimestamp;
	}

	public void setLeftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationPresenceData conversationPresenceData = (ConversationPresenceData) o;
		return Objects.equals(this.$type, conversationPresenceData.$type) &&
				Objects.equals(this.id, conversationPresenceData.id) &&
				Objects.equals(this.accountId, conversationPresenceData.accountId) &&
				Objects.equals(this.personPresence, conversationPresenceData.personPresence) &&
				Objects.equals(this.conversationId, conversationPresenceData.conversationId) &&
				Objects.equals(this.joinedTimestamp, conversationPresenceData.joinedTimestamp) &&
				Objects.equals(this.leftTimestamp, conversationPresenceData.leftTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, personPresence, conversationId, joinedTimestamp, leftTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationPresenceData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    personPresence: ").append(toIndentedString(personPresence)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    joinedTimestamp: ").append(toIndentedString(joinedTimestamp)).append("\n");
		sb.append("    leftTimestamp: ").append(toIndentedString(leftTimestamp)).append("\n");
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
