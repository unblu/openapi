
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * PersonOutOfOfficeBody
 */

@JsonPropertyOrder({
	PersonOutOfOfficeBody.JSON_PROPERTY_$_TYPE,
	PersonOutOfOfficeBody.JSON_PROPERTY_STATUS_MESSAGE,
	PersonOutOfOfficeBody.JSON_PROPERTY_OUT_OF_OFFICE_START_TIMESTAMP,
	PersonOutOfOfficeBody.JSON_PROPERTY_OUT_OF_OFFICE_END_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonOutOfOfficeBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERSONOUTOFOFFICEBODY("PersonOutOfOfficeBody");

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
			return TypeEnum.PERSONOUTOFOFFICEBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERSONOUTOFOFFICEBODY;

	public static final String JSON_PROPERTY_STATUS_MESSAGE = "statusMessage";
	@JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
	private String statusMessage;

	public static final String JSON_PROPERTY_OUT_OF_OFFICE_START_TIMESTAMP = "outOfOfficeStartTimestamp";
	@JsonProperty(JSON_PROPERTY_OUT_OF_OFFICE_START_TIMESTAMP)
	private Long outOfOfficeStartTimestamp;

	public static final String JSON_PROPERTY_OUT_OF_OFFICE_END_TIMESTAMP = "outOfOfficeEndTimestamp";
	@JsonProperty(JSON_PROPERTY_OUT_OF_OFFICE_END_TIMESTAMP)
	private Long outOfOfficeEndTimestamp;

	public PersonOutOfOfficeBody $type(TypeEnum $type) {
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

	public PersonOutOfOfficeBody statusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
		return this;
	}

	/**
	 * Status message for an agent who&#39;s out of office. Displayed in the user profile.
	 * 
	 * @return statusMessage
	 **/
	@ApiModelProperty(value = "Status message for an agent who's out of office. Displayed in the user profile.")
	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public PersonOutOfOfficeBody outOfOfficeStartTimestamp(Long outOfOfficeStartTimestamp) {
		this.outOfOfficeStartTimestamp = outOfOfficeStartTimestamp;
		return this;
	}

	/**
	 * The start timestamp for the out of office state of an agent.
	 * 
	 * @return outOfOfficeStartTimestamp
	 **/
	@ApiModelProperty(value = "The start timestamp for the out of office state of an agent.")
	public Long getOutOfOfficeStartTimestamp() {
		return outOfOfficeStartTimestamp;
	}

	public void setOutOfOfficeStartTimestamp(Long outOfOfficeStartTimestamp) {
		this.outOfOfficeStartTimestamp = outOfOfficeStartTimestamp;
	}

	public PersonOutOfOfficeBody outOfOfficeEndTimestamp(Long outOfOfficeEndTimestamp) {
		this.outOfOfficeEndTimestamp = outOfOfficeEndTimestamp;
		return this;
	}

	/**
	 * The end timestamp for the out of office state of an agent.
	 * 
	 * @return outOfOfficeEndTimestamp
	 **/
	@ApiModelProperty(value = "The end timestamp for the out of office state of an agent.")
	public Long getOutOfOfficeEndTimestamp() {
		return outOfOfficeEndTimestamp;
	}

	public void setOutOfOfficeEndTimestamp(Long outOfOfficeEndTimestamp) {
		this.outOfOfficeEndTimestamp = outOfOfficeEndTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonOutOfOfficeBody personOutOfOfficeBody = (PersonOutOfOfficeBody) o;
		return Objects.equals(this.$type, personOutOfOfficeBody.$type) &&
				Objects.equals(this.statusMessage, personOutOfOfficeBody.statusMessage) &&
				Objects.equals(this.outOfOfficeStartTimestamp, personOutOfOfficeBody.outOfOfficeStartTimestamp) &&
				Objects.equals(this.outOfOfficeEndTimestamp, personOutOfOfficeBody.outOfOfficeEndTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, statusMessage, outOfOfficeStartTimestamp, outOfOfficeEndTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonOutOfOfficeBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
		sb.append("    outOfOfficeStartTimestamp: ").append(toIndentedString(outOfOfficeStartTimestamp)).append("\n");
		sb.append("    outOfOfficeEndTimestamp: ").append(toIndentedString(outOfOfficeEndTimestamp)).append("\n");
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
