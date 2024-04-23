
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
 * RecordedMinutesData
 */

@JsonPropertyOrder({
	RecordedMinutesData.JSON_PROPERTY_$_TYPE,
	RecordedMinutesData.JSON_PROPERTY_RECORDED_MINUTES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RecordedMinutesData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RECORDEDMINUTESDATA("RecordedMinutesData");

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
			return TypeEnum.RECORDEDMINUTESDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RECORDEDMINUTESDATA;

	public static final String JSON_PROPERTY_RECORDED_MINUTES = "recordedMinutes";
	@JsonProperty(JSON_PROPERTY_RECORDED_MINUTES)
	private Long recordedMinutes;

	public RecordedMinutesData $type(TypeEnum $type) {
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

	public RecordedMinutesData recordedMinutes(Long recordedMinutes) {
		this.recordedMinutes = recordedMinutes;
		return this;
	}

	/**
	 * The number of recorded minutes
	 * 
	 * @return recordedMinutes
	 **/
	@ApiModelProperty(value = "The number of recorded minutes")
	public Long getRecordedMinutes() {
		return recordedMinutes;
	}

	public void setRecordedMinutes(Long recordedMinutes) {
		this.recordedMinutes = recordedMinutes;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RecordedMinutesData recordedMinutesData = (RecordedMinutesData) o;
		return Objects.equals(this.$type, recordedMinutesData.$type) &&
				Objects.equals(this.recordedMinutes, recordedMinutesData.recordedMinutes);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, recordedMinutes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecordedMinutesData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    recordedMinutes: ").append(toIndentedString(recordedMinutes)).append("\n");
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
