
package com.unblu.webapi.model.v4;

import java.util.HashMap;
import java.util.Map;
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
 * Success response to an &#x60;ExternalMessengerCreateConversationRequest&#x60; request. &lt;p&gt; This response can be given to let the collaboration server
 * create a conversation based on the data which were send with the request. Only the&#x60;sourceId&#x60; has to be added and some optional fields.
 */
@ApiModel(description = "Success response to an `ExternalMessengerCreateConversationRequest` request. <p> This response can be given to let the collaboration server create a conversation based on the data which were send with the request. Only the`sourceId` has to be added and some optional fields.")

@JsonPropertyOrder({
	ExternalMessengerCreateConversationCreateResponse.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateConversationCreateResponse.JSON_PROPERTY_TYPE,
	ExternalMessengerCreateConversationCreateResponse.JSON_PROPERTY_SOURCE_ID,
	ExternalMessengerCreateConversationCreateResponse.JSON_PROPERTY_SOURCE_URL,
	ExternalMessengerCreateConversationCreateResponse.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateConversationCreateResponse implements ExternalMessengerCreateConversationResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONVERSATIONCREATERESPONSE("ExternalMessengerCreateConversationCreateResponse");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONCREATERESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONCREATERESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EExternalMessengerConversationCreationResponseType type = EExternalMessengerConversationCreationResponseType.CREATE;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_SOURCE_URL = "sourceUrl";
	@JsonProperty(JSON_PROPERTY_SOURCE_URL)
	private String sourceUrl;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public ExternalMessengerCreateConversationCreateResponse $type(TypeEnum $type) {
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

	public ExternalMessengerCreateConversationCreateResponse type(EExternalMessengerConversationCreationResponseType type) {
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

	public ExternalMessengerCreateConversationCreateResponse sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * The source ID of the conversation which should be added to the creation data from the request. It has to be unique for the related external messenger
	 * channel.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "The source ID of the conversation which should be added to the creation data from the request. It has to be unique for the related external messenger channel.")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public ExternalMessengerCreateConversationCreateResponse sourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
		return this;
	}

	/**
	 * URL identifying the system where the conversation was created, for example a CRM. Optional.
	 * 
	 * @return sourceUrl
	 **/
	@ApiModelProperty(value = "URL identifying the system where the conversation was created, for example a CRM. Optional.")
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public ExternalMessengerCreateConversationCreateResponse metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public ExternalMessengerCreateConversationCreateResponse putMetadataItem(String key, String metadataItem) {
		if (this.metadata == null) {
			this.metadata = new HashMap<>();
		}
		this.metadata.put(key, metadataItem);
		return this;
	}

	/**
	 * Additional metadata which should be stored for the new conversation
	 * 
	 * @return metadata
	 **/
	@ApiModelProperty(value = "Additional metadata which should be stored for the new conversation")
	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerCreateConversationCreateResponse externalMessengerCreateConversationCreateResponse = (ExternalMessengerCreateConversationCreateResponse) o;
		return Objects.equals(this.$type, externalMessengerCreateConversationCreateResponse.$type) &&
				Objects.equals(this.type, externalMessengerCreateConversationCreateResponse.type) &&
				Objects.equals(this.sourceId, externalMessengerCreateConversationCreateResponse.sourceId) &&
				Objects.equals(this.sourceUrl, externalMessengerCreateConversationCreateResponse.sourceUrl) &&
				Objects.equals(this.metadata, externalMessengerCreateConversationCreateResponse.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, sourceId, sourceUrl, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateConversationCreateResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
