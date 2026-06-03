
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
 * AriaSuggestionSourceAgenticFlowDataContent
 */

@JsonPropertyOrder({
	AriaSuggestionSourceAgenticFlowDataContent.JSON_PROPERTY_$_TYPE,
	AriaSuggestionSourceAgenticFlowDataContent.JSON_PROPERTY_TYPE,
	AriaSuggestionSourceAgenticFlowDataContent.JSON_PROPERTY_ID,
	AriaSuggestionSourceAgenticFlowDataContent.JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AriaSuggestionSourceAgenticFlowDataContent implements AriaAgenticFlowDataContent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARIASUGGESTIONSOURCEAGENTICFLOWDATACONTENT("AriaSuggestionSourceAgenticFlowDataContent");

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
			return TypeEnum.ARIASUGGESTIONSOURCEAGENTICFLOWDATACONTENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARIASUGGESTIONSOURCEAGENTICFLOWDATACONTENT;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EAriaAgenticFlowDataContentType type = EAriaAgenticFlowDataContentType.SUGGESTION_SOURCE;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS = "publishedAgenticFlows";
	@JsonProperty(JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS)
	private List<AriaAgenticFlowTransferableData> publishedAgenticFlows = null;

	public AriaSuggestionSourceAgenticFlowDataContent $type(TypeEnum $type) {
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

	public AriaSuggestionSourceAgenticFlowDataContent type(EAriaAgenticFlowDataContentType type) {
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

	public AriaSuggestionSourceAgenticFlowDataContent id(String id) {
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

	public AriaSuggestionSourceAgenticFlowDataContent publishedAgenticFlows(List<AriaAgenticFlowTransferableData> publishedAgenticFlows) {
		this.publishedAgenticFlows = publishedAgenticFlows;
		return this;
	}

	public AriaSuggestionSourceAgenticFlowDataContent addPublishedAgenticFlowsItem(AriaAgenticFlowTransferableData publishedAgenticFlowsItem) {
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
		AriaSuggestionSourceAgenticFlowDataContent ariaSuggestionSourceAgenticFlowDataContent = (AriaSuggestionSourceAgenticFlowDataContent) o;
		return Objects.equals(this.$type, ariaSuggestionSourceAgenticFlowDataContent.$type) &&
				Objects.equals(this.type, ariaSuggestionSourceAgenticFlowDataContent.type) &&
				Objects.equals(this.id, ariaSuggestionSourceAgenticFlowDataContent.id) &&
				Objects.equals(this.publishedAgenticFlows, ariaSuggestionSourceAgenticFlowDataContent.publishedAgenticFlows);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, id, publishedAgenticFlows);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AriaSuggestionSourceAgenticFlowDataContent {\n");
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
