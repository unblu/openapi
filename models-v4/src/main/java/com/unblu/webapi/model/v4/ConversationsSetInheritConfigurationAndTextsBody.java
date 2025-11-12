
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationsSetInheritConfigurationAndTexts&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationsSetInheritConfigurationAndTexts' operation")

@JsonPropertyOrder({
	ConversationsSetInheritConfigurationAndTextsBody.JSON_PROPERTY_INHERIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsSetInheritConfigurationAndTextsBody {
	public static final String JSON_PROPERTY_INHERIT = "inherit";
	@JsonProperty(JSON_PROPERTY_INHERIT)
	private Boolean inherit;

	public ConversationsSetInheritConfigurationAndTextsBody inherit(Boolean inherit) {
		this.inherit = inherit;
		return this;
	}

	/**
	 * Whether to inherit the configuration and text properties from the conversation template or not.
	 * 
	 * @return inherit
	 **/
	@ApiModelProperty(value = "Whether to inherit the configuration and text properties from the conversation template or not.")
	public Boolean isInherit() {
		return inherit;
	}

	public void setInherit(Boolean inherit) {
		this.inherit = inherit;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsSetInheritConfigurationAndTextsBody conversationsSetInheritConfigurationAndTextsBody = (ConversationsSetInheritConfigurationAndTextsBody) o;
		return Objects.equals(this.inherit, conversationsSetInheritConfigurationAndTextsBody.inherit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(inherit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsSetInheritConfigurationAndTextsBody {\n");
		sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
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
