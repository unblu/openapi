
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
 * HasPasswordData
 */

@JsonPropertyOrder({
	HasPasswordData.JSON_PROPERTY_$_TYPE,
	HasPasswordData.JSON_PROPERTY_HAS_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class HasPasswordData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		HASPASSWORDDATA("HasPasswordData");

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
			return TypeEnum.HASPASSWORDDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.HASPASSWORDDATA;

	public static final String JSON_PROPERTY_HAS_PASSWORD = "hasPassword";
	@JsonProperty(JSON_PROPERTY_HAS_PASSWORD)
	private Boolean hasPassword;

	public HasPasswordData $type(TypeEnum $type) {
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

	public HasPasswordData hasPassword(Boolean hasPassword) {
		this.hasPassword = hasPassword;
		return this;
	}

	/**
	 * Whether or not the user has a password
	 * 
	 * @return hasPassword
	 **/
	@ApiModelProperty(value = "Whether or not the user has a password")
	public Boolean isHasPassword() {
		return hasPassword;
	}

	public void setHasPassword(Boolean hasPassword) {
		this.hasPassword = hasPassword;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HasPasswordData hasPasswordData = (HasPasswordData) o;
		return Objects.equals(this.$type, hasPasswordData.$type) &&
				Objects.equals(this.hasPassword, hasPasswordData.hasPassword);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, hasPassword);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HasPasswordData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
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
