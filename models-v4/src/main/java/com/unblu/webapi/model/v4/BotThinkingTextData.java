
package com.unblu.webapi.model.v4;

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
 * Data transfer object for a bot thinking text entry. Each entry represents one text for a specific language in the thinking text cycle.
 */
@ApiModel(description = "Data transfer object for a bot thinking text entry. Each entry represents one text for a specific language in the thinking text cycle.")

@JsonPropertyOrder({
	BotThinkingTextData.JSON_PROPERTY_$_TYPE,
	BotThinkingTextData.JSON_PROPERTY_ID,
	BotThinkingTextData.JSON_PROPERTY_DIALOG_BOT_ID,
	BotThinkingTextData.JSON_PROPERTY_TEXT,
	BotThinkingTextData.JSON_PROPERTY_LANGUAGE,
	BotThinkingTextData.JSON_PROPERTY_ORDER_INDEX,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotThinkingTextData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTTHINKINGTEXTDATA("BotThinkingTextData");

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
			return TypeEnum.BOTTHINKINGTEXTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTTHINKINGTEXTDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_DIALOG_BOT_ID = "dialogBotId";
	@JsonProperty(JSON_PROPERTY_DIALOG_BOT_ID)
	private String dialogBotId;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_LANGUAGE = "language";
	@JsonProperty(JSON_PROPERTY_LANGUAGE)
	private String language;

	public static final String JSON_PROPERTY_ORDER_INDEX = "orderIndex";
	@JsonProperty(JSON_PROPERTY_ORDER_INDEX)
	private Integer orderIndex;

	public BotThinkingTextData $type(TypeEnum $type) {
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

	public BotThinkingTextData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique identifier of this thinking text entry.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique identifier of this thinking text entry.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BotThinkingTextData dialogBotId(String dialogBotId) {
		this.dialogBotId = dialogBotId;
		return this;
	}

	/**
	 * The ID of the dialog bot this text belongs to.
	 * 
	 * @return dialogBotId
	 **/
	@ApiModelProperty(value = "The ID of the dialog bot this text belongs to.")
	public String getDialogBotId() {
		return dialogBotId;
	}

	public void setDialogBotId(String dialogBotId) {
		this.dialogBotId = dialogBotId;
	}

	public BotThinkingTextData text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * The thinking text.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "The thinking text.")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public BotThinkingTextData language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * Locale of the thinking text (as BCP 47 language tag form including region if available). Null for the default (fallback) text.
	 * 
	 * @return language
	 **/
	@ApiModelProperty(value = "Locale of the thinking text (as BCP 47 language tag form including region if available). Null for the default (fallback) text.")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public BotThinkingTextData orderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
		return this;
	}

	/**
	 * Position in the thinking text cycle per language. Lower values are shown first.
	 * 
	 * @return orderIndex
	 **/
	@ApiModelProperty(value = "Position in the thinking text cycle per language. Lower values are shown first.")
	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotThinkingTextData botThinkingTextData = (BotThinkingTextData) o;
		return Objects.equals(this.$type, botThinkingTextData.$type) &&
				Objects.equals(this.id, botThinkingTextData.id) &&
				Objects.equals(this.dialogBotId, botThinkingTextData.dialogBotId) &&
				Objects.equals(this.text, botThinkingTextData.text) &&
				Objects.equals(this.language, botThinkingTextData.language) &&
				Objects.equals(this.orderIndex, botThinkingTextData.orderIndex);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, dialogBotId, text, language, orderIndex);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotThinkingTextData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    dialogBotId: ").append(toIndentedString(dialogBotId)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    orderIndex: ").append(toIndentedString(orderIndex)).append("\n");
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
