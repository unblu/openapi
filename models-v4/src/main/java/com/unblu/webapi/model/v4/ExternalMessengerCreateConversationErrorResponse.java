
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
 * Failure response to an &#x60;ExternalMessengerCreateConversationRequest&#x60; request. &lt;p&gt; This should be returned if the request to create a
 * conversation for the external messenger failed. Provide a meaningful &#x60;errorText&#x60; which can be presented to the user who triggered the request.
 */
@ApiModel(description = "Failure response to an `ExternalMessengerCreateConversationRequest` request. <p> This should be returned if the request to create a conversation for the external messenger failed. Provide a meaningful `errorText` which can be presented to the user who triggered the request.")

@JsonPropertyOrder({
	ExternalMessengerCreateConversationErrorResponse.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateConversationErrorResponse.JSON_PROPERTY_TYPE,
	ExternalMessengerCreateConversationErrorResponse.JSON_PROPERTY_ERROR_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateConversationErrorResponse implements ExternalMessengerCreateConversationResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONVERSATIONERRORRESPONSE("ExternalMessengerCreateConversationErrorResponse");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONERRORRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONERRORRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EExternalMessengerConversationCreationResponseType type = EExternalMessengerConversationCreationResponseType.ERROR;

	public static final String JSON_PROPERTY_ERROR_TEXT = "errorText";
	@JsonProperty(JSON_PROPERTY_ERROR_TEXT)
	private String errorText;

	public ExternalMessengerCreateConversationErrorResponse $type(TypeEnum $type) {
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

	public ExternalMessengerCreateConversationErrorResponse type(EExternalMessengerConversationCreationResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EExternalMessengerConversationCreationResponseType getType() {
		return type;
	}

	public void setType(EExternalMessengerConversationCreationResponseType type) {
		this.type = type;
	}

	public ExternalMessengerCreateConversationErrorResponse errorText(String errorText) {
		this.errorText = errorText;
		return this;
	}

	/**
	 * The error text why the request failed
	 * 
	 * @return errorText
	 **/
	@ApiModelProperty(value = "The error text why the request failed")
	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerCreateConversationErrorResponse externalMessengerCreateConversationErrorResponse = (ExternalMessengerCreateConversationErrorResponse) o;
		return Objects.equals(this.$type, externalMessengerCreateConversationErrorResponse.$type) &&
				Objects.equals(this.type, externalMessengerCreateConversationErrorResponse.type) &&
				Objects.equals(this.errorText, externalMessengerCreateConversationErrorResponse.errorText);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, errorText);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateConversationErrorResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
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
