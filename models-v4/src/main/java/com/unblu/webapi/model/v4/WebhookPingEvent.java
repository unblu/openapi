
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
 * Event send when using the &#x60;ping&#x60; to test a webhook
 */
@ApiModel(description = "Event send when using the `ping` to test a webhook")

@JsonPropertyOrder({
	WebhookPingEvent.JSON_PROPERTY_$_TYPE,
	WebhookPingEvent.JSON_PROPERTY_TIMESTAMP,
	WebhookPingEvent.JSON_PROPERTY_EVENT_TYPE,
	WebhookPingEvent.JSON_PROPERTY_ACCOUNT_ID,
	WebhookPingEvent.JSON_PROPERTY_WEBHOOK_CONFIGURATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebhookPingEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WEBHOOKPINGEVENT("WebhookPingEvent");

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
			return TypeEnum.WEBHOOKPINGEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WEBHOOKPINGEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_WEBHOOK_CONFIGURATION = "webhookConfiguration";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIGURATION)
	private WebhookRegistration webhookConfiguration = null;

	public WebhookPingEvent $type(TypeEnum $type) {
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

	public WebhookPingEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public WebhookPingEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public WebhookPingEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public WebhookPingEvent webhookConfiguration(WebhookRegistration webhookConfiguration) {
		this.webhookConfiguration = webhookConfiguration;
		return this;
	}

	/**
	 * Get webhookConfiguration
	 * 
	 * @return webhookConfiguration
	 **/
	@ApiModelProperty(value = "")
	public WebhookRegistration getWebhookConfiguration() {
		return webhookConfiguration;
	}

	public void setWebhookConfiguration(WebhookRegistration webhookConfiguration) {
		this.webhookConfiguration = webhookConfiguration;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WebhookPingEvent webhookPingEvent = (WebhookPingEvent) o;
		return Objects.equals(this.$type, webhookPingEvent.$type) &&
				Objects.equals(this.timestamp, webhookPingEvent.timestamp) &&
				Objects.equals(this.eventType, webhookPingEvent.eventType) &&
				Objects.equals(this.accountId, webhookPingEvent.accountId) &&
				Objects.equals(this.webhookConfiguration, webhookPingEvent.webhookConfiguration);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, webhookConfiguration);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookPingEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    webhookConfiguration: ").append(toIndentedString(webhookConfiguration)).append("\n");
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
