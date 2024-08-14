
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

import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationCountForConversationsRequest
 */

@JsonPropertyOrder({
	NotificationCountForConversationsRequest.JSON_PROPERTY_$_TYPE,
	NotificationCountForConversationsRequest.JSON_PROPERTY_CONVERSATION_IDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotificationCountForConversationsRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTIFICATIONCOUNTFORCONVERSATIONSREQUEST("NotificationCountForConversationsRequest");

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
			return TypeEnum.NOTIFICATIONCOUNTFORCONVERSATIONSREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTIFICATIONCOUNTFORCONVERSATIONSREQUEST;

	public static final String JSON_PROPERTY_CONVERSATION_IDS = "conversationIds";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_IDS)
	private List<String> conversationIds = null;

	public NotificationCountForConversationsRequest $type(TypeEnum $type) {
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

	public NotificationCountForConversationsRequest conversationIds(List<String> conversationIds) {
		this.conversationIds = conversationIds;
		return this;
	}

	public NotificationCountForConversationsRequest addConversationIdsItem(String conversationIdsItem) {
		if (this.conversationIds == null) {
			this.conversationIds = new ArrayList<>();
		}
		this.conversationIds.add(conversationIdsItem);
		return this;
	}

	/**
	 * List of the conversation IDs to use when determining the number of notifications for a person
	 * 
	 * @return conversationIds
	 **/
	@ApiModelProperty(value = "List of the conversation IDs to use when determining the number of notifications for a person")
	public List<String> getConversationIds() {
		return conversationIds;
	}

	public void setConversationIds(List<String> conversationIds) {
		this.conversationIds = conversationIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NotificationCountForConversationsRequest notificationCountForConversationsRequest = (NotificationCountForConversationsRequest) o;
		return Objects.equals(this.$type, notificationCountForConversationsRequest.$type) &&
				Objects.equals(this.conversationIds, notificationCountForConversationsRequest.conversationIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotificationCountForConversationsRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
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
