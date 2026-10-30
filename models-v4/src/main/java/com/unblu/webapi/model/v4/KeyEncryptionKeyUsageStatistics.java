
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * How much a key encryption key version is used overall, broken down by encryption consumer.
 */
@ApiModel(description = "How much a key encryption key version is used overall, broken down by encryption consumer.")

@JsonPropertyOrder({
	KeyEncryptionKeyUsageStatistics.JSON_PROPERTY_$_TYPE,
	KeyEncryptionKeyUsageStatistics.JSON_PROPERTY_ENTRIES,
	KeyEncryptionKeyUsageStatistics.JSON_PROPERTY_TOTAL_USAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class KeyEncryptionKeyUsageStatistics {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		KEYENCRYPTIONKEYUSAGESTATISTICS("KeyEncryptionKeyUsageStatistics");

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
			return TypeEnum.KEYENCRYPTIONKEYUSAGESTATISTICS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.KEYENCRYPTIONKEYUSAGESTATISTICS;

	public static final String JSON_PROPERTY_ENTRIES = "entries";
	@JsonProperty(JSON_PROPERTY_ENTRIES)
	private List<KeyEncryptionKeyConsumerUsage> entries = null;

	public static final String JSON_PROPERTY_TOTAL_USAGE = "totalUsage";
	@JsonProperty(JSON_PROPERTY_TOTAL_USAGE)
	private Long totalUsage;

	public KeyEncryptionKeyUsageStatistics $type(TypeEnum $type) {
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

	public KeyEncryptionKeyUsageStatistics entries(List<KeyEncryptionKeyConsumerUsage> entries) {
		this.entries = entries;
		return this;
	}

	public KeyEncryptionKeyUsageStatistics addEntriesItem(KeyEncryptionKeyConsumerUsage entriesItem) {
		if (this.entries == null) {
			this.entries = new ArrayList<>();
		}
		this.entries.add(entriesItem);
		return this;
	}

	/**
	 * One entry per encryption consumer, including the consumers that couldn&#39;t be reached.
	 * 
	 * @return entries
	 **/
	@ApiModelProperty(value = "One entry per encryption consumer, including the consumers that couldn't be reached.")
	public List<KeyEncryptionKeyConsumerUsage> getEntries() {
		return entries;
	}

	public void setEntries(List<KeyEncryptionKeyConsumerUsage> entries) {
		this.entries = entries;
	}

	public KeyEncryptionKeyUsageStatistics totalUsage(Long totalUsage) {
		this.totalUsage = totalUsage;
		return this;
	}

	/**
	 * The number of stored entities across all reported encryption consumers whose data encryption key is wrapped by the key encryption key version.
	 * &#x60;null&#x60; while any consumer is unavailable, because the total is unknown then.
	 * 
	 * @return totalUsage
	 **/
	@ApiModelProperty(value = "The number of stored entities across all reported encryption consumers whose data encryption key is wrapped by the key encryption key version. `null` while any consumer is unavailable, because the total is unknown then.")
	public Long getTotalUsage() {
		return totalUsage;
	}

	public void setTotalUsage(Long totalUsage) {
		this.totalUsage = totalUsage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		KeyEncryptionKeyUsageStatistics keyEncryptionKeyUsageStatistics = (KeyEncryptionKeyUsageStatistics) o;
		return Objects.equals(this.$type, keyEncryptionKeyUsageStatistics.$type) &&
				Objects.equals(this.entries, keyEncryptionKeyUsageStatistics.entries) &&
				Objects.equals(this.totalUsage, keyEncryptionKeyUsageStatistics.totalUsage);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, entries, totalUsage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class KeyEncryptionKeyUsageStatistics {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
		sb.append("    totalUsage: ").append(toIndentedString(totalUsage)).append("\n");
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
