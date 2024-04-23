
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationsSetScheduledTimestamp&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationsSetScheduledTimestamp' operation")

@JsonPropertyOrder({
	ConversationsSetScheduledTimestampBody.JSON_PROPERTY_SCHEDULED_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsSetScheduledTimestampBody {
	public static final String JSON_PROPERTY_SCHEDULED_TIMESTAMP = "scheduledTimestamp";
	@JsonProperty(JSON_PROPERTY_SCHEDULED_TIMESTAMP)
	private Long scheduledTimestamp;

	public ConversationsSetScheduledTimestampBody scheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
		return this;
	}

	/**
	 * the new scheduledTimestamp rounded to nearest minute
	 * 
	 * @return scheduledTimestamp
	 **/
	@ApiModelProperty(value = "the new scheduledTimestamp rounded to nearest minute")
	public Long getScheduledTimestamp() {
		return scheduledTimestamp;
	}

	public void setScheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsSetScheduledTimestampBody conversationsSetScheduledTimestampBody = (ConversationsSetScheduledTimestampBody) o;
		return Objects.equals(this.scheduledTimestamp, conversationsSetScheduledTimestampBody.scheduledTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(scheduledTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsSetScheduledTimestampBody {\n");
		sb.append("    scheduledTimestamp: ").append(toIndentedString(scheduledTimestamp)).append("\n");
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
