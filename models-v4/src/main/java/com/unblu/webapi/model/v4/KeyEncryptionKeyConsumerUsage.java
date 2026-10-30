
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
 * How much a single encryption consumer uses a key encryption key version.
 */
@ApiModel(description = "How much a single encryption consumer uses a key encryption key version.")

@JsonPropertyOrder({
	KeyEncryptionKeyConsumerUsage.JSON_PROPERTY_$_TYPE,
	KeyEncryptionKeyConsumerUsage.JSON_PROPERTY_DOMAIN,
	KeyEncryptionKeyConsumerUsage.JSON_PROPERTY_CONSUMER,
	KeyEncryptionKeyConsumerUsage.JSON_PROPERTY_USAGE,
	KeyEncryptionKeyConsumerUsage.JSON_PROPERTY_AVAILABILITY,
	KeyEncryptionKeyConsumerUsage.JSON_PROPERTY_UNAVAILABILITY_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class KeyEncryptionKeyConsumerUsage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		KEYENCRYPTIONKEYCONSUMERUSAGE("KeyEncryptionKeyConsumerUsage");

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
			return TypeEnum.KEYENCRYPTIONKEYCONSUMERUSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.KEYENCRYPTIONKEYCONSUMERUSAGE;

	public static final String JSON_PROPERTY_DOMAIN = "domain";
	@JsonProperty(JSON_PROPERTY_DOMAIN)
	private String domain;

	public static final String JSON_PROPERTY_CONSUMER = "consumer";
	@JsonProperty(JSON_PROPERTY_CONSUMER)
	private String consumer;

	public static final String JSON_PROPERTY_USAGE = "usage";
	@JsonProperty(JSON_PROPERTY_USAGE)
	private Long usage;

	public static final String JSON_PROPERTY_AVAILABILITY = "availability";
	@JsonProperty(JSON_PROPERTY_AVAILABILITY)
	private EKeyEncryptionKeyConsumerAvailability availability;

	public static final String JSON_PROPERTY_UNAVAILABILITY_REASON = "unavailabilityReason";
	@JsonProperty(JSON_PROPERTY_UNAVAILABILITY_REASON)
	private String unavailabilityReason;

	public KeyEncryptionKeyConsumerUsage $type(TypeEnum $type) {
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

	public KeyEncryptionKeyConsumerUsage domain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * The domain the encryption consumer belongs to, for example the component that owns it.
	 * 
	 * @return domain
	 **/
	@ApiModelProperty(value = "The domain the encryption consumer belongs to, for example the component that owns it.")
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public KeyEncryptionKeyConsumerUsage consumer(String consumer) {
		this.consumer = consumer;
		return this;
	}

	/**
	 * The name of the encryption consumer within its domain.
	 * 
	 * @return consumer
	 **/
	@ApiModelProperty(value = "The name of the encryption consumer within its domain.")
	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public KeyEncryptionKeyConsumerUsage usage(Long usage) {
		this.usage = usage;
		return this;
	}

	/**
	 * The number of this consumer&#39;s stored entities whose data encryption key is wrapped by the key encryption key version. &#x60;null&#x60; if the consumer is
	 * unavailable, because its usage is unknown then.
	 * 
	 * @return usage
	 **/
	@ApiModelProperty(value = "The number of this consumer's stored entities whose data encryption key is wrapped by the key encryption key version. `null` if the consumer is unavailable, because its usage is unknown then.")
	public Long getUsage() {
		return usage;
	}

	public void setUsage(Long usage) {
		this.usage = usage;
	}

	public KeyEncryptionKeyConsumerUsage availability(EKeyEncryptionKeyConsumerAvailability availability) {
		this.availability = availability;
		return this;
	}

	/**
	 * Get availability
	 * 
	 * @return availability
	 **/
	@ApiModelProperty(value = "")
	public EKeyEncryptionKeyConsumerAvailability getAvailability() {
		return availability;
	}

	public void setAvailability(EKeyEncryptionKeyConsumerAvailability availability) {
		this.availability = availability;
	}

	public KeyEncryptionKeyConsumerUsage unavailabilityReason(String unavailabilityReason) {
		this.unavailabilityReason = unavailabilityReason;
		return this;
	}

	/**
	 * Why the consumer is unavailable. &#x60;null&#x60; while the consumer is available.
	 * 
	 * @return unavailabilityReason
	 **/
	@ApiModelProperty(value = "Why the consumer is unavailable. `null` while the consumer is available.")
	public String getUnavailabilityReason() {
		return unavailabilityReason;
	}

	public void setUnavailabilityReason(String unavailabilityReason) {
		this.unavailabilityReason = unavailabilityReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		KeyEncryptionKeyConsumerUsage keyEncryptionKeyConsumerUsage = (KeyEncryptionKeyConsumerUsage) o;
		return Objects.equals(this.$type, keyEncryptionKeyConsumerUsage.$type) &&
				Objects.equals(this.domain, keyEncryptionKeyConsumerUsage.domain) &&
				Objects.equals(this.consumer, keyEncryptionKeyConsumerUsage.consumer) &&
				Objects.equals(this.usage, keyEncryptionKeyConsumerUsage.usage) &&
				Objects.equals(this.availability, keyEncryptionKeyConsumerUsage.availability) &&
				Objects.equals(this.unavailabilityReason, keyEncryptionKeyConsumerUsage.unavailabilityReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, domain, consumer, usage, availability, unavailabilityReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class KeyEncryptionKeyConsumerUsage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
		sb.append("    consumer: ").append(toIndentedString(consumer)).append("\n");
		sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
		sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
		sb.append("    unavailabilityReason: ").append(toIndentedString(unavailabilityReason)).append("\n");
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
