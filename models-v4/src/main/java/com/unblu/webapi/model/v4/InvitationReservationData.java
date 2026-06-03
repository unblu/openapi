
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvitationReservationData
 */

@JsonPropertyOrder({
	InvitationReservationData.JSON_PROPERTY_$_TYPE,
	InvitationReservationData.JSON_PROPERTY_PERSON,
	InvitationReservationData.JSON_PROPERTY_CREATION_TIMESTAMP,
	InvitationReservationData.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationReservationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		INVITATIONRESERVATIONDATA("InvitationReservationData");

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
			return TypeEnum.INVITATIONRESERVATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.INVITATIONRESERVATIONDATA;

	public static final String JSON_PROPERTY_PERSON = "person";
	@JsonProperty(JSON_PROPERTY_PERSON)
	private PersonData person = null;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public InvitationReservationData $type(TypeEnum $type) {
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

	public InvitationReservationData person(PersonData person) {
		this.person = person;
		return this;
	}

	/**
	 * Get person
	 * 
	 * @return person
	 **/
	@ApiModelProperty(value = "")
	public PersonData getPerson() {
		return person;
	}

	public void setPerson(PersonData person) {
		this.person = person;
	}

	public InvitationReservationData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) at which the invitation was reserved for the &#x60;person&#x60;.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) at which the invitation was reserved for the `person`.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public InvitationReservationData expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) at which the invitation&#39;s reservation for the &#x60;person&#x60; expires.
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) at which the invitation's reservation for the `person` expires.")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvitationReservationData invitationReservationData = (InvitationReservationData) o;
		return Objects.equals(this.$type, invitationReservationData.$type) &&
				Objects.equals(this.person, invitationReservationData.person) &&
				Objects.equals(this.creationTimestamp, invitationReservationData.creationTimestamp) &&
				Objects.equals(this.expirationTimestamp, invitationReservationData.expirationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, person, creationTimestamp, expirationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationReservationData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
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
