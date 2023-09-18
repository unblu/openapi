
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
 * A web API model entity to hold information about the optional webhook registration triggered by the invocation of a custom action
 */
@ApiModel(description = "A web API model entity to hold information about the optional webhook registration triggered by the invocation of a custom action")

@JsonPropertyOrder({
	CustomActionWebhookRegistration.JSON_PROPERTY_$_TYPE,
	CustomActionWebhookRegistration.JSON_PROPERTY_ENDPOINT,
	CustomActionWebhookRegistration.JSON_PROPERTY_API_VERSION,
	CustomActionWebhookRegistration.JSON_PROPERTY_SECRET,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomActionWebhookRegistration {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CUSTOMACTIONWEBHOOKREGISTRATION("CustomActionWebhookRegistration");

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
			return TypeEnum.CUSTOMACTIONWEBHOOKREGISTRATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CUSTOMACTIONWEBHOOKREGISTRATION;

	public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
	@JsonProperty(JSON_PROPERTY_ENDPOINT)
	private String endpoint;

	public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
	@JsonProperty(JSON_PROPERTY_API_VERSION)
	private EWebApiVersion apiVersion;

	public static final String JSON_PROPERTY_SECRET = "secret";
	@JsonProperty(JSON_PROPERTY_SECRET)
	private String secret;

	public CustomActionWebhookRegistration $type(TypeEnum $type) {
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

	public CustomActionWebhookRegistration endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	/**
	 * The endpoint URL of the webhook registration. Requests for the webhook events triggered by the related custom action invocation are made to this URL. Maximum
	 * length of 4000 characters. Cannot be omitted.
	 * 
	 * @return endpoint
	 **/
	@ApiModelProperty(value = "The endpoint URL of the webhook registration. Requests for the webhook events triggered by the related custom action invocation are made to this URL. Maximum length of 4000 characters. Cannot be omitted.")
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public CustomActionWebhookRegistration apiVersion(EWebApiVersion apiVersion) {
		this.apiVersion = apiVersion;
		return this;
	}

	/**
	 * Get apiVersion
	 * 
	 * @return apiVersion
	 **/
	@ApiModelProperty(value = "")
	public EWebApiVersion getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(EWebApiVersion apiVersion) {
		this.apiVersion = apiVersion;
	}

	public CustomActionWebhookRegistration secret(String secret) {
		this.secret = secret;
		return this;
	}

	/**
	 * A secret which is sent with each webhook event. Maximum length of 4000 characters. Can be omitted.
	 * 
	 * @return secret
	 **/
	@ApiModelProperty(value = "A secret which is sent with each webhook event. Maximum length of 4000 characters. Can be omitted.")
	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomActionWebhookRegistration customActionWebhookRegistration = (CustomActionWebhookRegistration) o;
		return Objects.equals(this.$type, customActionWebhookRegistration.$type) &&
				Objects.equals(this.endpoint, customActionWebhookRegistration.endpoint) &&
				Objects.equals(this.apiVersion, customActionWebhookRegistration.apiVersion) &&
				Objects.equals(this.secret, customActionWebhookRegistration.secret);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, endpoint, apiVersion, secret);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomActionWebhookRegistration {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
		sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
		sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
