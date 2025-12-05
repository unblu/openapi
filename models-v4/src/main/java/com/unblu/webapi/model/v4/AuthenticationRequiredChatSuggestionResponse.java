
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
 * Model that represents the response to a chat suggestion request when authentication is required
 */
@ApiModel(description = "Model that represents the response to a chat suggestion request when authentication is required")

@JsonPropertyOrder({
	AuthenticationRequiredChatSuggestionResponse.JSON_PROPERTY_$_TYPE,
	AuthenticationRequiredChatSuggestionResponse.JSON_PROPERTY_TYPE,
	AuthenticationRequiredChatSuggestionResponse.JSON_PROPERTY_AUTHENTICATION_URL,
	AuthenticationRequiredChatSuggestionResponse.JSON_PROPERTY_DID_PREVIOUS_ATTEMPT_FAILED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticationRequiredChatSuggestionResponse implements ChatSuggestionResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AUTHENTICATIONREQUIREDCHATSUGGESTIONRESPONSE("AuthenticationRequiredChatSuggestionResponse");

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
			return TypeEnum.AUTHENTICATIONREQUIREDCHATSUGGESTIONRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AUTHENTICATIONREQUIREDCHATSUGGESTIONRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EChatSuggestionResponseType type = EChatSuggestionResponseType.AUTHENTICATION_REQUIRED;

	public static final String JSON_PROPERTY_AUTHENTICATION_URL = "authenticationUrl";
	@JsonProperty(JSON_PROPERTY_AUTHENTICATION_URL)
	private String authenticationUrl;

	public static final String JSON_PROPERTY_DID_PREVIOUS_ATTEMPT_FAILED = "didPreviousAttemptFailed";
	@JsonProperty(JSON_PROPERTY_DID_PREVIOUS_ATTEMPT_FAILED)
	private Boolean didPreviousAttemptFailed;

	public AuthenticationRequiredChatSuggestionResponse $type(TypeEnum $type) {
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

	public AuthenticationRequiredChatSuggestionResponse type(EChatSuggestionResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EChatSuggestionResponseType getType() {
		return type;
	}

	public void setType(EChatSuggestionResponseType type) {
		this.type = type;
	}

	public AuthenticationRequiredChatSuggestionResponse authenticationUrl(String authenticationUrl) {
		this.authenticationUrl = authenticationUrl;
		return this;
	}

	/**
	 * Get authenticationUrl
	 * 
	 * @return authenticationUrl
	 **/
	@ApiModelProperty(value = "")
	public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	public void setAuthenticationUrl(String authenticationUrl) {
		this.authenticationUrl = authenticationUrl;
	}

	public AuthenticationRequiredChatSuggestionResponse didPreviousAttemptFailed(Boolean didPreviousAttemptFailed) {
		this.didPreviousAttemptFailed = didPreviousAttemptFailed;
		return this;
	}

	/**
	 * Get didPreviousAttemptFailed
	 * 
	 * @return didPreviousAttemptFailed
	 **/
	@ApiModelProperty(value = "")
	public Boolean isDidPreviousAttemptFailed() {
		return didPreviousAttemptFailed;
	}

	public void setDidPreviousAttemptFailed(Boolean didPreviousAttemptFailed) {
		this.didPreviousAttemptFailed = didPreviousAttemptFailed;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticationRequiredChatSuggestionResponse authenticationRequiredChatSuggestionResponse = (AuthenticationRequiredChatSuggestionResponse) o;
		return Objects.equals(this.$type, authenticationRequiredChatSuggestionResponse.$type) &&
				Objects.equals(this.type, authenticationRequiredChatSuggestionResponse.type) &&
				Objects.equals(this.authenticationUrl, authenticationRequiredChatSuggestionResponse.authenticationUrl) &&
				Objects.equals(this.didPreviousAttemptFailed, authenticationRequiredChatSuggestionResponse.didPreviousAttemptFailed);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, authenticationUrl, didPreviousAttemptFailed);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticationRequiredChatSuggestionResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
		sb.append("    didPreviousAttemptFailed: ").append(toIndentedString(didPreviousAttemptFailed)).append("\n");
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
