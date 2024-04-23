
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
 * Error
 */

@JsonPropertyOrder({
	Error.JSON_PROPERTY_$_TYPE,
	Error.JSON_PROPERTY_STATUS_CODE,
	Error.JSON_PROPERTY_STATUS_DESCRIPTION,
	Error.JSON_PROPERTY_ERROR_MESSAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Error {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ERROR("Error");

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
			return TypeEnum.ERROR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ERROR;

	public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
	@JsonProperty(JSON_PROPERTY_STATUS_CODE)
	private Integer statusCode;

	public static final String JSON_PROPERTY_STATUS_DESCRIPTION = "statusDescription";
	@JsonProperty(JSON_PROPERTY_STATUS_DESCRIPTION)
	private String statusDescription;

	public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
	@JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
	private String errorMessage;

	public Error $type(TypeEnum $type) {
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

	public Error statusCode(Integer statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	/**
	 * Http status code
	 * 
	 * @return statusCode
	 **/
	@ApiModelProperty(value = "Http status code")
	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Error statusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
		return this;
	}

	/**
	 * Reason phrase corresponding to the http status
	 * 
	 * @return statusDescription
	 **/
	@ApiModelProperty(value = "Reason phrase corresponding to the http status")
	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Error errorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		return this;
	}

	/**
	 * Description of the error
	 * 
	 * @return errorMessage
	 **/
	@ApiModelProperty(value = "Description of the error")
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Error error = (Error) o;
		return Objects.equals(this.$type, error.$type) &&
				Objects.equals(this.statusCode, error.statusCode) &&
				Objects.equals(this.statusDescription, error.statusDescription) &&
				Objects.equals(this.errorMessage, error.errorMessage);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, statusCode, statusDescription, errorMessage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
		sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
		sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
