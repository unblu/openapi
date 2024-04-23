
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationsSetVisibility&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationsSetVisibility' operation")

@JsonPropertyOrder({
	ConversationsSetVisibilityBody.JSON_PROPERTY_CONVERSATION_VISIBILITY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsSetVisibilityBody {
	public static final String JSON_PROPERTY_CONVERSATION_VISIBILITY = "conversationVisibility";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_VISIBILITY)
	private EConversationVisibility conversationVisibility;

	public ConversationsSetVisibilityBody conversationVisibility(EConversationVisibility conversationVisibility) {
		this.conversationVisibility = conversationVisibility;
		return this;
	}

	/**
	 * Get conversationVisibility
	 * 
	 * @return conversationVisibility
	 **/
	@ApiModelProperty(value = "")
	public EConversationVisibility getConversationVisibility() {
		return conversationVisibility;
	}

	public void setConversationVisibility(EConversationVisibility conversationVisibility) {
		this.conversationVisibility = conversationVisibility;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsSetVisibilityBody conversationsSetVisibilityBody = (ConversationsSetVisibilityBody) o;
		return Objects.equals(this.conversationVisibility, conversationsSetVisibilityBody.conversationVisibility);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationVisibility);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsSetVisibilityBody {\n");
		sb.append("    conversationVisibility: ").append(toIndentedString(conversationVisibility)).append("\n");
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
