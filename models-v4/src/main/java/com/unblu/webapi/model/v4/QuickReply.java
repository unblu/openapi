
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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a Quick reply option, which can be optionally added to a certain &#x60;PostMessageData&#x60;
 */
@ApiModel(description = "Represents a Quick reply option, which can be optionally added to a certain `PostMessageData`")

@JsonPropertyOrder({
	QuickReply.JSON_PROPERTY_$_TYPE,
	QuickReply.JSON_PROPERTY_TEXT,
	QuickReply.JSON_PROPERTY_AVAILABLE_TRANSLATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QuickReply {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUICKREPLY("QuickReply");

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
			return TypeEnum.QUICKREPLY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUICKREPLY;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_AVAILABLE_TRANSLATIONS = "availableTranslations";
	@JsonProperty(JSON_PROPERTY_AVAILABLE_TRANSLATIONS)
	private List<QuickReplyTranslation> availableTranslations = null;

	public QuickReply $type(TypeEnum $type) {
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

	public QuickReply text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Quick reply text displayed as button available to the message&#39;s recipient. &lt;p&gt; Simple text, max 40 characters.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Quick reply text displayed as button available to the message's recipient. <p> Simple text, max 40 characters.")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public QuickReply availableTranslations(List<QuickReplyTranslation> availableTranslations) {
		this.availableTranslations = availableTranslations;
		return this;
	}

	public QuickReply addAvailableTranslationsItem(QuickReplyTranslation availableTranslationsItem) {
		if (this.availableTranslations == null) {
			this.availableTranslations = new ArrayList<>();
		}
		this.availableTranslations.add(availableTranslationsItem);
		return this;
	}

	/**
	 * Quick Reply translations. Only languages that the message has already been translated into are included. Whenever someone requests a translation into a
	 * particular language, the translation is added here. As a result, the content of the variable may vary.
	 * 
	 * @return availableTranslations
	 **/
	@ApiModelProperty(value = "Quick Reply translations. Only languages that the message has already been translated into are included. Whenever someone requests a translation into a particular language, the translation is added here. As a result, the content of the variable may vary.")
	public List<QuickReplyTranslation> getAvailableTranslations() {
		return availableTranslations;
	}

	public void setAvailableTranslations(List<QuickReplyTranslation> availableTranslations) {
		this.availableTranslations = availableTranslations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QuickReply quickReply = (QuickReply) o;
		return Objects.equals(this.$type, quickReply.$type) &&
				Objects.equals(this.text, quickReply.text) &&
				Objects.equals(this.availableTranslations, quickReply.availableTranslations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, text, availableTranslations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QuickReply {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    availableTranslations: ").append(toIndentedString(availableTranslations)).append("\n");
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
