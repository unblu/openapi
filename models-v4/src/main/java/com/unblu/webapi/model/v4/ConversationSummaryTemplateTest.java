
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
 * Container to test a summary template
 */
@ApiModel(description = "Container to test a summary template")

@JsonPropertyOrder({
	ConversationSummaryTemplateTest.JSON_PROPERTY_$_TYPE,
	ConversationSummaryTemplateTest.JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_DATA,
	ConversationSummaryTemplateTest.JSON_PROPERTY_MESSAGES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationSummaryTemplateTest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSUMMARYTEMPLATETEST("ConversationSummaryTemplateTest");

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
			return TypeEnum.CONVERSATIONSUMMARYTEMPLATETEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSUMMARYTEMPLATETEST;

	public static final String JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_DATA = "conversationSummaryTemplateData";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_DATA)
	private ConversationSummaryTemplateData conversationSummaryTemplateData = null;

	public static final String JSON_PROPERTY_MESSAGES = "messages";
	@JsonProperty(JSON_PROPERTY_MESSAGES)
	private List<MessageData> messages = null;

	public ConversationSummaryTemplateTest $type(TypeEnum $type) {
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

	public ConversationSummaryTemplateTest conversationSummaryTemplateData(ConversationSummaryTemplateData conversationSummaryTemplateData) {
		this.conversationSummaryTemplateData = conversationSummaryTemplateData;
		return this;
	}

	/**
	 * Get conversationSummaryTemplateData
	 * 
	 * @return conversationSummaryTemplateData
	 **/
	@ApiModelProperty(value = "")
	public ConversationSummaryTemplateData getConversationSummaryTemplateData() {
		return conversationSummaryTemplateData;
	}

	public void setConversationSummaryTemplateData(ConversationSummaryTemplateData conversationSummaryTemplateData) {
		this.conversationSummaryTemplateData = conversationSummaryTemplateData;
	}

	public ConversationSummaryTemplateTest messages(List<MessageData> messages) {
		this.messages = messages;
		return this;
	}

	public ConversationSummaryTemplateTest addMessagesItem(MessageData messagesItem) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(messagesItem);
		return this;
	}

	/**
	 * Get messages
	 * 
	 * @return messages
	 **/
	@ApiModelProperty(value = "")
	public List<MessageData> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageData> messages) {
		this.messages = messages;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationSummaryTemplateTest conversationSummaryTemplateTest = (ConversationSummaryTemplateTest) o;
		return Objects.equals(this.$type, conversationSummaryTemplateTest.$type) &&
				Objects.equals(this.conversationSummaryTemplateData, conversationSummaryTemplateTest.conversationSummaryTemplateData) &&
				Objects.equals(this.messages, conversationSummaryTemplateTest.messages);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationSummaryTemplateData, messages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationSummaryTemplateTest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationSummaryTemplateData: ").append(toIndentedString(conversationSummaryTemplateData)).append("\n");
		sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
