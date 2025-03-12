
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
 * Model of a branch client token result
 */
@ApiModel(description = "Model of a branch client token result")

@JsonPropertyOrder({
	BranchClientTokenResult.JSON_PROPERTY_$_TYPE,
	BranchClientTokenResult.JSON_PROPERTY_TOKEN,
	BranchClientTokenResult.JSON_PROPERTY_EXPIRES_AT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientTokenResult {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTTOKENRESULT("BranchClientTokenResult");

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
			return TypeEnum.BRANCHCLIENTTOKENRESULT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTTOKENRESULT;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
	@JsonProperty(JSON_PROPERTY_EXPIRES_AT)
	private Long expiresAt;

	public BranchClientTokenResult $type(TypeEnum $type) {
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

	public BranchClientTokenResult token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Generated JWT token
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "Generated JWT token")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public BranchClientTokenResult expiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
		return this;
	}

	/**
	 * Expiration date of the token, in Unix timestamp format (0 -&gt; doesn&#39;t expire)
	 * 
	 * @return expiresAt
	 **/
	@ApiModelProperty(value = "Expiration date of the token, in Unix timestamp format (0 -> doesn't expire)")
	public Long getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientTokenResult branchClientTokenResult = (BranchClientTokenResult) o;
		return Objects.equals(this.$type, branchClientTokenResult.$type) &&
				Objects.equals(this.token, branchClientTokenResult.token) &&
				Objects.equals(this.expiresAt, branchClientTokenResult.expiresAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, token, expiresAt);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientTokenResult {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
