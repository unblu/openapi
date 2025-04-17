
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
 * Model of a webhook registration event filter.
 */
@ApiModel(description = "Model of a webhook registration event filter.")

@JsonPropertyOrder({
	WebhookRegistrationFilter.JSON_PROPERTY_$_TYPE,
	WebhookRegistrationFilter.JSON_PROPERTY_KEY,
	WebhookRegistrationFilter.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebhookRegistrationFilter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WEBHOOKREGISTRATIONFILTER("WebhookRegistrationFilter");

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
			return TypeEnum.WEBHOOKREGISTRATIONFILTER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WEBHOOKREGISTRATIONFILTER;

	public static final String JSON_PROPERTY_KEY = "key";
	@JsonProperty(JSON_PROPERTY_KEY)
	private ETypedEventFilterKey key;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public WebhookRegistrationFilter $type(TypeEnum $type) {
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

	public WebhookRegistrationFilter key(ETypedEventFilterKey key) {
		this.key = key;
		return this;
	}

	/**
	 * Get key
	 * 
	 * @return key
	 **/
	@ApiModelProperty(value = "")
	public ETypedEventFilterKey getKey() {
		return key;
	}

	public void setKey(ETypedEventFilterKey key) {
		this.key = key;
	}

	public WebhookRegistrationFilter value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * The value of the filter
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "The value of the filter")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WebhookRegistrationFilter webhookRegistrationFilter = (WebhookRegistrationFilter) o;
		return Objects.equals(this.$type, webhookRegistrationFilter.$type) &&
				Objects.equals(this.key, webhookRegistrationFilter.key) &&
				Objects.equals(this.value, webhookRegistrationFilter.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, key, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookRegistrationFilter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
