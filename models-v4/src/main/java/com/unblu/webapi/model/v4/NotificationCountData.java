
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
 * Notification count information data of a Person.&lt;br&gt;
 */
@ApiModel(description = "Notification count information data of a Person.<br>")

@JsonPropertyOrder({
	NotificationCountData.JSON_PROPERTY_$_TYPE,
	NotificationCountData.JSON_PROPERTY_PERSON_ID,
	NotificationCountData.JSON_PROPERTY_TOTAL_NOTIFICATION_COUNT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotificationCountData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTIFICATIONCOUNTDATA("NotificationCountData");

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
			return TypeEnum.NOTIFICATIONCOUNTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTIFICATIONCOUNTDATA;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_TOTAL_NOTIFICATION_COUNT = "totalNotificationCount";
	@JsonProperty(JSON_PROPERTY_TOTAL_NOTIFICATION_COUNT)
	private Integer totalNotificationCount;

	public NotificationCountData $type(TypeEnum $type) {
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

	public NotificationCountData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The ID of the person this notification count belongs to
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The ID of the person this notification count belongs to")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public NotificationCountData totalNotificationCount(Integer totalNotificationCount) {
		this.totalNotificationCount = totalNotificationCount;
		return this;
	}

	/**
	 * The sum of all a person&#39;s notifications across all their conversations
	 * 
	 * @return totalNotificationCount
	 **/
	@ApiModelProperty(value = "The sum of all a person's notifications across all their conversations")
	public Integer getTotalNotificationCount() {
		return totalNotificationCount;
	}

	public void setTotalNotificationCount(Integer totalNotificationCount) {
		this.totalNotificationCount = totalNotificationCount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NotificationCountData notificationCountData = (NotificationCountData) o;
		return Objects.equals(this.$type, notificationCountData.$type) &&
				Objects.equals(this.personId, notificationCountData.personId) &&
				Objects.equals(this.totalNotificationCount, notificationCountData.totalNotificationCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, personId, totalNotificationCount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotificationCountData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    totalNotificationCount: ").append(toIndentedString(totalNotificationCount)).append("\n");
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
