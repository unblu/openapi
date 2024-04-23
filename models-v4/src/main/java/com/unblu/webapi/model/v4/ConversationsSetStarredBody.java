
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationsSetStarred&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationsSetStarred' operation")

@JsonPropertyOrder({
	ConversationsSetStarredBody.JSON_PROPERTY_PERSON_ID,
	ConversationsSetStarredBody.JSON_PROPERTY_STARRED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsSetStarredBody {
	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_STARRED = "starred";
	@JsonProperty(JSON_PROPERTY_STARRED)
	private Boolean starred;

	public ConversationsSetStarredBody personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * the person for whom the starred status will be set
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "the person for whom the starred status will be set")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ConversationsSetStarredBody starred(Boolean starred) {
		this.starred = starred;
		return this;
	}

	/**
	 * the starred status to b set
	 * 
	 * @return starred
	 **/
	@ApiModelProperty(value = "the starred status to b set")
	public Boolean isStarred() {
		return starred;
	}

	public void setStarred(Boolean starred) {
		this.starred = starred;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsSetStarredBody conversationsSetStarredBody = (ConversationsSetStarredBody) o;
		return Objects.equals(this.personId, conversationsSetStarredBody.personId) &&
				Objects.equals(this.starred, conversationsSetStarredBody.starred);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personId, starred);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsSetStarredBody {\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
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
