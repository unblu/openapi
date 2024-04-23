
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
 * Success response to an &#x60;ExternalMessengerCreateContactRequest&#x60; request. &lt;p&gt; This response can be given to let the collaboration server create
 * an &#x60;ExternalMessengerContact&#x60; which will be linked to the person in the request.
 */
@ApiModel(description = "Success response to an `ExternalMessengerCreateContactRequest` request. <p> This response can be given to let the collaboration server create an `ExternalMessengerContact` which will be linked to the person in the request.")

@JsonPropertyOrder({
	ExternalMessengerCreateContactCreateResponse.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateContactCreateResponse.JSON_PROPERTY_TYPE,
	ExternalMessengerCreateContactCreateResponse.JSON_PROPERTY_NAME,
	ExternalMessengerCreateContactCreateResponse.JSON_PROPERTY_SOURCE_ID,
	ExternalMessengerCreateContactCreateResponse.JSON_PROPERTY_DESCRIPTION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateContactCreateResponse implements ExternalMessengerCreateContactResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONTACTCREATERESPONSE("ExternalMessengerCreateContactCreateResponse");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONTACTCREATERESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONTACTCREATERESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EExternalMessengerContactCreationResponseType type = EExternalMessengerContactCreationResponseType.CREATE;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public ExternalMessengerCreateContactCreateResponse $type(TypeEnum $type) {
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

	public ExternalMessengerCreateContactCreateResponse type(EExternalMessengerContactCreationResponseType type) {
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

	public ExternalMessengerCreateContactCreateResponse name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The ID of the &#x60;ExternalMessengerContact&#x60; created when processing the &#x60;ExternalMessengerCreateContactRequest&#x60; request
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The ID of the `ExternalMessengerContact` created when processing the `ExternalMessengerCreateContactRequest` request")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExternalMessengerCreateContactCreateResponse sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * The source ID of the &#x60;ExternalMessengerContact&#x60; to identify the contact in the external messenger.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "The source ID of the `ExternalMessengerContact` to identify the contact in the external messenger.")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public ExternalMessengerCreateContactCreateResponse description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The description of the &#x60;ExternalMessengerContact&#x60; to give more information what the source ID is about. E.g. private or company phone number.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "The description of the `ExternalMessengerContact` to give more information what the source ID is about. E.g. private or company phone number.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerCreateContactCreateResponse externalMessengerCreateContactCreateResponse = (ExternalMessengerCreateContactCreateResponse) o;
		return Objects.equals(this.$type, externalMessengerCreateContactCreateResponse.$type) &&
				Objects.equals(this.type, externalMessengerCreateContactCreateResponse.type) &&
				Objects.equals(this.name, externalMessengerCreateContactCreateResponse.name) &&
				Objects.equals(this.sourceId, externalMessengerCreateContactCreateResponse.sourceId) &&
				Objects.equals(this.description, externalMessengerCreateContactCreateResponse.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, name, sourceId, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateContactCreateResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
