
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;authenticatorCheckPasswordAgainstPolicy&#39; operation
 */
@ApiModel(description = "Request Body for the 'authenticatorCheckPasswordAgainstPolicy' operation")

@JsonPropertyOrder({
	AuthenticatorCheckPasswordAgainstPolicyBody.JSON_PROPERTY_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorCheckPasswordAgainstPolicyBody {
	public static final String JSON_PROPERTY_PASSWORD = "password";
	@JsonProperty(JSON_PROPERTY_PASSWORD)
	private String password;

	public AuthenticatorCheckPasswordAgainstPolicyBody password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Password to check against policy
	 * 
	 * @return password
	 **/
	@ApiModelProperty(value = "Password to check against policy")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticatorCheckPasswordAgainstPolicyBody authenticatorCheckPasswordAgainstPolicyBody = (AuthenticatorCheckPasswordAgainstPolicyBody) o;
		return Objects.equals(this.password, authenticatorCheckPasswordAgainstPolicyBody.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorCheckPasswordAgainstPolicyBody {\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
