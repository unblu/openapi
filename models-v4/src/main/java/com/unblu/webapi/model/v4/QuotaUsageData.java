
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
 * Information on the current quota usage value and its limit
 */
@ApiModel(description = "Information on the current quota usage value and its limit")

@JsonPropertyOrder({
	QuotaUsageData.JSON_PROPERTY_$_TYPE,
	QuotaUsageData.JSON_PROPERTY_CURRENT,
	QuotaUsageData.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QuotaUsageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUOTAUSAGEDATA("QuotaUsageData");

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
			return TypeEnum.QUOTAUSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUOTAUSAGEDATA;

	public static final String JSON_PROPERTY_CURRENT = "current";
	@JsonProperty(JSON_PROPERTY_CURRENT)
	private Integer current;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private String limit;

	public QuotaUsageData $type(TypeEnum $type) {
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

	public QuotaUsageData current(Integer current) {
		this.current = current;
		return this;
	}

	/**
	 * Current usage value
	 * 
	 * @return current
	 **/
	@ApiModelProperty(value = "Current usage value")
	public Integer getCurrent() {
		return current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public QuotaUsageData limit(String limit) {
		this.limit = limit;
		return this;
	}

	/**
	 * Usage limit value
	 * 
	 * @return limit
	 **/
	@ApiModelProperty(value = "Usage limit value")
	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QuotaUsageData quotaUsageData = (QuotaUsageData) o;
		return Objects.equals(this.$type, quotaUsageData.$type) &&
				Objects.equals(this.current, quotaUsageData.current) &&
				Objects.equals(this.limit, quotaUsageData.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, current, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QuotaUsageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    current: ").append(toIndentedString(current)).append("\n");
		sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
