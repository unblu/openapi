
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
 * List message which may contain a header, items and actions. &lt;p&gt; All of these parts are optional as long as it contains at least one of them.
 */
@ApiModel(description = "List message which may contain a header, items and actions. <p> All of these parts are optional as long as it contains at least one of them.")

@JsonPropertyOrder({
	ListPostMessageData.JSON_PROPERTY_$_TYPE,
	ListPostMessageData.JSON_PROPERTY_TYPE,
	ListPostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	ListPostMessageData.JSON_PROPERTY_HEADER,
	ListPostMessageData.JSON_PROPERTY_ITEMS,
	ListPostMessageData.JSON_PROPERTY_ACTIONS,
	ListPostMessageData.JSON_PROPERTY_QUICK_REPLIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ListPostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LISTPOSTMESSAGEDATA("ListPostMessageData");

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
			return TypeEnum.LISTPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LISTPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.LIST;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_HEADER = "header";
	@JsonProperty(JSON_PROPERTY_HEADER)
	private MessageHeader header = null;

	public static final String JSON_PROPERTY_ITEMS = "items";
	@JsonProperty(JSON_PROPERTY_ITEMS)
	private List<PostListMessageCardItemData> items = null;

	public static final String JSON_PROPERTY_ACTIONS = "actions";
	@JsonProperty(JSON_PROPERTY_ACTIONS)
	private List<MessageAction> actions = null;

	public static final String JSON_PROPERTY_QUICK_REPLIES = "quickReplies";
	@JsonProperty(JSON_PROPERTY_QUICK_REPLIES)
	private List<QuickReply> quickReplies = null;

	public ListPostMessageData $type(TypeEnum $type) {
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

	public ListPostMessageData type(EPostMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPostMessageType getType() {
		return type;
	}

	public void setType(EPostMessageType type) {
		this.type = type;
	}

	public ListPostMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text which is used when: &lt;ul&gt; &lt;li&gt;Unblu can&#39;t restore the complex content of a message&lt;/li&gt; &lt;li&gt;A push
	 * notification couldn&#39;t be decrypted&lt;/li&gt; &lt;li&gt;Last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The usage of this field is
	 * recommended especially for complex message types.&lt;br&gt; The value must not contain markdown.&lt;br&gt; If no fallback is given, a fallback text based on
	 * the content of the message is generated. This may however not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text which is used when: <ul> <li>Unblu can't restore the complex content of a message</li> <li>A push notification couldn't be decrypted</li> <li>Last message in the conversation overview</li> </ul> The usage of this field is recommended especially for complex message types.<br> The value must not contain markdown.<br> If no fallback is given, a fallback text based on the content of the message is generated. This may however not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public ListPostMessageData header(MessageHeader header) {
		this.header = header;
		return this;
	}

	/**
	 * Get header
	 * 
	 * @return header
	 **/
	@ApiModelProperty(value = "")
	public MessageHeader getHeader() {
		return header;
	}

	public void setHeader(MessageHeader header) {
		this.header = header;
	}

	public ListPostMessageData items(List<PostListMessageCardItemData> items) {
		this.items = items;
		return this;
	}

	public ListPostMessageData addItemsItem(PostListMessageCardItemData itemsItem) {
		if (this.items == null) {
			this.items = new ArrayList<>();
		}
		this.items.add(itemsItem);
		return this;
	}

	/**
	 * List items which will be displayed below the header and above the actions. (optional) &lt;p&gt; Max number of list items is 10.
	 * 
	 * @return items
	 **/
	@ApiModelProperty(value = "List items which will be displayed below the header and above the actions. (optional) <p> Max number of list items is 10.")
	public List<PostListMessageCardItemData> getItems() {
		return items;
	}

	public void setItems(List<PostListMessageCardItemData> items) {
		this.items = items;
	}

	public ListPostMessageData actions(List<MessageAction> actions) {
		this.actions = actions;
		return this;
	}

	public ListPostMessageData addActionsItem(MessageAction actionsItem) {
		if (this.actions == null) {
			this.actions = new ArrayList<>();
		}
		this.actions.add(actionsItem);
		return this;
	}

	/**
	 * Actions which will be displayed at the bottom of the list. (optional) &lt;p&gt; Max number of actions is 5.
	 * 
	 * @return actions
	 **/
	@ApiModelProperty(value = "Actions which will be displayed at the bottom of the list. (optional) <p> Max number of actions is 5.")
	public List<MessageAction> getActions() {
		return actions;
	}

	public void setActions(List<MessageAction> actions) {
		this.actions = actions;
	}

	public ListPostMessageData quickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
		return this;
	}

	public ListPostMessageData addQuickRepliesItem(QuickReply quickRepliesItem) {
		if (this.quickReplies == null) {
			this.quickReplies = new ArrayList<>();
		}
		this.quickReplies.add(quickRepliesItem);
		return this;
	}

	/**
	 * Optional list of quick replies available to the message&#39;s recipients &lt;p&gt; Max number of quick replies is 13.
	 * 
	 * @return quickReplies
	 **/
	@ApiModelProperty(value = "Optional list of quick replies available to the message's recipients <p> Max number of quick replies is 13.")
	public List<QuickReply> getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ListPostMessageData listPostMessageData = (ListPostMessageData) o;
		return Objects.equals(this.$type, listPostMessageData.$type) &&
				Objects.equals(this.type, listPostMessageData.type) &&
				Objects.equals(this.fallbackText, listPostMessageData.fallbackText) &&
				Objects.equals(this.header, listPostMessageData.header) &&
				Objects.equals(this.items, listPostMessageData.items) &&
				Objects.equals(this.actions, listPostMessageData.actions) &&
				Objects.equals(this.quickReplies, listPostMessageData.quickReplies);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, header, items, actions, quickReplies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ListPostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    header: ").append(toIndentedString(header)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
		sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
		sb.append("    quickReplies: ").append(toIndentedString(quickReplies)).append("\n");
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
