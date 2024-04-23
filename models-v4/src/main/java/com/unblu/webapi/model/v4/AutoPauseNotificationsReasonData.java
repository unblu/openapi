
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
 * Data of an AutoPauseNotificationsReason.
 */
@ApiModel(description = "Data of an AutoPauseNotificationsReason.")

@JsonPropertyOrder({
	AutoPauseNotificationsReasonData.JSON_PROPERTY_$_TYPE,
	AutoPauseNotificationsReasonData.JSON_PROPERTY_SOURCE_ID,
	AutoPauseNotificationsReasonData.JSON_PROPERTY_DISPLAY_NAME,
	AutoPauseNotificationsReasonData.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AutoPauseNotificationsReasonData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AUTOPAUSENOTIFICATIONSREASONDATA("AutoPauseNotificationsReasonData");

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
			return TypeEnum.AUTOPAUSENOTIFICATIONSREASONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AUTOPAUSENOTIFICATIONSREASONDATA;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public AutoPauseNotificationsReasonData $type(TypeEnum $type) {
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

	public AutoPauseNotificationsReasonData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * A custom identifier for the reason to auto-pause notifications.&lt;br&gt; Max length is 36 characters.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "A custom identifier for the reason to auto-pause notifications.<br> Max length is 36 characters.")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public AutoPauseNotificationsReasonData displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * The name of the reason to auto-pause notifications that will appear in the UI
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "The name of the reason to auto-pause notifications that will appear in the UI")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public AutoPauseNotificationsReasonData expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * The Unix timestamp (ms) when the auto-pause expires
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "The Unix timestamp (ms) when the auto-pause expires")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AutoPauseNotificationsReasonData autoPauseNotificationsReasonData = (AutoPauseNotificationsReasonData) o;
		return Objects.equals(this.$type, autoPauseNotificationsReasonData.$type) &&
				Objects.equals(this.sourceId, autoPauseNotificationsReasonData.sourceId) &&
				Objects.equals(this.displayName, autoPauseNotificationsReasonData.displayName) &&
				Objects.equals(this.expirationTimestamp, autoPauseNotificationsReasonData.expirationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, sourceId, displayName, expirationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AutoPauseNotificationsReasonData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
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
