
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * OutboundPingResponse
 */

@JsonPropertyOrder({
	OutboundPingResponse.JSON_PROPERTY_$_TYPE,
	OutboundPingResponse.JSON_PROPERTY_PING_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OutboundPingResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OUTBOUNDPINGRESPONSE("OutboundPingResponse");

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
			return TypeEnum.OUTBOUNDPINGRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OUTBOUNDPINGRESPONSE;

	public static final String JSON_PROPERTY_PING_ID = "pingId";
	@JsonProperty(JSON_PROPERTY_PING_ID)
	private String pingId;

	public OutboundPingResponse $type(TypeEnum $type) {
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

	public OutboundPingResponse pingId(String pingId) {
		this.pingId = pingId;
		return this;
	}

	/**
	 * The pingId of the request this event is responding to
	 * 
	 * @return pingId
	 **/
	@ApiModelProperty(value = "The pingId of the request this event is responding to")
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
		OutboundPingResponse outboundPingResponse = (OutboundPingResponse) o;
		return Objects.equals(this.$type, outboundPingResponse.$type) &&
				Objects.equals(this.pingId, outboundPingResponse.pingId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, pingId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OutboundPingResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
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
