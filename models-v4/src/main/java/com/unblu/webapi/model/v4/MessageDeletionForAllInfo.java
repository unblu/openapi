
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
 * Message deletion information for messages deleted for all participants
 */
@ApiModel(description = "Message deletion information for messages deleted for all participants")

@JsonPropertyOrder({
	MessageDeletionForAllInfo.JSON_PROPERTY_$_TYPE,
	MessageDeletionForAllInfo.JSON_PROPERTY_PERSON_ID,
	MessageDeletionForAllInfo.JSON_PROPERTY_DELETION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessageDeletionForAllInfo {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGEDELETIONFORALLINFO("MessageDeletionForAllInfo");

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
			return TypeEnum.MESSAGEDELETIONFORALLINFO;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGEDELETIONFORALLINFO;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_DELETION_TIMESTAMP = "deletionTimestamp";
	@JsonProperty(JSON_PROPERTY_DELETION_TIMESTAMP)
	private Long deletionTimestamp;

	public MessageDeletionForAllInfo $type(TypeEnum $type) {
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

	public MessageDeletionForAllInfo personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The ID of the person who marked the message as deleted for all participants
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The ID of the person who marked the message as deleted for all participants")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public MessageDeletionForAllInfo deletionTimestamp(Long deletionTimestamp) {
		this.deletionTimestamp = deletionTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the message was deleted
	 * 
	 * @return deletionTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the message was deleted")
	public Long getDeletionTimestamp() {
		return deletionTimestamp;
	}

	public void setDeletionTimestamp(Long deletionTimestamp) {
		this.deletionTimestamp = deletionTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageDeletionForAllInfo messageDeletionForAllInfo = (MessageDeletionForAllInfo) o;
		return Objects.equals(this.$type, messageDeletionForAllInfo.$type) &&
				Objects.equals(this.personId, messageDeletionForAllInfo.personId) &&
				Objects.equals(this.deletionTimestamp, messageDeletionForAllInfo.deletionTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, personId, deletionTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageDeletionForAllInfo {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
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
