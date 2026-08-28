
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
 * GeoLocation
 */

@JsonPropertyOrder({
	GeoLocation.JSON_PROPERTY_$_TYPE,
	GeoLocation.JSON_PROPERTY_CONTINENT,
	GeoLocation.JSON_PROPERTY_COUNTRY,
	GeoLocation.JSON_PROPERTY_STATE,
	GeoLocation.JSON_PROPERTY_CITY,
	GeoLocation.JSON_PROPERTY_USER_AGENT_TIME_ZONE,
	GeoLocation.JSON_PROPERTY_LONGITUDE,
	GeoLocation.JSON_PROPERTY_LATITUDE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class GeoLocation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		GEOLOCATION("GeoLocation");

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
			return TypeEnum.GEOLOCATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.GEOLOCATION;

	public static final String JSON_PROPERTY_CONTINENT = "continent";
	@JsonProperty(JSON_PROPERTY_CONTINENT)
	private String continent;

	public static final String JSON_PROPERTY_COUNTRY = "country";
	@JsonProperty(JSON_PROPERTY_COUNTRY)
	private String country;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private String state;

	public static final String JSON_PROPERTY_CITY = "city";
	@JsonProperty(JSON_PROPERTY_CITY)
	private String city;

	public static final String JSON_PROPERTY_USER_AGENT_TIME_ZONE = "userAgentTimeZone";
	@JsonProperty(JSON_PROPERTY_USER_AGENT_TIME_ZONE)
	private String userAgentTimeZone;

	public static final String JSON_PROPERTY_LONGITUDE = "longitude";
	@JsonProperty(JSON_PROPERTY_LONGITUDE)
	private Double longitude;

	public static final String JSON_PROPERTY_LATITUDE = "latitude";
	@JsonProperty(JSON_PROPERTY_LATITUDE)
	private Double latitude;

	public GeoLocation $type(TypeEnum $type) {
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

	public GeoLocation continent(String continent) {
		this.continent = continent;
		return this;
	}

	/**
	 * Get continent
	 * 
	 * @return continent
	 **/
	@ApiModelProperty(value = "")
	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public GeoLocation country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Get country
	 * 
	 * @return country
	 **/
	@ApiModelProperty(value = "")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public GeoLocation state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public GeoLocation city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Get city
	 * 
	 * @return city
	 **/
	@ApiModelProperty(value = "")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public GeoLocation userAgentTimeZone(String userAgentTimeZone) {
		this.userAgentTimeZone = userAgentTimeZone;
		return this;
	}

	/**
	 * Get userAgentTimeZone
	 * 
	 * @return userAgentTimeZone
	 **/
	@ApiModelProperty(value = "")
	public String getUserAgentTimeZone() {
		return userAgentTimeZone;
	}

	public void setUserAgentTimeZone(String userAgentTimeZone) {
		this.userAgentTimeZone = userAgentTimeZone;
	}

	public GeoLocation longitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	/**
	 * Get longitude
	 * 
	 * @return longitude
	 **/
	@ApiModelProperty(value = "")
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public GeoLocation latitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * Get latitude
	 * 
	 * @return latitude
	 **/
	@ApiModelProperty(value = "")
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GeoLocation geoLocation = (GeoLocation) o;
		return Objects.equals(this.$type, geoLocation.$type) &&
				Objects.equals(this.continent, geoLocation.continent) &&
				Objects.equals(this.country, geoLocation.country) &&
				Objects.equals(this.state, geoLocation.state) &&
				Objects.equals(this.city, geoLocation.city) &&
				Objects.equals(this.userAgentTimeZone, geoLocation.userAgentTimeZone) &&
				Objects.equals(this.longitude, geoLocation.longitude) &&
				Objects.equals(this.latitude, geoLocation.latitude);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, continent, country, state, city, userAgentTimeZone, longitude, latitude);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GeoLocation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    userAgentTimeZone: ").append(toIndentedString(userAgentTimeZone)).append("\n");
		sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
		sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
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
