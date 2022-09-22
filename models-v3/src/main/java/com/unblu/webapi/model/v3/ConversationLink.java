
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Link can be used to open or join a conversation&lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;If the user isn&#39;t logged in this must be done
 * manually.&lt;/li&gt; &lt;li&gt;Login can also be done via Web API call or JS API.&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Link can be used to open or join a conversation<br> <b>Note:</b> <ul> <li>If the user isn't logged in this must be done manually.</li> <li>Login can also be done via Web API call or JS API.</li> </ul>")

@JsonPropertyOrder({
	ConversationLink.JSON_PROPERTY_$_TYPE,
	ConversationLink.JSON_PROPERTY_TYPE,
	ConversationLink.JSON_PROPERTY_URL,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationLink {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONLINK("ConversationLink");

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
			return TypeEnum.CONVERSATIONLINK;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONLINK;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EConversationLinkType type;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public ConversationLink $type(TypeEnum $type) {
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

	public ConversationLink type(EConversationLinkType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EConversationLinkType getType() {
		return type;
	}

	public void setType(EConversationLinkType type) {
		this.type = type;
	}

	public ConversationLink url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Url of the link
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "Url of the link")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationLink conversationLink = (ConversationLink) o;
		return Objects.equals(this.$type, conversationLink.$type) &&
				Objects.equals(this.type, conversationLink.type) &&
				Objects.equals(this.url, conversationLink.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationLink {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
