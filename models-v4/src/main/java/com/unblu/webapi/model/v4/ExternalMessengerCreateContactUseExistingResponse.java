
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
 * Success response to an &#x60;ExternalMessengerCreateContactRequest&#x60; request. &lt;p&gt; This response can be given to use an existing
 * &#x60;ExternalMessengerContact&#x60;. The response must contain the ID of the contact on the Collaboration Server, it has still to match the data which were
 * send with the request.
 */
@ApiModel(description = "Success response to an `ExternalMessengerCreateContactRequest` request. <p> This response can be given to use an existing `ExternalMessengerContact`. The response must contain the ID of the contact on the Collaboration Server, it has still to match the data which were send with the request.")

@JsonPropertyOrder({
	ExternalMessengerCreateContactUseExistingResponse.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateContactUseExistingResponse.JSON_PROPERTY_TYPE,
	ExternalMessengerCreateContactUseExistingResponse.JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateContactUseExistingResponse implements ExternalMessengerCreateContactResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONTACTUSEEXISTINGRESPONSE("ExternalMessengerCreateContactUseExistingResponse");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONTACTUSEEXISTINGRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONTACTUSEEXISTINGRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EExternalMessengerContactCreationResponseType type = EExternalMessengerContactCreationResponseType.USE_EXISTING;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID = "externalMessengerContactId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID)
	private String externalMessengerContactId;

	public ExternalMessengerCreateContactUseExistingResponse $type(TypeEnum $type) {
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

	public ExternalMessengerCreateContactUseExistingResponse type(EExternalMessengerContactCreationResponseType type) {
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

	public ExternalMessengerCreateContactUseExistingResponse externalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
		return this;
	}

	/**
	 * The ID of the &#x60;ExternalMessengerContact&#x60; created when processing the &#x60;ExternalMessengerCreateContactRequest&#x60; request
	 * 
	 * @return externalMessengerContactId
	 **/
	@ApiModelProperty(value = "The ID of the `ExternalMessengerContact` created when processing the `ExternalMessengerCreateContactRequest` request")
	public String getExternalMessengerContactId() {
		return externalMessengerContactId;
	}

	public void setExternalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerCreateContactUseExistingResponse externalMessengerCreateContactUseExistingResponse = (ExternalMessengerCreateContactUseExistingResponse) o;
		return Objects.equals(this.$type, externalMessengerCreateContactUseExistingResponse.$type) &&
				Objects.equals(this.type, externalMessengerCreateContactUseExistingResponse.type) &&
				Objects.equals(this.externalMessengerContactId, externalMessengerCreateContactUseExistingResponse.externalMessengerContactId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, externalMessengerContactId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateContactUseExistingResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    externalMessengerContactId: ").append(toIndentedString(externalMessengerContactId)).append("\n");
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
