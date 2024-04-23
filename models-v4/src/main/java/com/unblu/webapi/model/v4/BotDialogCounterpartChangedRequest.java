
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
 * Request sent when the counterpart person of a dialog changes during the dialog.&lt;br&gt; This can only happen if an anonymous person in a dialog logs in or
 * authenticates during the dialog.&lt;br&gt; In this case the person ID and all details switch to an authenticated person and all subsequent messages are sent
 * by that person. The dialog (and the dialog token) stays the same and continues.&lt;br&gt; &lt;p&gt; The request is only delivered to the dialog bots that
 * accepted the dialog offer for this dialog.
 */
@ApiModel(description = "Request sent when the counterpart person of a dialog changes during the dialog.<br> This can only happen if an anonymous person in a dialog logs in or authenticates during the dialog.<br> In this case the person ID and all details switch to an authenticated person and all subsequent messages are sent by that person. The dialog (and the dialog token) stays the same and continues.<br> <p> The request is only delivered to the dialog bots that accepted the dialog offer for this dialog.")

@JsonPropertyOrder({
	BotDialogCounterpartChangedRequest.JSON_PROPERTY_$_TYPE,
	BotDialogCounterpartChangedRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogCounterpartChangedRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogCounterpartChangedRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogCounterpartChangedRequest.JSON_PROPERTY_OLD_COUNTERPART_PERSON,
	BotDialogCounterpartChangedRequest.JSON_PROPERTY_NEW_COUNTERPART_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogCounterpartChangedRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGCOUNTERPARTCHANGEDREQUEST("BotDialogCounterpartChangedRequest");

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
			return TypeEnum.BOTDIALOGCOUNTERPARTCHANGEDREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGCOUNTERPARTCHANGEDREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_OLD_COUNTERPART_PERSON = "oldCounterpartPerson";
	@JsonProperty(JSON_PROPERTY_OLD_COUNTERPART_PERSON)
	private PersonData oldCounterpartPerson = null;

	public static final String JSON_PROPERTY_NEW_COUNTERPART_PERSON = "newCounterpartPerson";
	@JsonProperty(JSON_PROPERTY_NEW_COUNTERPART_PERSON)
	private PersonData newCounterpartPerson = null;

	public BotDialogCounterpartChangedRequest $type(TypeEnum $type) {
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

	public BotDialogCounterpartChangedRequest accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BotDialogCounterpartChangedRequest serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get serviceName
	 * 
	 * @return serviceName
	 **/
	@ApiModelProperty(value = "")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BotDialogCounterpartChangedRequest dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * Token for this dialog. It is present in every dialog webhook and must be passed to all bot web API service calls to identify the dialog.
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "Token for this dialog. It is present in every dialog webhook and must be passed to all bot web API service calls to identify the dialog.")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogCounterpartChangedRequest oldCounterpartPerson(PersonData oldCounterpartPerson) {
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

	public BotDialogCounterpartChangedRequest newCounterpartPerson(PersonData newCounterpartPerson) {
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
		BotDialogCounterpartChangedRequest botDialogCounterpartChangedRequest = (BotDialogCounterpartChangedRequest) o;
		return Objects.equals(this.$type, botDialogCounterpartChangedRequest.$type) &&
				Objects.equals(this.accountId, botDialogCounterpartChangedRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogCounterpartChangedRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogCounterpartChangedRequest.dialogToken) &&
				Objects.equals(this.oldCounterpartPerson, botDialogCounterpartChangedRequest.oldCounterpartPerson) &&
				Objects.equals(this.newCounterpartPerson, botDialogCounterpartChangedRequest.newCounterpartPerson);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, oldCounterpartPerson, newCounterpartPerson);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogCounterpartChangedRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
