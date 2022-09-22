
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
 * Model of an address
 */
@ApiModel(description = "Model of an address")

@JsonPropertyOrder({
	Address.JSON_PROPERTY_$_TYPE,
	Address.JSON_PROPERTY_ID,
	Address.JSON_PROPERTY_CREATION_TIMESTAMP,
	Address.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	Address.JSON_PROPERTY_VERSION,
	Address.JSON_PROPERTY_ACCOUNT_ID,
	Address.JSON_PROPERTY_ORGANISATION_NAME,
	Address.JSON_PROPERTY_ADDRESS_LINE1,
	Address.JSON_PROPERTY_ADDRESS_LINE2,
	Address.JSON_PROPERTY_ZIP,
	Address.JSON_PROPERTY_CITY,
	Address.JSON_PROPERTY_STATE,
	Address.JSON_PROPERTY_COUNTRY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Address {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ADDRESS("Address");

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
			return TypeEnum.ADDRESS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ADDRESS;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_ORGANISATION_NAME = "organisationName";
	@JsonProperty(JSON_PROPERTY_ORGANISATION_NAME)
	private String organisationName;

	public static final String JSON_PROPERTY_ADDRESS_LINE1 = "addressLine1";
	@JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
	private String addressLine1;

	public static final String JSON_PROPERTY_ADDRESS_LINE2 = "addressLine2";
	@JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
	private String addressLine2;

	public static final String JSON_PROPERTY_ZIP = "zip";
	@JsonProperty(JSON_PROPERTY_ZIP)
	private String zip;

	public static final String JSON_PROPERTY_CITY = "city";
	@JsonProperty(JSON_PROPERTY_CITY)
	private String city;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private String state;

	public static final String JSON_PROPERTY_COUNTRY = "country";
	@JsonProperty(JSON_PROPERTY_COUNTRY)
	private String country;

	public Address $type(TypeEnum $type) {
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

	public Address id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and
	 * therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data
	 * consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Address modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public Address version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When
	 * creating an object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Address accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Address organisationName(String organisationName) {
		this.organisationName = organisationName;
		return this;
	}

	/**
	 * Name of the organisation. Maximum of 250 characters. Can be omitted.
	 * 
	 * @return organisationName
	 **/
	@ApiModelProperty(value = "Name of the organisation. Maximum of 250 characters. Can be omitted.")
	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public Address addressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	/**
	 * First address line. Maximum of 250 characters. Can be omitted.
	 * 
	 * @return addressLine1
	 **/
	@ApiModelProperty(value = "First address line. Maximum of 250 characters. Can be omitted.")
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public Address addressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	/**
	 * Second address line. Maximum of 250 characters. Can be omitted.
	 * 
	 * @return addressLine2
	 **/
	@ApiModelProperty(value = "Second address line. Maximum of 250 characters. Can be omitted.")
	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Address zip(String zip) {
		this.zip = zip;
		return this;
	}

	/**
	 * Zip code of the city. Maximum of 20 characters. Can not be omitted.
	 * 
	 * @return zip
	 **/
	@ApiModelProperty(value = "Zip code of the city. Maximum of 20 characters. Can not be omitted.")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Address city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * City name. Maximum of 250 characters. Can not be omitted.
	 * 
	 * @return city
	 **/
	@ApiModelProperty(value = "City name. Maximum of 250 characters. Can not be omitted.")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Country state. Maximum of 250 characters. Can be omitted.
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "Country state. Maximum of 250 characters. Can be omitted.")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Country. Maximum of 250 characters. Can not be omitted.
	 * 
	 * @return country
	 **/
	@ApiModelProperty(value = "Country. Maximum of 250 characters. Can not be omitted.")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return Objects.equals(this.$type, address.$type) &&
				Objects.equals(this.id, address.id) &&
				Objects.equals(this.creationTimestamp, address.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, address.modificationTimestamp) &&
				Objects.equals(this.version, address.version) &&
				Objects.equals(this.accountId, address.accountId) &&
				Objects.equals(this.organisationName, address.organisationName) &&
				Objects.equals(this.addressLine1, address.addressLine1) &&
				Objects.equals(this.addressLine2, address.addressLine2) &&
				Objects.equals(this.zip, address.zip) &&
				Objects.equals(this.city, address.city) &&
				Objects.equals(this.state, address.state) &&
				Objects.equals(this.country, address.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, organisationName, addressLine1, addressLine2, zip, city, state, country);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Address {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
		sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
		sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
		sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
