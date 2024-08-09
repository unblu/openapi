
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationCountForConversationsData
 */

@JsonPropertyOrder({
	NotificationCountForConversationsData.JSON_PROPERTY_$_TYPE,
	NotificationCountForConversationsData.JSON_PROPERTY_NOTIFICATION_COUNT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotificationCountForConversationsData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTIFICATIONCOUNTFORCONVERSATIONSDATA("NotificationCountForConversationsData");

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
			return TypeEnum.NOTIFICATIONCOUNTFORCONVERSATIONSDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTIFICATIONCOUNTFORCONVERSATIONSDATA;

	public static final String JSON_PROPERTY_NOTIFICATION_COUNT = "notificationCount";
	@JsonProperty(JSON_PROPERTY_NOTIFICATION_COUNT)
	private Integer notificationCount;

	public NotificationCountForConversationsData $type(TypeEnum $type) {
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

	public NotificationCountForConversationsData notificationCount(Integer notificationCount) {
		this.notificationCount = notificationCount;
		return this;
	}

	/**
	 * The sum of all a person&#39;s notifications across a given set of conversations
	 * 
	 * @return notificationCount
	 **/
	@ApiModelProperty(value = "The sum of all a person's notifications across a given set of conversations")
	public Integer getNotificationCount() {
		return notificationCount;
	}

	public void setNotificationCount(Integer notificationCount) {
		this.notificationCount = notificationCount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NotificationCountForConversationsData notificationCountForConversationsData = (NotificationCountForConversationsData) o;
		return Objects.equals(this.$type, notificationCountForConversationsData.$type) &&
				Objects.equals(this.notificationCount, notificationCountForConversationsData.notificationCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, notificationCount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotificationCountForConversationsData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    notificationCount: ").append(toIndentedString(notificationCount)).append("\n");
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
