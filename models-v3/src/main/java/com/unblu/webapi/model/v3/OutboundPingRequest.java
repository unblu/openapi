
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
 * Event sent when using the &#x60;ping&#x60; to test an outbound endpoint
 */
@ApiModel(description = "Event sent when using the `ping` to test an outbound endpoint")

@JsonPropertyOrder({
	OutboundPingRequest.JSON_PROPERTY_$_TYPE,
	OutboundPingRequest.JSON_PROPERTY_ACCOUNT_ID,
	OutboundPingRequest.JSON_PROPERTY_SERVICE_NAME,
	OutboundPingRequest.JSON_PROPERTY_PING_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OutboundPingRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OUTBOUNDPINGREQUEST("OutboundPingRequest");

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
			return TypeEnum.OUTBOUNDPINGREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OUTBOUNDPINGREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_PING_ID = "pingId";
	@JsonProperty(JSON_PROPERTY_PING_ID)
	private String pingId;

	public OutboundPingRequest $type(TypeEnum $type) {
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

	public OutboundPingRequest accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public OutboundPingRequest serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get serviceName
	 * 
	 * @return serviceName
	 **/
	@ApiModelProperty(value = "")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public OutboundPingRequest pingId(String pingId) {
		this.pingId = pingId;
		return this;
	}

	/**
	 * A random ID that identifies this ping request. The response to the request must have the same ID.
	 * 
	 * @return pingId
	 **/
	@ApiModelProperty(value = "A random ID that identifies this ping request. The response to the request must have the same ID.")
	public String getPingId() {
		return pingId;
	}

	public void setPingId(String pingId) {
		this.pingId = pingId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OutboundPingRequest outboundPingRequest = (OutboundPingRequest) o;
		return Objects.equals(this.$type, outboundPingRequest.$type) &&
				Objects.equals(this.accountId, outboundPingRequest.accountId) &&
				Objects.equals(this.serviceName, outboundPingRequest.serviceName) &&
				Objects.equals(this.pingId, outboundPingRequest.pingId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, pingId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OutboundPingRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    pingId: ").append(toIndentedString(pingId)).append("\n");
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
