
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationsSetAwaitedPersonType&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationsSetAwaitedPersonType' operation")

@JsonPropertyOrder({
	ConversationsSetAwaitedPersonTypeBody.JSON_PROPERTY_AWAITED_PERSON_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsSetAwaitedPersonTypeBody {
	public static final String JSON_PROPERTY_AWAITED_PERSON_TYPE = "awaitedPersonType";
	@JsonProperty(JSON_PROPERTY_AWAITED_PERSON_TYPE)
	private EAwaitedPersonType awaitedPersonType;

	public ConversationsSetAwaitedPersonTypeBody awaitedPersonType(EAwaitedPersonType awaitedPersonType) {
		this.awaitedPersonType = awaitedPersonType;
		return this;
	}

	/**
	 * Get awaitedPersonType
	 * 
	 * @return awaitedPersonType
	 **/
	@ApiModelProperty(value = "")
	public EAwaitedPersonType getAwaitedPersonType() {
		return awaitedPersonType;
	}

	public void setAwaitedPersonType(EAwaitedPersonType awaitedPersonType) {
		this.awaitedPersonType = awaitedPersonType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsSetAwaitedPersonTypeBody conversationsSetAwaitedPersonTypeBody = (ConversationsSetAwaitedPersonTypeBody) o;
		return Objects.equals(this.awaitedPersonType, conversationsSetAwaitedPersonTypeBody.awaitedPersonType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(awaitedPersonType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsSetAwaitedPersonTypeBody {\n");
		sb.append("    awaitedPersonType: ").append(toIndentedString(awaitedPersonType)).append("\n");
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
