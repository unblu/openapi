
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * AriaWebhookAgenticFlowDataContent
 */

@JsonPropertyOrder({
	AriaWebhookAgenticFlowDataContent.JSON_PROPERTY_$_TYPE,
	AriaWebhookAgenticFlowDataContent.JSON_PROPERTY_TYPE,
	AriaWebhookAgenticFlowDataContent.JSON_PROPERTY_ID,
	AriaWebhookAgenticFlowDataContent.JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AriaWebhookAgenticFlowDataContent implements AriaAgenticFlowDataContent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARIAWEBHOOKAGENTICFLOWDATACONTENT("AriaWebhookAgenticFlowDataContent");

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
			return TypeEnum.ARIAWEBHOOKAGENTICFLOWDATACONTENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARIAWEBHOOKAGENTICFLOWDATACONTENT;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EAriaAgenticFlowDataContentType type = EAriaAgenticFlowDataContentType.WEBHOOK;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS = "publishedAgenticFlows";
	@JsonProperty(JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS)
	private List<AriaAgenticFlowTransferableData> publishedAgenticFlows = null;

	public AriaWebhookAgenticFlowDataContent $type(TypeEnum $type) {
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

	public AriaWebhookAgenticFlowDataContent type(EAriaAgenticFlowDataContentType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EAriaAgenticFlowDataContentType getType() {
		return type;
	}

	public void setType(EAriaAgenticFlowDataContentType type) {
		this.type = type;
	}

	public AriaWebhookAgenticFlowDataContent id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The id of the main agentic flow of the entity
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The id of the main agentic flow of the entity")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AriaWebhookAgenticFlowDataContent publishedAgenticFlows(List<AriaAgenticFlowTransferableData> publishedAgenticFlows) {
		this.publishedAgenticFlows = publishedAgenticFlows;
		return this;
	}

	public AriaWebhookAgenticFlowDataContent addPublishedAgenticFlowsItem(AriaAgenticFlowTransferableData publishedAgenticFlowsItem) {
		if (this.publishedAgenticFlows == null) {
			this.publishedAgenticFlows = new ArrayList<>();
		}
		this.publishedAgenticFlows.add(publishedAgenticFlowsItem);
		return this;
	}

	/**
	 * Published version of the agentic flows required for the entity, base-64 encoded
	 * 
	 * @return publishedAgenticFlows
	 **/
	@ApiModelProperty(value = "Published version of the agentic flows required for the entity, base-64 encoded")
	public List<AriaAgenticFlowTransferableData> getPublishedAgenticFlows() {
		return publishedAgenticFlows;
	}

	public void setPublishedAgenticFlows(List<AriaAgenticFlowTransferableData> publishedAgenticFlows) {
		this.publishedAgenticFlows = publishedAgenticFlows;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AriaWebhookAgenticFlowDataContent ariaWebhookAgenticFlowDataContent = (AriaWebhookAgenticFlowDataContent) o;
		return Objects.equals(this.$type, ariaWebhookAgenticFlowDataContent.$type) &&
				Objects.equals(this.type, ariaWebhookAgenticFlowDataContent.type) &&
				Objects.equals(this.id, ariaWebhookAgenticFlowDataContent.id) &&
				Objects.equals(this.publishedAgenticFlows, ariaWebhookAgenticFlowDataContent.publishedAgenticFlows);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, id, publishedAgenticFlows);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AriaWebhookAgenticFlowDataContent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    publishedAgenticFlows: ").append(toIndentedString(publishedAgenticFlows)).append("\n");
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
