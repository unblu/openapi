
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
 * LoginResult
 */

@JsonPropertyOrder({
	LoginResult.JSON_PROPERTY_$_TYPE,
	LoginResult.JSON_PROPERTY_SUCCESS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LoginResult {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LOGINRESULT("LoginResult");

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
			return TypeEnum.LOGINRESULT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LOGINRESULT;

	public static final String JSON_PROPERTY_SUCCESS = "success";
	@JsonProperty(JSON_PROPERTY_SUCCESS)
	private Boolean success;

	public LoginResult $type(TypeEnum $type) {
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

	public LoginResult success(Boolean success) {
		this.success = success;
		return this;
	}

	/**
	 * Whether or not the authentication operation was successful
	 * 
	 * @return success
	 **/
	@ApiModelProperty(value = "Whether or not the authentication operation was successful")
	public Boolean isSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoginResult loginResult = (LoginResult) o;
		return Objects.equals(this.$type, loginResult.$type) &&
				Objects.equals(this.success, loginResult.success);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, success);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoginResult {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
