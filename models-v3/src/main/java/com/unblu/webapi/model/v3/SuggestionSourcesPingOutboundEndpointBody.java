
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;suggestionSourcesPingOutboundEndpoint&#39; operation
 */
@ApiModel(description = "Request Body for the 'suggestionSourcesPingOutboundEndpoint' operation")

@JsonPropertyOrder({
	SuggestionSourcesPingOutboundEndpointBody.JSON_PROPERTY_SUGGESTION_SOURCE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SuggestionSourcesPingOutboundEndpointBody {
	public static final String JSON_PROPERTY_SUGGESTION_SOURCE_ID = "suggestionSourceId";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_SOURCE_ID)
	private String suggestionSourceId;

	public SuggestionSourcesPingOutboundEndpointBody suggestionSourceId(String suggestionSourceId) {
		this.suggestionSourceId = suggestionSourceId;
		return this;
	}

	/**
	 * The ID of the suggestion source
	 * 
	 * @return suggestionSourceId
	 **/
	@ApiModelProperty(value = "The ID of the suggestion source")
	public String getSuggestionSourceId() {
		return suggestionSourceId;
	}

	public void setSuggestionSourceId(String suggestionSourceId) {
		this.suggestionSourceId = suggestionSourceId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SuggestionSourcesPingOutboundEndpointBody suggestionSourcesPingOutboundEndpointBody = (SuggestionSourcesPingOutboundEndpointBody) o;
		return Objects.equals(this.suggestionSourceId, suggestionSourcesPingOutboundEndpointBody.suggestionSourceId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(suggestionSourceId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SuggestionSourcesPingOutboundEndpointBody {\n");
		sb.append("    suggestionSourceId: ").append(toIndentedString(suggestionSourceId)).append("\n");
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
