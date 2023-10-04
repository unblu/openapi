
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
 * Event triggered when a file upload interceptor rejects a file upload
 */
@ApiModel(description = "Event triggered when a file upload interceptor rejects a file upload")

@JsonPropertyOrder({
	InterceptorFileRejectedEvent.JSON_PROPERTY_$_TYPE,
	InterceptorFileRejectedEvent.JSON_PROPERTY_TIMESTAMP,
	InterceptorFileRejectedEvent.JSON_PROPERTY_EVENT_TYPE,
	InterceptorFileRejectedEvent.JSON_PROPERTY_ACCOUNT_ID,
	InterceptorFileRejectedEvent.JSON_PROPERTY_NAME,
	InterceptorFileRejectedEvent.JSON_PROPERTY_MIME_TYPE,
	InterceptorFileRejectedEvent.JSON_PROPERTY_LENGTH,
	InterceptorFileRejectedEvent.JSON_PROPERTY_INTERCEPTOR_ID,
	InterceptorFileRejectedEvent.JSON_PROPERTY_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InterceptorFileRejectedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		INTERCEPTORFILEREJECTEDEVENT("InterceptorFileRejectedEvent");

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
			return TypeEnum.INTERCEPTORFILEREJECTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.INTERCEPTORFILEREJECTEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	private String mimeType;

	public static final String JSON_PROPERTY_LENGTH = "length";
	@JsonProperty(JSON_PROPERTY_LENGTH)
	private Long length;

	public static final String JSON_PROPERTY_INTERCEPTOR_ID = "interceptorId";
	@JsonProperty(JSON_PROPERTY_INTERCEPTOR_ID)
	private String interceptorId;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private String reason;

	public InterceptorFileRejectedEvent $type(TypeEnum $type) {
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

	public InterceptorFileRejectedEvent timestamp(Long timestamp) {
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

	public InterceptorFileRejectedEvent eventType(String eventType) {
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

	public InterceptorFileRejectedEvent accountId(String accountId) {
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

	public InterceptorFileRejectedEvent name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the file
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the file")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InterceptorFileRejectedEvent mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * The file&#39;s MIME type
	 * 
	 * @return mimeType
	 **/
	@ApiModelProperty(value = "The file's MIME type")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public InterceptorFileRejectedEvent length(Long length) {
		this.length = length;
		return this;
	}

	/**
	 * The length, or size, of the file in bytes
	 * 
	 * @return length
	 **/
	@ApiModelProperty(value = "The length, or size, of the file in bytes")
	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public InterceptorFileRejectedEvent interceptorId(String interceptorId) {
		this.interceptorId = interceptorId;
		return this;
	}

	/**
	 * The ID of the file upload interceptor that rejected the file upload
	 * 
	 * @return interceptorId
	 **/
	@ApiModelProperty(value = "The ID of the file upload interceptor that rejected the file upload")
	public String getInterceptorId() {
		return interceptorId;
	}

	public void setInterceptorId(String interceptorId) {
		this.interceptorId = interceptorId;
	}

	public InterceptorFileRejectedEvent reason(String reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * The reason the file upload was rejected
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "The reason the file upload was rejected")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InterceptorFileRejectedEvent interceptorFileRejectedEvent = (InterceptorFileRejectedEvent) o;
		return Objects.equals(this.$type, interceptorFileRejectedEvent.$type) &&
				Objects.equals(this.timestamp, interceptorFileRejectedEvent.timestamp) &&
				Objects.equals(this.eventType, interceptorFileRejectedEvent.eventType) &&
				Objects.equals(this.accountId, interceptorFileRejectedEvent.accountId) &&
				Objects.equals(this.name, interceptorFileRejectedEvent.name) &&
				Objects.equals(this.mimeType, interceptorFileRejectedEvent.mimeType) &&
				Objects.equals(this.length, interceptorFileRejectedEvent.length) &&
				Objects.equals(this.interceptorId, interceptorFileRejectedEvent.interceptorId) &&
				Objects.equals(this.reason, interceptorFileRejectedEvent.reason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, name, mimeType, length, interceptorId, reason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InterceptorFileRejectedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    length: ").append(toIndentedString(length)).append("\n");
		sb.append("    interceptorId: ").append(toIndentedString(interceptorId)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
