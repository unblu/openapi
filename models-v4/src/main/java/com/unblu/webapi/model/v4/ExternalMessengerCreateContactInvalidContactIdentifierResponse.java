
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
 * Failure response to an &#x60;ExternalMessengerCreateContactRequest&#x60; request. &lt;p&gt; This should be returned if the request to create a contact for
 * the external messenger failed because the contact identifier is invalid.
 */
@ApiModel(description = "Failure response to an `ExternalMessengerCreateContactRequest` request. <p> This should be returned if the request to create a contact for the external messenger failed because the contact identifier is invalid.")

@JsonPropertyOrder({
	ExternalMessengerCreateContactInvalidContactIdentifierResponse.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateContactInvalidContactIdentifierResponse.JSON_PROPERTY_TYPE,
	ExternalMessengerCreateContactInvalidContactIdentifierResponse.JSON_PROPERTY_ERROR_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateContactInvalidContactIdentifierResponse implements ExternalMessengerCreateContactResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONTACTINVALIDCONTACTIDENTIFIERRESPONSE("ExternalMessengerCreateContactInvalidContactIdentifierResponse");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONTACTINVALIDCONTACTIDENTIFIERRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONTACTINVALIDCONTACTIDENTIFIERRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EExternalMessengerContactCreationResponseType type = EExternalMessengerContactCreationResponseType.INVALID_CONTACT_IDENTIFIER;

	public static final String JSON_PROPERTY_ERROR_TEXT = "errorText";
	@JsonProperty(JSON_PROPERTY_ERROR_TEXT)
	private String errorText;

	public ExternalMessengerCreateContactInvalidContactIdentifierResponse $type(TypeEnum $type) {
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

	public ExternalMessengerCreateContactInvalidContactIdentifierResponse type(EExternalMessengerContactCreationResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EExternalMessengerContactCreationResponseType getType() {
		return type;
	}

	public void setType(EExternalMessengerContactCreationResponseType type) {
		this.type = type;
	}

	public ExternalMessengerCreateContactInvalidContactIdentifierResponse errorText(String errorText) {
		this.errorText = errorText;
		return this;
	}

	/**
	 * The error text why the contact identifier is invalid, for example, because a specific format is expected
	 * 
	 * @return errorText
	 **/
	@ApiModelProperty(value = "The error text why the contact identifier is invalid, for example, because a specific format is expected")
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
		ExternalMessengerCreateContactInvalidContactIdentifierResponse externalMessengerCreateContactInvalidContactIdentifierResponse = (ExternalMessengerCreateContactInvalidContactIdentifierResponse) o;
		return Objects.equals(this.$type, externalMessengerCreateContactInvalidContactIdentifierResponse.$type) &&
				Objects.equals(this.type, externalMessengerCreateContactInvalidContactIdentifierResponse.type) &&
				Objects.equals(this.errorText, externalMessengerCreateContactInvalidContactIdentifierResponse.errorText);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, errorText);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateContactInvalidContactIdentifierResponse {\n");
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
