
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
 * State data of a visitor person&lt;br&gt;
 */
@ApiModel(description = "State data of a visitor person<br>")

@JsonPropertyOrder({
	VisitorPersonStateData.JSON_PROPERTY_$_TYPE,
	VisitorPersonStateData.JSON_PROPERTY_PERSON_ID,
	VisitorPersonStateData.JSON_PROPERTY_ONLINE_STATE,
	VisitorPersonStateData.JSON_PROPERTY_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class VisitorPersonStateData implements PersonStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		VISITORPERSONSTATEDATA("VisitorPersonStateData");

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
			return TypeEnum.VISITORPERSONSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.VISITORPERSONSTATEDATA;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_ONLINE_STATE = "onlineState";
	@JsonProperty(JSON_PROPERTY_ONLINE_STATE)
	private EOnlineState onlineState;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPersonStateType type = EPersonStateType.VISITOR;

	public VisitorPersonStateData $type(TypeEnum $type) {
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

	public VisitorPersonStateData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The ID of the person this state data belongs to
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The ID of the person this state data belongs to")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public VisitorPersonStateData onlineState(EOnlineState onlineState) {
		this.onlineState = onlineState;
		return this;
	}

	/**
	 * Get onlineState
	 * 
	 * @return onlineState
	 **/
	@ApiModelProperty(value = "")
	public EOnlineState getOnlineState() {
		return onlineState;
	}

	public void setOnlineState(EOnlineState onlineState) {
		this.onlineState = onlineState;
	}

	public VisitorPersonStateData type(EPersonStateType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPersonStateType getType() {
		return type;
	}

	public void setType(EPersonStateType type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VisitorPersonStateData visitorPersonStateData = (VisitorPersonStateData) o;
		return Objects.equals(this.$type, visitorPersonStateData.$type) &&
				Objects.equals(this.personId, visitorPersonStateData.personId) &&
				Objects.equals(this.onlineState, visitorPersonStateData.onlineState) &&
				Objects.equals(this.type, visitorPersonStateData.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, personId, onlineState, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VisitorPersonStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    onlineState: ").append(toIndentedString(onlineState)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
