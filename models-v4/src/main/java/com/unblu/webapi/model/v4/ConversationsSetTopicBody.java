
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationsSetTopic&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationsSetTopic' operation")

@JsonPropertyOrder({
	ConversationsSetTopicBody.JSON_PROPERTY_TOPIC,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsSetTopicBody {
	public static final String JSON_PROPERTY_TOPIC = "topic";
	@JsonProperty(JSON_PROPERTY_TOPIC)
	private String topic;

	public ConversationsSetTopicBody topic(String topic) {
		this.topic = topic;
		return this;
	}

	/**
	 * the new topic
	 * 
	 * @return topic
	 **/
	@ApiModelProperty(value = "the new topic")
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsSetTopicBody conversationsSetTopicBody = (ConversationsSetTopicBody) o;
		return Objects.equals(this.topic, conversationsSetTopicBody.topic);
	}

	@Override
	public int hashCode() {
		return Objects.hash(topic);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsSetTopicBody {\n");
		sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
