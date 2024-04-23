
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
 * The outbound request sent when a contact for an external messenger should be created on the Unblu Collaboration Server for a specific person of the external
 * messenger. &lt;p&gt; The request contains information about which channel the contact should be created for and about the person in Unblu who should be
 * linked to the contact.&lt;br&gt; Most importantly, it contains the &#x60;contactIdentifier&#x60; field. This is used to find the person in question in the
 * external messenger. When you receive this request, use the externalMessengerContacts service to create the actual &#x60;ExternalMessengerContact&#x60;. The
 * &#x60;ExternalMessengerContact&#x60;&#39;s ID should then be returned to this call.
 */
@ApiModel(description = "The outbound request sent when a contact for an external messenger should be created on the Unblu Collaboration Server for a specific person of the external messenger. <p> The request contains information about which channel the contact should be created for and about the person in Unblu who should be linked to the contact.<br> Most importantly, it contains the `contactIdentifier` field. This is used to find the person in question in the external messenger. When you receive this request, use the externalMessengerContacts service to create the actual `ExternalMessengerContact`. The `ExternalMessengerContact`'s ID should then be returned to this call.")

@JsonPropertyOrder({
	ExternalMessengerCreateContactRequest.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateContactRequest.JSON_PROPERTY_ACCOUNT_ID,
	ExternalMessengerCreateContactRequest.JSON_PROPERTY_SERVICE_NAME,
	ExternalMessengerCreateContactRequest.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ExternalMessengerCreateContactRequest.JSON_PROPERTY_PERSON_DATA,
	ExternalMessengerCreateContactRequest.JSON_PROPERTY_CONTACT_IDENTIFIER,
	ExternalMessengerCreateContactRequest.JSON_PROPERTY_DESCRIPTION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateContactRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONTACTREQUEST("ExternalMessengerCreateContactRequest");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONTACTREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONTACTREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_PERSON_DATA = "personData";
	@JsonProperty(JSON_PROPERTY_PERSON_DATA)
	private PersonData personData = null;

	public static final String JSON_PROPERTY_CONTACT_IDENTIFIER = "contactIdentifier";
	@JsonProperty(JSON_PROPERTY_CONTACT_IDENTIFIER)
	private String contactIdentifier;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public ExternalMessengerCreateContactRequest $type(TypeEnum $type) {
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

	public ExternalMessengerCreateContactRequest accountId(String accountId) {
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

	public ExternalMessengerCreateContactRequest serviceName(String serviceName) {
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

	public ExternalMessengerCreateContactRequest externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * The ID of the external messenger channel to which the conversation has to be linked
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "The ID of the external messenger channel to which the conversation has to be linked")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public ExternalMessengerCreateContactRequest personData(PersonData personData) {
		this.personData = personData;
		return this;
	}

	/**
	 * Get personData
	 * 
	 * @return personData
	 **/
	@ApiModelProperty(value = "")
	public PersonData getPersonData() {
		return personData;
	}

	public void setPersonData(PersonData personData) {
		this.personData = personData;
	}

	public ExternalMessengerCreateContactRequest contactIdentifier(String contactIdentifier) {
		this.contactIdentifier = contactIdentifier;
		return this;
	}

	/**
	 * The identifier of the person in the external messenger. The identifier value is based on the configured values of the
	 * &#x60;CustomExternalMessengerChannel&#x60;contact identifier field name and type.
	 * 
	 * @return contactIdentifier
	 **/
	@ApiModelProperty(value = "The identifier of the person in the external messenger. The identifier value is based on the configured values of the `CustomExternalMessengerChannel`contact identifier field name and type.")
	public String getContactIdentifier() {
		return contactIdentifier;
	}

	public void setContactIdentifier(String contactIdentifier) {
		this.contactIdentifier = contactIdentifier;
	}

	public ExternalMessengerCreateContactRequest description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The description of the contact. Is null, if the user didn&#39;t define one.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "The description of the contact. Is null, if the user didn't define one.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerCreateContactRequest externalMessengerCreateContactRequest = (ExternalMessengerCreateContactRequest) o;
		return Objects.equals(this.$type, externalMessengerCreateContactRequest.$type) &&
				Objects.equals(this.accountId, externalMessengerCreateContactRequest.accountId) &&
				Objects.equals(this.serviceName, externalMessengerCreateContactRequest.serviceName) &&
				Objects.equals(this.externalMessengerChannelId, externalMessengerCreateContactRequest.externalMessengerChannelId) &&
				Objects.equals(this.personData, externalMessengerCreateContactRequest.personData) &&
				Objects.equals(this.contactIdentifier, externalMessengerCreateContactRequest.contactIdentifier) &&
				Objects.equals(this.description, externalMessengerCreateContactRequest.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, externalMessengerChannelId, personData, contactIdentifier, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateContactRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    personData: ").append(toIndentedString(personData)).append("\n");
		sb.append("    contactIdentifier: ").append(toIndentedString(contactIdentifier)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
