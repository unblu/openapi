
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
 * Message action used in card messages and on list items. &lt;p&gt; Links are rendered with their labels below the body text of the card or list item. Reply
 * actions are only rendered in card messages. They aren&#39;t rendered on list items.
 */
@ApiModel(description = "Message action used in card messages and on list items. <p> Links are rendered with their labels below the body text of the card or list item. Reply actions are only rendered in card messages. They aren't rendered on list items.")

@JsonPropertyOrder({
	MessageAction.JSON_PROPERTY_$_TYPE,
	MessageAction.JSON_PROPERTY_ACTION_TYPE,
	MessageAction.JSON_PROPERTY_LABEL,
	MessageAction.JSON_PROPERTY_VALUE,
	MessageAction.JSON_PROPERTY_AVAILABLE_TRANSLATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessageAction {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGEACTION("MessageAction");

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
			return TypeEnum.MESSAGEACTION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGEACTION;

	public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
	@JsonProperty(JSON_PROPERTY_ACTION_TYPE)
	private EConversationMessageActionType actionType;

	public static final String JSON_PROPERTY_LABEL = "label";
	@JsonProperty(JSON_PROPERTY_LABEL)
	private String label;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public static final String JSON_PROPERTY_AVAILABLE_TRANSLATIONS = "availableTranslations";
	@JsonProperty(JSON_PROPERTY_AVAILABLE_TRANSLATIONS)
	private List<MessageActionTranslation> availableTranslations = null;

	public MessageAction $type(TypeEnum $type) {
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

	public MessageAction actionType(EConversationMessageActionType actionType) {
		this.actionType = actionType;
		return this;
	}

	/**
	 * Get actionType
	 * 
	 * @return actionType
	 **/
	@ApiModelProperty(value = "")
	public EConversationMessageActionType getActionType() {
		return actionType;
	}

	public void setActionType(EConversationMessageActionType actionType) {
		this.actionType = actionType;
	}

	public MessageAction label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * The text displayed on the action button, link, or reply message. &lt;ul&gt; &lt;li&gt;If the action type is
	 * &#x60;EConversationMessageActionType.REPLY_MESSAGE_WITH_TECHNICAL_VALUE&#x60;, the maximum length is 64 characters, and the label is used as the reply
	 * message.&lt;/li&gt; &lt;li&gt;For all other action types, the maximum length is 24 characters.&lt;/li&gt; &lt;/ul&gt;
	 * 
	 * @return label
	 **/
	@ApiModelProperty(value = "The text displayed on the action button, link, or reply message. <ul> <li>If the action type is `EConversationMessageActionType.REPLY_MESSAGE_WITH_TECHNICAL_VALUE`, the maximum length is 64 characters, and the label is used as the reply message.</li> <li>For all other action types, the maximum length is 24 characters.</li> </ul>")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public MessageAction value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * The content of this parameter depends on the action type: &lt;ul&gt; &lt;li&gt;If the action type is a link, the parameter contains the URL to open.
	 * &lt;li&gt;If the action type is &#x60;EConversationMessageActionType.REPLY_MESSAGE&#x60;, the parameter contains the reply message. &lt;li&gt;If the action
	 * type is &#x60;EConversationMessageActionType.REPLY_MESSAGE_WITH_TECHNICAL_VALUE&#x60;, the parameter contains a technical value sent along with the reply
	 * message. The reply message itself is taken from the @link label parameter. &lt;/ul&gt;
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "The content of this parameter depends on the action type: <ul> <li>If the action type is a link, the parameter contains the URL to open. <li>If the action type is `EConversationMessageActionType.REPLY_MESSAGE`, the parameter contains the reply message. <li>If the action type is `EConversationMessageActionType.REPLY_MESSAGE_WITH_TECHNICAL_VALUE`, the parameter contains a technical value sent along with the reply message. The reply message itself is taken from the @link label parameter. </ul>")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MessageAction availableTranslations(List<MessageActionTranslation> availableTranslations) {
		this.availableTranslations = availableTranslations;
		return this;
	}

	public MessageAction addAvailableTranslationsItem(MessageActionTranslation availableTranslationsItem) {
		if (this.availableTranslations == null) {
			this.availableTranslations = new ArrayList<>();
		}
		this.availableTranslations.add(availableTranslationsItem);
		return this;
	}

	/**
	 * Message action translations. Only languages that the message has already been translated into are included. Whenever someone requests a translation into a
	 * particular language, the translation is added here. As a result, the content of the variable may vary.
	 * 
	 * @return availableTranslations
	 **/
	@ApiModelProperty(value = "Message action translations. Only languages that the message has already been translated into are included. Whenever someone requests a translation into a particular language, the translation is added here. As a result, the content of the variable may vary.")
	public List<MessageActionTranslation> getAvailableTranslations() {
		return availableTranslations;
	}

	public void setAvailableTranslations(List<MessageActionTranslation> availableTranslations) {
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
		MessageAction messageAction = (MessageAction) o;
		return Objects.equals(this.$type, messageAction.$type) &&
				Objects.equals(this.actionType, messageAction.actionType) &&
				Objects.equals(this.label, messageAction.label) &&
				Objects.equals(this.value, messageAction.value) &&
				Objects.equals(this.availableTranslations, messageAction.availableTranslations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, actionType, label, value, availableTranslations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageAction {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
