
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * LocationParameterValue
 */

@JsonPropertyOrder({
	LocationParameterValue.JSON_PROPERTY_$_TYPE,
	LocationParameterValue.JSON_PROPERTY_ADDRESS,
	LocationParameterValue.JSON_PROPERTY_LATITUDE,
	LocationParameterValue.JSON_PROPERTY_LONGITUDE,
	LocationParameterValue.JSON_PROPERTY_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LocationParameterValue {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LOCATIONPARAMETERVALUE("LocationParameterValue");

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
			return TypeEnum.LOCATIONPARAMETERVALUE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LOCATIONPARAMETERVALUE;

	public static final String JSON_PROPERTY_ADDRESS = "address";
	@JsonProperty(JSON_PROPERTY_ADDRESS)
	private String address;

	public static final String JSON_PROPERTY_LATITUDE = "latitude";
	@JsonProperty(JSON_PROPERTY_LATITUDE)
	private Double latitude;

	public static final String JSON_PROPERTY_LONGITUDE = "longitude";
	@JsonProperty(JSON_PROPERTY_LONGITUDE)
	private Double longitude;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public LocationParameterValue $type(TypeEnum $type) {
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

	public LocationParameterValue address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Address that will appear after the &#x60;name&#x60; value, below the generic map at the top of the message. &lt;p&gt; Example: 1 Hacker Way, Menlo Park, CA
	 * 94025
	 * 
	 * @return address
	 **/
	@ApiModelProperty(value = "Address that will appear after the `name` value, below the generic map at the top of the message. <p> Example: 1 Hacker Way, Menlo Park, CA 94025")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocationParameterValue latitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * Location latitude. &lt;p&gt; Example: 37.483307
	 * 
	 * @return latitude
	 **/
	@ApiModelProperty(value = "Location latitude. <p> Example: 37.483307")
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public LocationParameterValue longitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	/**
	 * Location longitude. &lt;p&gt; Example: 122.148981
	 * 
	 * @return longitude
	 **/
	@ApiModelProperty(value = "Location longitude. <p> Example: 122.148981")
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public LocationParameterValue name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Text that will appear immediately below the generic map at the top of the message.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Text that will appear immediately below the generic map at the top of the message.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LocationParameterValue locationParameterValue = (LocationParameterValue) o;
		return Objects.equals(this.$type, locationParameterValue.$type) &&
				Objects.equals(this.address, locationParameterValue.address) &&
				Objects.equals(this.latitude, locationParameterValue.latitude) &&
				Objects.equals(this.longitude, locationParameterValue.longitude) &&
				Objects.equals(this.name, locationParameterValue.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, address, latitude, longitude, name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LocationParameterValue {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
		sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
