
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
 * Event emitted when the counterpart person of dialog changes during a dialog.&lt;br&gt; This can only happen if a anonymous person that is in a dialog logs in
 * / authenticates during the dialog and is changed to an authenticated person.&lt;br&gt; In this case the person ID and all details will switch to a
 * authenticated person and all subsequent messages will be sent by that person, the dialog including the dialog token will stay the same and go on.&lt;br&gt;
 * &lt;p&gt; This event will only be delivered to the dialog bots that accepted dialog offer for this dialog beforehand.
 */
@ApiModel(description = "Event emitted when the counterpart person of dialog changes during a dialog.<br> This can only happen if a anonymous person that is in a dialog logs in / authenticates during the dialog and is changed to an authenticated person.<br> In this case the person ID and all details will switch to a authenticated person and all subsequent messages will be sent by that person, the dialog including the dialog token will stay the same and go on.<br> <p> This event will only be delivered to the dialog bots that accepted dialog offer for this dialog beforehand.")

@JsonPropertyOrder({
	BotDialogCounterpartChanged.JSON_PROPERTY_$_TYPE,
	BotDialogCounterpartChanged.JSON_PROPERTY_TIMESTAMP,
	BotDialogCounterpartChanged.JSON_PROPERTY_EVENT_TYPE,
	BotDialogCounterpartChanged.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogCounterpartChanged.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogCounterpartChanged.JSON_PROPERTY_OLD_COUNTERPART_PERSON,
	BotDialogCounterpartChanged.JSON_PROPERTY_NEW_COUNTERPART_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogCounterpartChanged {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGCOUNTERPARTCHANGED("BotDialogCounterpartChanged");

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
			return TypeEnum.BOTDIALOGCOUNTERPARTCHANGED;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGCOUNTERPARTCHANGED;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_OLD_COUNTERPART_PERSON = "oldCounterpartPerson";
	@JsonProperty(JSON_PROPERTY_OLD_COUNTERPART_PERSON)
	private PersonData oldCounterpartPerson = null;

	public static final String JSON_PROPERTY_NEW_COUNTERPART_PERSON = "newCounterpartPerson";
	@JsonProperty(JSON_PROPERTY_NEW_COUNTERPART_PERSON)
	private PersonData newCounterpartPerson = null;

	public BotDialogCounterpartChanged $type(TypeEnum $type) {
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

	public BotDialogCounterpartChanged timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (unix time in millies) that the event was generated.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (unix time in millies) that the event was generated.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public BotDialogCounterpartChanged eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public BotDialogCounterpartChanged accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BotDialogCounterpartChanged dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * Token for this dialog. It is present in every dialog webhook and must be passed to all Bot Web-API service calls to identify the dialog.
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "Token for this dialog. It is present in every dialog webhook and must be passed to all Bot Web-API service calls to identify the dialog.")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogCounterpartChanged oldCounterpartPerson(PersonData oldCounterpartPerson) {
		this.oldCounterpartPerson = oldCounterpartPerson;
		return this;
	}

	/**
	 * Get oldCounterpartPerson
	 * 
	 * @return oldCounterpartPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getOldCounterpartPerson() {
		return oldCounterpartPerson;
	}

	public void setOldCounterpartPerson(PersonData oldCounterpartPerson) {
		this.oldCounterpartPerson = oldCounterpartPerson;
	}

	public BotDialogCounterpartChanged newCounterpartPerson(PersonData newCounterpartPerson) {
		this.newCounterpartPerson = newCounterpartPerson;
		return this;
	}

	/**
	 * Get newCounterpartPerson
	 * 
	 * @return newCounterpartPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getNewCounterpartPerson() {
		return newCounterpartPerson;
	}

	public void setNewCounterpartPerson(PersonData newCounterpartPerson) {
		this.newCounterpartPerson = newCounterpartPerson;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogCounterpartChanged botDialogCounterpartChanged = (BotDialogCounterpartChanged) o;
		return Objects.equals(this.$type, botDialogCounterpartChanged.$type) &&
				Objects.equals(this.timestamp, botDialogCounterpartChanged.timestamp) &&
				Objects.equals(this.eventType, botDialogCounterpartChanged.eventType) &&
				Objects.equals(this.accountId, botDialogCounterpartChanged.accountId) &&
				Objects.equals(this.dialogToken, botDialogCounterpartChanged.dialogToken) &&
				Objects.equals(this.oldCounterpartPerson, botDialogCounterpartChanged.oldCounterpartPerson) &&
				Objects.equals(this.newCounterpartPerson, botDialogCounterpartChanged.newCounterpartPerson);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, dialogToken, oldCounterpartPerson, newCounterpartPerson);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogCounterpartChanged {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    oldCounterpartPerson: ").append(toIndentedString(oldCounterpartPerson)).append("\n");
		sb.append("    newCounterpartPerson: ").append(toIndentedString(newCounterpartPerson)).append("\n");
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
