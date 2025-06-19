
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
 * Bot dialog state of a bot thread
 */
@ApiModel(description = "Bot dialog state of a bot thread")

@JsonPropertyOrder({
	BotDialogStateData.JSON_PROPERTY_$_TYPE,
	BotDialogStateData.JSON_PROPERTY_DIALOG_BOT_ID,
	BotDialogStateData.JSON_PROPERTY_DIALOG_BOT_NAME,
	BotDialogStateData.JSON_PROPERTY_STATE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGSTATEDATA("BotDialogStateData");

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
			return TypeEnum.BOTDIALOGSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGSTATEDATA;

	public static final String JSON_PROPERTY_DIALOG_BOT_ID = "dialogBotId";
	@JsonProperty(JSON_PROPERTY_DIALOG_BOT_ID)
	private String dialogBotId;

	public static final String JSON_PROPERTY_DIALOG_BOT_NAME = "dialogBotName";
	@JsonProperty(JSON_PROPERTY_DIALOG_BOT_NAME)
	private String dialogBotName;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EBotDialogStatus state;

	public BotDialogStateData $type(TypeEnum $type) {
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

	public BotDialogStateData dialogBotId(String dialogBotId) {
		this.dialogBotId = dialogBotId;
		return this;
	}

	/**
	 * ID of the dialog bot
	 * 
	 * @return dialogBotId
	 **/
	@ApiModelProperty(value = "ID of the dialog bot")
	public String getDialogBotId() {
		return dialogBotId;
	}

	public void setDialogBotId(String dialogBotId) {
		this.dialogBotId = dialogBotId;
	}

	public BotDialogStateData dialogBotName(String dialogBotName) {
		this.dialogBotName = dialogBotName;
		return this;
	}

	/**
	 * Name of the bot
	 * 
	 * @return dialogBotName
	 **/
	@ApiModelProperty(value = "Name of the bot")
	public String getDialogBotName() {
		return dialogBotName;
	}

	public void setDialogBotName(String dialogBotName) {
		this.dialogBotName = dialogBotName;
	}

	public BotDialogStateData state(EBotDialogStatus state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EBotDialogStatus getState() {
		return state;
	}

	public void setState(EBotDialogStatus state) {
		this.state = state;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogStateData botDialogStateData = (BotDialogStateData) o;
		return Objects.equals(this.$type, botDialogStateData.$type) &&
				Objects.equals(this.dialogBotId, botDialogStateData.dialogBotId) &&
				Objects.equals(this.dialogBotName, botDialogStateData.dialogBotName) &&
				Objects.equals(this.state, botDialogStateData.state);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, dialogBotId, dialogBotName, state);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    dialogBotId: ").append(toIndentedString(dialogBotId)).append("\n");
		sb.append("    dialogBotName: ").append(toIndentedString(dialogBotName)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
