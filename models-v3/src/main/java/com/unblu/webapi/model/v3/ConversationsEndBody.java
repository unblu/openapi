
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;conversationsEnd&#39; operation
 */
@ApiModel(description = "Request Body for the 'conversationsEnd' operation")

@JsonPropertyOrder({
	ConversationsEndBody.JSON_PROPERTY_REASON,
	ConversationsEndBody.JSON_PROPERTY_COMMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsEndBody {
	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private EConversationEndReason reason;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public ConversationsEndBody reason(EConversationEndReason reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Get reason
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "")
	public EConversationEndReason getReason() {
		return reason;
	}

	public void setReason(EConversationEndReason reason) {
		this.reason = reason;
	}

	public ConversationsEndBody comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Get comment
	 * 
	 * @return comment
	 **/
	@ApiModelProperty(value = "")
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsEndBody conversationsEndBody = (ConversationsEndBody) o;
		return Objects.equals(this.reason, conversationsEndBody.reason) &&
				Objects.equals(this.comment, conversationsEndBody.comment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reason, comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsEndBody {\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
