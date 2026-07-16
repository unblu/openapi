
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
 * Verify step 2 request: proof-of-possession for an existing device binding (&#x60;IDeviceBindingService.verify&#x60;).
 */
@ApiModel(description = "Verify step 2 request: proof-of-possession for an existing device binding (`IDeviceBindingService.verify`).")

@JsonPropertyOrder({
	DeviceBindingVerifyRequest.JSON_PROPERTY_$_TYPE,
	DeviceBindingVerifyRequest.JSON_PROPERTY_BINDING_ID,
	DeviceBindingVerifyRequest.JSON_PROPERTY_SIGNATURE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceBindingVerifyRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEBINDINGVERIFYREQUEST("DeviceBindingVerifyRequest");

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
			return TypeEnum.DEVICEBINDINGVERIFYREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEBINDINGVERIFYREQUEST;

	public static final String JSON_PROPERTY_BINDING_ID = "bindingId";
	@JsonProperty(JSON_PROPERTY_BINDING_ID)
	private String bindingId;

	public static final String JSON_PROPERTY_SIGNATURE = "signature";
	@JsonProperty(JSON_PROPERTY_SIGNATURE)
	private String signature;

	public DeviceBindingVerifyRequest $type(TypeEnum $type) {
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

	public DeviceBindingVerifyRequest bindingId(String bindingId) {
		this.bindingId = bindingId;
		return this;
	}

	/**
	 * ID of the device binding being verified; the caller&#39;s session must own it.
	 * 
	 * @return bindingId
	 **/
	@ApiModelProperty(value = "ID of the device binding being verified; the caller's session must own it.")
	public String getBindingId() {
		return bindingId;
	}

	public void setBindingId(String bindingId) {
		this.bindingId = bindingId;
	}

	public DeviceBindingVerifyRequest signature(String signature) {
		this.signature = signature;
		return this;
	}

	/**
	 * Base64-encoded signature over the server-issued challenge, produced with the bound private key.
	 * 
	 * @return signature
	 **/
	@ApiModelProperty(value = "Base64-encoded signature over the server-issued challenge, produced with the bound private key.")
	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceBindingVerifyRequest deviceBindingVerifyRequest = (DeviceBindingVerifyRequest) o;
		return Objects.equals(this.$type, deviceBindingVerifyRequest.$type) &&
				Objects.equals(this.bindingId, deviceBindingVerifyRequest.bindingId) &&
				Objects.equals(this.signature, deviceBindingVerifyRequest.signature);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, bindingId, signature);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceBindingVerifyRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    bindingId: ").append(toIndentedString(bindingId)).append("\n");
		sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
